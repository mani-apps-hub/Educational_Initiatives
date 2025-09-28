package Satelitehandle;


class AttitudeController implements MissionPlan {
    private Satellite satellite;
    private String direction;

    public AttitudeController(Satellite satellite, String direction) {
        this.satellite = satellite;
        this.direction = direction;
    }

    @Override
    public void execute() {
        satellite.rotate(direction);
    }
}
