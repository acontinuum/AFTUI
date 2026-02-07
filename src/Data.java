import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

// Class for storing telemetry and drone data for other classes to access
public class Data {
    // --------------
    // STATE
    // --------------
    private BooleanProperty DRONE_ARMED = new SimpleBooleanProperty();
    private BooleanProperty CONNECTED_TO_DRONE = new SimpleBooleanProperty();
    // --------------
    // VARIABLES
    // --------------

    // General Properties
    private StringProperty DRONE_NAME = new SimpleStringProperty();

    // Drone Kinematics
    private DoubleProperty DRONE_ALTITUDE = new SimpleDoubleProperty();
    private DoubleProperty DRONE_SPEED = new SimpleDoubleProperty();
    private ListProperty<Integer> DRONE_POSITION_RELATIVE = new SimpleListProperty<>(FXCollections.observableArrayList());
    private ListProperty<Integer> DRONE_POSITION_GLOBAL = new SimpleListProperty<>(FXCollections.observableArrayList());
    private ListProperty<Integer> DRONE_ATTITUDE = new SimpleListProperty<>(FXCollections.observableArrayList());
    private ListProperty<Integer> DRONE_VELOCITY = new SimpleListProperty<>(FXCollections.observableArrayList());
    private ListProperty<Integer> DRONE_ACCELERATION = new SimpleListProperty<>(FXCollections.observableArrayList());

    // Drone Battery
    private DoubleProperty DRONE_BAT_MAX_CAPACITY = new SimpleDoubleProperty();
    private DoubleProperty DRONE_BAT_CAPACITY = new SimpleDoubleProperty();
    private DoubleProperty DRONE_MOTOR_VOLTAGE_DRAW = new SimpleDoubleProperty();

    // Radio
    private DoubleProperty RADIO_CONNECTION_BANDWIDTH = new SimpleDoubleProperty();
    
    // Flight
    private DoubleProperty FLIGHT_ELAPSED_TIME_MS = new SimpleDoubleProperty();
    private StringProperty FLIGHT_ELAPSED_TIME_STRING_REP = new SimpleStringProperty();
    private DoubleProperty FLIGHT_NEXT_TARGET_DIST = new SimpleDoubleProperty();
    private StringProperty FLIGHT_NAME = new SimpleStringProperty();
    private StringProperty FLIGHT_STATUS = new SimpleStringProperty();
    
    // Misc 
    private BooleanProperty PAYLOAD_STATUS = new SimpleBooleanProperty();

    // --------------
    // GETTERS/SETTERS
    // --------------

    // State Information
    public boolean isConnectedToDrone() { return CONNECTED_TO_DRONE.get(); }
    public void setConnectedToDrone(boolean value) { CONNECTED_TO_DRONE.set(value); }
    public BooleanProperty connectedToDroneProperty() { return CONNECTED_TO_DRONE; }

    public boolean isDroneArmed() { return DRONE_ARMED.get(); }
    public void setDroneArmed(boolean value) { DRONE_ARMED.set(value); }
    public BooleanProperty droneArmedProperty() { return DRONE_ARMED; }

    // General Properties
    public String getDroneName() { return DRONE_NAME.get(); }
    public void setDroneName(String value) { DRONE_NAME.set(value); }
    public StringProperty droneNameProperty() { return DRONE_NAME; }

    // Drone Kinematics
    public double getDroneAltitude() { return DRONE_ALTITUDE.get(); }
    public void setDroneAltitude(double value) { DRONE_ALTITUDE.set(value); }
    public DoubleProperty droneAltitudeProperty() { return DRONE_ALTITUDE; }

    public double getDroneSpeed() { return DRONE_SPEED.get(); }
    public void setDroneSpeed(double value) { DRONE_SPEED.set(value); }
    public DoubleProperty droneSpeedProperty() { return DRONE_SPEED; }

    public ObservableList<Integer> getDronePositionRelative() { return DRONE_POSITION_RELATIVE.get(); }
    public void setDronePositionRelative(ObservableList<Integer> value) { DRONE_POSITION_RELATIVE.set(value); }
    public ListProperty<Integer> dronePositionRelativeProperty() { return DRONE_POSITION_RELATIVE; }

    public ObservableList<Integer> getDronePositionGlobal() { return DRONE_POSITION_GLOBAL.get(); }
    public void setDronePositionGlobal(ObservableList<Integer> value) { DRONE_POSITION_GLOBAL.set(value); }
    public ListProperty<Integer> dronePositionGlobalProperty() { return DRONE_POSITION_GLOBAL; }

