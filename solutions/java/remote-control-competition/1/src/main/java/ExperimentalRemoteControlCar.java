public class ExperimentalRemoteControlCar implements RemoteControlCar {
    int distanceTravelled = 0;

    @Override
    public void drive() {
        this.distanceTravelled += 20;
    }

    @Override
    public int getDistanceTravelled() {
        return this.distanceTravelled;
    }
}
