package model;

public class Adjustments {
    private double demandFactor;
    private double operatingHours;
    private double continuousCurrentFactor;
    private double adjacentConductorFactor;
    private double temperatureFactor;
    private double adjustedCurrent;
    private double adjustedPower;

    public Adjustments(double demandFactor, double operatingHours, int wireAmount, double temperature, double current, int phaseAmount, double voltage) {
        this.demandFactor = demandFactor;
        this.operatingHours = operatingHours;
        if(this.operatingHours >= 3){
            this.continuousCurrentFactor = 1.25;
        } else { this.continuousCurrentFactor = 1; }
        if(wireAmount >= 4){
            this.adjacentConductorFactor = 0.8;
        } else { this.adjacentConductorFactor = 1; }
        if(temperature != 30){
            this.temperatureFactor = 0.8;
        } else { this.temperatureFactor = 1; }
        this.adjustedCurrent = current * demandFactor * continuousCurrentFactor;
        if(phaseAmount < 3){
            this.adjustedPower = voltage * adjustedCurrent;
        } else { this.adjustedPower = voltage * adjustedCurrent * Math.sqrt(3); }
    }

    public double getDemandFactor() {
        return demandFactor;
    }

    public void setDemandFactor(double demandFactor) {
        this.demandFactor = demandFactor;
    }

    public double getContinuousCurrentFactor() {
        return continuousCurrentFactor;
    }

    public void setContinuousCurrentFactor(double continuousCurrentFactor) {
        this.continuousCurrentFactor = continuousCurrentFactor;
    }

    public double getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(double operatingHours) {
        this.operatingHours = operatingHours;
    }

    public double getAdjacentConductorFactor() {
        return adjacentConductorFactor;
    }

    public void setAdjacentConductorFactor(double adjacentConductorFactor) {
        this.adjacentConductorFactor = adjacentConductorFactor;
    }

    public double getTemperatureFactor() {
        return temperatureFactor;
    }

    public void setTemperatureFactor(double temperatureFactor) {
        this.temperatureFactor = temperatureFactor;
    }

    public double getAdjustedCurrent() {
        return adjustedCurrent;
    }

    public void setAdjustedCurrent(double adjustedCurrent) {
        this.adjustedCurrent = adjustedCurrent;
    }

    public double getAdjustedPower() {
        return adjustedPower;
    }

    public void setAdjustedPower(double adjustedPower) {
        this.adjustedPower = adjustedPower;
    }
}
