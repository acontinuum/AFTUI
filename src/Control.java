public interface Control {
    // Ground Actions
    boolean tryArmDrone();

    // Flight Actions
    boolean tryLand();
    boolean tryReturnToHome();
    boolean tryKill();

    // Telemetry Retrieval
    int tryGetAltitude();
}
