package model;

public class Conductor {
    private String material;
    private String gauge;
    private double conduitAmpacity;
    private double trayAmpacity;
    private String insulation;
    private double diameter;
    private double area;
    private double impedancy;
    private double insArea;

    public Conductor(String material, String gauge, double conduitAmpacity, double trayAmpacity, String insulation, double diameter, double area, double impedancy, double insArea) {
        this.material = material;
        this.gauge = gauge;
        this.conduitAmpacity = conduitAmpacity;
        this.trayAmpacity = trayAmpacity;
        this.insulation = insulation;
        this.diameter = diameter;
        this.area = area;
        this.impedancy = impedancy;
        this.insArea = insArea;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getGauge() {
        return gauge;
    }

    public void setGauge(String gauge) {
        this.gauge = gauge;
    }

    public double getConduitAmpacity() {
        return conduitAmpacity;
    }

    public void setConduitAmpacity(double conduitAmpacity) {
        this.conduitAmpacity = conduitAmpacity;
    }

    public double getTrayAmpacity() {
        return trayAmpacity;
    }

    public void setTrayAmpacity(double trayAmpacity) {
        this.trayAmpacity = trayAmpacity;
    }

    public String getInsulation() {
        return insulation;
    }

    public void setInsulation(String insulation) {
        this.insulation = insulation;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getImpedancy() {
        return impedancy;
    }

    public void setImpedancy(double impedancy) {
        this.impedancy = impedancy;
    }

    public double getInsArea() {
        return insArea;
    }

    public void setInsArea(double insArea) {
        this.insArea = insArea;
    }

}
