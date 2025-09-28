package Satelitehandle;


class PayloadSpecialist implements MissionPlan {
    private Satellite satellite;

    public PayloadSpecialist(Satellite satellite) {
        this.satellite = satellite;
    }

    @Override
    public void execute() {
        satellite.collectData();
    }
}
