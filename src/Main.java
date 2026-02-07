import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Main extends Application {
    Page[] pages;
    BorderPane main;
    Data data;
    IntegerProperty activePage = new SimpleIntegerProperty(0);

    @Override
    public void start(Stage stage) throws Exception {
        // Load scene and initial pane creation (needed by later setup functions)
        main = new BorderPane();
        Scene scene = new Scene(main, 1050, 600, Color.BEIGE);
        stage.setTitle("Husky DroneView 0.1");
        stage.setScene(scene);

        // Load systems
        data = new Data();

        // Load styling
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());

        // Load pages
        Page flightPage = new FlightPage(data);

        pages = new Page[1]; // Replace magic number (# of pages)
        pages[0] = flightPage;

        // Main pane setup
        main.setTop(navbar());

        // Load start page
        selectPage(0);
        
        // Show scene
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void selectPage(int pageIndex) {
        activePage.set(pageIndex);
        main.setCenter(pages[activePage.get()].getPane());
    }

    // Navbar loader
    private ToolBar navbar() {
        ToolBar toolbar_ = new ToolBar();

        final Pane leftSpacer = new Pane();
        HBox.setHgrow(
                leftSpacer,
                Priority.SOMETIMES
        );

        final Pane rightSpacer = new Pane();
        HBox.setHgrow(
                rightSpacer,
                Priority.SOMETIMES
        );

        Button navbarButtons[] = {
            new Button("Connection"),
            new Button("Calibration"),
            new Button("Review"),
            new Button("Flight"),
            new Button("Telemetry"),
            new Button("Camera")
        };

        for(int i = 0; i < navbarButtons.length; i++) {
            final int index = i;

            navbarButtons[index].setOnAction(e -> selectPage(index)); // Set button function
            navbarButtons[index].backgroundProperty().bind(
                    Bindings.createObjectBinding(
                            () -> activePage.get() == index 
                                ? new Background(new BackgroundFill(
                                Color.web("#6be09c"), 
                                new CornerRadii(8), null))
                                : new Background(new BackgroundFill(
                                Color.web("#313131"), 
                                new CornerRadii(8), null)),
                                activePage ));

            navbarButtons[index].getStyleClass().add("toolbar-button");

            toolbar_.getItems().add(navbarButtons[index]);
        }

        toolbar_.getItems().add(3, new Separator());
        toolbar_.getItems().add(0, leftSpacer);
        toolbar_.getItems().add(rightSpacer);

        return toolbar_;
    }
}