    public ObservableList<Integer> getDroneAttitude() { return DRONE_ATTITUDE.get(); }
    public void setDroneAttitude(ObservableList<Integer> value) { DRONE_ATTITUDE.set(value); }
    public ListProperty<Integer> droneAttitudeProperty() { return DRONE_ATTITUDE; }

    public ObservableList<Integer> getDroneVelocity() { return DRONE_VELOCITY.get(); }
    public void setDroneVelocity(ObservableList<Integer> value) { DRONE_VELOCITY.set(value); }
    public ListProperty<Integer> droneVelocityProperty() { return DRONE_VELOCITY; }

    public ObservableList<Integer> getDroneAcceleration() { return DRONE_ACCELERATION.get(); }
    public void setDroneAcceleration(ObservableList<Integer> value) { DRONE_ACCELERATION.set(value); }
    public ListProperty<Integer> droneAccelerationProperty() { return DRONE_ACCELERATION; }

    // Drone Battery
    public double getDroneBatMaxCapacity() { return DRONE_BAT_MAX_CAPACITY.get(); }
    public void setDroneBatMaxCapacity(double value) { DRONE_BAT_MAX_CAPACITY.set(value); }
    public DoubleProperty droneBatMaxCapacityProperty() { return DRONE_BAT_MAX_CAPACITY; }

    public double getDroneBatCapacity() { return DRONE_BAT_CAPACITY.get(); }
    public void setDroneBatCapacity(double value) { DRONE_BAT_CAPACITY.set(value); }
    public DoubleProperty droneBatCapacityProperty() { return DRONE_BAT_CAPACITY; }

    public double getDroneMotorVoltageDraw() { return DRONE_MOTOR_VOLTAGE_DRAW.get(); }
    public void setDroneMotorVoltageDraw(double value) { DRONE_MOTOR_VOLTAGE_DRAW.set(value); }
    public DoubleProperty droneMotorVoltageDrawProperty() { return DRONE_MOTOR_VOLTAGE_DRAW; }

    // Radio
    public double getRadioConnectionBandwidth() { return RADIO_CONNECTION_BANDWIDTH.get(); }
    public void setRadioConnectionBandwidth(double value) { RADIO_CONNECTION_BANDWIDTH.set(value); }
    public DoubleProperty radioConnectionBandwidthProperty() { return RADIO_CONNECTION_BANDWIDTH; }

    // Flight
    public double getFlightElapsedTimeMs() { return FLIGHT_ELAPSED_TIME_MS.get(); }
    public void setFlightElapsedTimeMs(double value) { FLIGHT_ELAPSED_TIME_MS.set(value); }
    public DoubleProperty flightElapsedTimeMsProperty() { return FLIGHT_ELAPSED_TIME_MS; }

    public String getFlightElapsedTimeStringRep() { return FLIGHT_ELAPSED_TIME_STRING_REP.get(); }
    public void setFlightElapsedTimeStringRep(String value) { FLIGHT_ELAPSED_TIME_STRING_REP.set(value); }
    public StringProperty flightElapsedTimeStringRepProperty() { return FLIGHT_ELAPSED_TIME_STRING_REP; }

    public double getFlightNextTargetDist() { return FLIGHT_NEXT_TARGET_DIST.get(); }
    public void setFlightNextTargetDist(double value) { FLIGHT_NEXT_TARGET_DIST.set(value); }
    public DoubleProperty flightNextTargetDistProperty() { return FLIGHT_NEXT_TARGET_DIST; }

    public String getFlightName() { return FLIGHT_NAME.get(); }
    public void setFlightName(String value) { FLIGHT_NAME.set(value); }
    public StringProperty flightNameProperty() { return FLIGHT_NAME; }

    public String getFlightStatus() { return FLIGHT_STATUS.get(); }
    public void setFlightStatus(String value) { FLIGHT_STATUS.set(value); }
    public StringProperty flightStatusProperty() { return FLIGHT_STATUS; }

    // Misc
    public boolean getPayloadStatus() { return PAYLOAD_STATUS.get(); }
    public void setPayloadStatus(boolean value) { PAYLOAD_STATUS.set(value); }
    public BooleanProperty payloadStatusProperty() { return PAYLOAD_STATUS; }

    // --------------
    // CONSTRUCTOR
    // --------------

    public Data() {
        updateData();
    }

    // --------------
    // FUNCTION
    // --------------

    public void updateData() {}

    // --------------
    // CONTROL
    // --------------

    public void armDrone() {}
    public void startFlight(int storedFlightIndex) {}
    public void hardKill() {}
    public void autoLand() {}
    public void returnToHome() {}

}
