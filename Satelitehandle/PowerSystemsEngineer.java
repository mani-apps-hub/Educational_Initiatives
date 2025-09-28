package Satelitehandle;


class PowerSystemsEngineer implements MissionPlan {
    private Satellite satellite;
    private boolean activate;

    public PowerSystemsEngineer(Satellite satellite, boolean activate) {
        this.satellite = satellite;
        this.activate = activate;
    }

    @Override
    public void execute() {
        if (activate) {
            satellite.activatePanels();
        } else {
            satellite.deactivatePanels();
        }
    }
}
