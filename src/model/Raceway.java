package model;

public class Raceway {
    private String type;
    private String gauge;
    private double maxArea;

    public Raceway(String type, String gauge, double maxArea){
        this.type = type;
        this.gauge = gauge;
        this.maxArea = maxArea;
    }

    public String getType() { return type; }
    public void setType(String type) {
        this.type = type;
    }
    public String getGauge(){
        return gauge;
    }
    public void setGauge(String gauge){ this.gauge = gauge; }
    public double getMaxArea() { return maxArea; }
    public void setMaxArea(double maxArea){ this.maxArea = maxArea; }
}
