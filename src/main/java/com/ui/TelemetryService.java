package com.droneviewui;

import javafx.concurrent.Task;

import com.droneviewui.ControlService;

import javafx.application.Platform;

import javafx.concurrent.*;

public class TelemetryService extends Service<Void> {
    private final static int POLLING_RATE = 100; //ms
    Data data;
    ControlService control;
    private boolean firstUpdate;

    public TelemetryService(Data data, ControlService control) {
        this.data = data;
        this.control = control;
        firstUpdate = true;
    }

    @Override
    protected Task<Void> createTask() {
        return new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                while(!isCancelled()) {
                    if(data.isConnectedToDrone()) {
                        if(firstUpdate) {
                            Platform.runLater(() -> data.setAvailableFlights(control.getAvailableFlights()));
                            firstUpdate = false;
                        }

                        updateData(control.getTelemetryUpdate());

                        Platform.runLater(() -> {
                            data.setBottomFrame(control.getBottomCameraView());
                            data.setFrontFrame(control.getFrontCameraView()); 
                        });

                        Thread.sleep(POLLING_RATE);
                    }
                }
                return null;
            }
        };
    };

    private void updateData(String telemetryBlip) {
        // Handle updating data from telemetry format.
        // Use Platform.runLater(() -> data.etc
    }
};