package model;

public class Circuit {
    private String name;
    private String loadType;
    private int phaseAmount;
    private int wireAmount;
    private double voltage;
    private double current;
    private double power;
    private double length;
    private double temperature;
    private Adjustments adjustments;
    private int itm;
    private Conductor phase;
    private Conductor ground;
    private Raceway raceway;
    private double voltageDrop;
    private double ampacityMinimum;

    public Circuit(String name, String loadType, int phaseAmount, int wireAmount, double voltage, double power, double length, double temperature, double demandFactor, double operatingHours){
        this.name = name;
        this.loadType = loadType;
        this.phaseAmount = phaseAmount;
        this.wireAmount = wireAmount;
        this.voltage = voltage;
        if(phaseAmount < 3){
            this.current = power / voltage;
        } else { this.current = power / (voltage * Math.sqrt(3)); }
        this.power = power;
        this.length = length;
        this.temperature = temperature;
        this.adjustments = new Adjustments(demandFactor, operatingHours, wireAmount, temperature, current, phaseAmount, voltage);
        calcItm();
        this.ampacityMinimum = adjustments.getAdjustedCurrent() / (adjustments.getAdjacentConductorFactor() * adjustments.getTemperatureFactor());
    }

    public void calcItm(){
        Info actualInfo = new Info();
        if(loadType.equals("Receptacle")) {
            for(int amp : actualInfo.getItm()){
                if((amp * 0.8) > adjustments.getAdjustedCurrent()){
                    this.itm = amp;
                    break;
                }
            }
        }else{
            for(int amp : actualInfo.getItm()){
                if(amp > adjustments.getAdjustedCurrent()){
                    this.itm = amp;
                    break;
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoadType() {
        return loadType;
    }

    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    public int getPhaseAmount() {
        return phaseAmount;
    }

    public void setPhaseAmount(int phaseAmount) {
        this.phaseAmount = phaseAmount;
    }

    public int getWireAmount() {
        return wireAmount;
    }

    public void setWireAmount(int wireAmount) {
        this.wireAmount = wireAmount;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public double getCurrent() {
        return current;
    }

    public void setCurrent(double current) {
        this.current = current;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Adjustments getAdjustments() {
        return adjustments;
    }

    public void setAdjustments(Adjustments adjustments) {
        this.adjustments = adjustments;
    }

    public int getItm() {
        return itm;
    }

    public void setItm(int itm) {
        this.itm = itm;
    }

    public Conductor getPhase() {
        return phase;
    }

    public void setPhase(Conductor phase) {
        this.phase = phase;
    }

    public Conductor getGround() {
        return ground;
    }

    public void setGround(Conductor ground) {
        this.ground = ground;
    }

    public Raceway getRaceway() {
        return raceway;
    }

    public void setRaceway(Raceway raceway) {
        this.raceway = raceway;
    }

    public double getVoltageDrop() {
        return voltageDrop;
    }

    public void setVoltageDrop(double voltageDrop) {
        this.voltageDrop = voltageDrop;
    }

    public double getAmpacityMinimum() {
        return ampacityMinimum;
    }

    public void setAmpacityMinimum(double ampacityMinimum) {
        this.ampacityMinimum = ampacityMinimum;
    }
}
