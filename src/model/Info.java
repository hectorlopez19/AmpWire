package model;

public class Info {
    private Conductor[] alConductors;
    private Conductor[] cuConductors;
    private Raceway[] emtRaceways;
    private Raceway[] fmcRaceways;
    private Raceway[] imcRaceways;
    private Raceway[] rmcRaceways;
    private Raceway[] padRaceways;
    private double[] tray;
    private int[] itm;

    public Info() {
        alConductors = new Conductor[13];
        alConductors[0] = new Conductor("Al", "6", 40, 60, "XHW", 7.722, 13.3, 2.33, 38.06);
        alConductors[1] = new Conductor("Al", "4", 55, 80, "XHW", 8.941, 21.15, 1.51, 52.52);
        alConductors[2] = new Conductor("Al", "2", 75, 110, "XHW", 10.46, 33.62, 0.98, 73.94);
        alConductors[3] = new Conductor("Al", "1/0", 100, 150, "XHW", 13.51, 53.49, 0.62, 117.7);
        alConductors[4] = new Conductor("Al", "2/0", 135, 210, "XHHW", 14.68, 67.43, 0.52, 141.3);
        alConductors[5] = new Conductor("Al", "3/0", 155, 240, "XHHW", 16, 85.01, 0.43, 170.5);
        alConductors[6] = new Conductor("Al", "4/0", 180, 280, "XHHW", 17.48, 107.2, 0.36, 206.3);
        alConductors[7] = new Conductor("Al", "250", 230, 355, "XHHW", 19.43, 127, 0.308, 251.9);
        alConductors[8] = new Conductor("Al", "300", 260, 395, "XHHW", 20.83, 152, 0.269, 292.6);
        alConductors[9] = new Conductor("Al", "350", 280, 445, "XHHW", 22.12, 177, 0.24, 333.3);
        alConductors[10] = new Conductor("Al", "400", 305, 480, "XHHW", 23.32, 203, 0.217, 373);
        alConductors[11] = new Conductor("Al", "500", 350, 545, "XHHW", 25.48, 253, 0.187, 450.6);
        alConductors[12] = new Conductor("Al", "600", 385, 615, "XHHW", 28.27, 304, 0.167, 561.9);

        cuConductors = new Conductor[17];
        cuConductors[0] = new Conductor("Cu", "14", 15, 25, "THW", 3.378, 2.08, 8.9, 8.968);
        cuConductors[1] = new Conductor("Cu", "12", 20, 30, "THW", 3.861, 3.31, 5.6, 11.68);
        cuConductors[2] = new Conductor("Cu", "10", 30, 40, "THW", 4.47, 5.26, 3.6, 15.68);
        cuConductors[3] = new Conductor("Cu", "8", 40, 60, "THW", 5.994, 8.36, 2.26, 28.19);
        cuConductors[4] = new Conductor("Cu", "6", 55, 80, "THW", 7.722, 13.3, 1.44, 46.84);
        cuConductors[5] = new Conductor("Cu", "4", 70, 105, "THW", 8.941, 21.15, 0.95, 62.77);
        cuConductors[6] = new Conductor("Cu", "2", 95, 140, "THW", 10.46, 33.62, 0.62, 86);
        cuConductors[7] = new Conductor("Cu", "1/0", 150, 230, "THHW", 13.51, 53.49, 0.43, 143.4);
        cuConductors[8] = new Conductor("Cu", "2/0", 175, 265, "THHW", 14.68, 67.43, 0.36, 169.3);
        cuConductors[9] = new Conductor("Cu", "3/0", 200, 310, "THHW", 16, 85.01, 0.289, 201.1);
        cuConductors[10] = new Conductor("Cu", "4/0", 230, 360, "THHW", 17.48, 107.2, 0.243, 239.9);
        cuConductors[11] = new Conductor("Cu", "250", 290, 455, "THHW", 19.43, 127, 0.217, 296.5);
        cuConductors[12] = new Conductor("Cu", "300", 320, 500, "THHW", 20.83, 152, 0.194, 340.7);
        cuConductors[13] = new Conductor("Cu", "350", 350, 570, "THHW", 22.12, 177, 0.174, 384.4);
        cuConductors[14] = new Conductor("Cu", "400", 380, 615, "THHW", 23.32, 203, 0.161, 427);
        cuConductors[15] = new Conductor("Cu", "500", 430, 700, "THHW", 25.48, 253, 0.141, 509.7);
        cuConductors[16] = new Conductor("Cu", "600", 475, 780, "THHW", 28.27, 304, 0.131, 627.7);

        emtRaceways = new Raceway[10];
        emtRaceways[0] = new Raceway("EMT", "1/2", 78);
        emtRaceways[1] = new Raceway("EMT", "3/4", 137);
        emtRaceways[2] = new Raceway("EMT", "1", 222);
        emtRaceways[3] = new Raceway("EMT", "1 1/4", 387);
        emtRaceways[4] = new Raceway("EMT", "1 1/2", 526);
        emtRaceways[5] = new Raceway("EMT", "2", 866);
        emtRaceways[6] = new Raceway("EMT", "2 1/2", 1513);
        emtRaceways[7] = new Raceway("EMT", "3", 2280);
        emtRaceways[8] = new Raceway("EMT", "3 1/2", 2980);
        emtRaceways[9] = new Raceway("EMT", "4", 3808);

        fmcRaceways = new Raceway[11];
        fmcRaceways[0] = new Raceway("FMC", "3/8", 30);
        fmcRaceways[1] = new Raceway("FMC", "1/2", 81);
        fmcRaceways[2] = new Raceway("FMC", "3/4", 137);
        fmcRaceways[3] = new Raceway("FMC", "1", 211);
        fmcRaceways[4] = new Raceway("FMC", "1 1/4", 330);
        fmcRaceways[5] = new Raceway("FMC", "1 1/2", 480);
        fmcRaceways[6] = new Raceway("FMC", "2", 843);
        fmcRaceways[7] = new Raceway("FMC", "2 1/2", 1267);
        fmcRaceways[8] = new Raceway("FMC", "3", 1824);
        fmcRaceways[9] = new Raceway("FMC", "3 1/2", 2483);
        fmcRaceways[10] = new Raceway("FMC", "4", 3243);

        imcRaceways = new Raceway[10];
        imcRaceways[0] = new Raceway("IMC", "1/2", 89);
        imcRaceways[1] = new Raceway("IMC", "3/4", 151);
        imcRaceways[2] = new Raceway("IMC", "1", 248);
        imcRaceways[3] = new Raceway("IMC", "1 1/4", 425);
        imcRaceways[4] = new Raceway("IMC", "1 1/2", 573);
        imcRaceways[5] = new Raceway("IMC", "2", 937);
        imcRaceways[6] = new Raceway("IMC", "2 1/2", 1323);
        imcRaceways[7] = new Raceway("IMC", "3", 2046);
        imcRaceways[8] = new Raceway("IMC", "3 1/2", 2729);
        imcRaceways[9] = new Raceway("IMC", "4", 3490);

        rmcRaceways = new Raceway[12];
        rmcRaceways[0] = new Raceway("RMC", "1/2", 81);
        rmcRaceways[1] = new Raceway("RMC", "3/4", 141);
        rmcRaceways[2] = new Raceway("RMC", "1", 229);
        rmcRaceways[3] = new Raceway("RMC", "1 1/4", 394);
        rmcRaceways[4] = new Raceway("RMC", "1 1/2", 533);
        rmcRaceways[5] = new Raceway("RMC", "2", 879);
        rmcRaceways[6] = new Raceway("RMC", "2 1/2", 1255);
        rmcRaceways[7] = new Raceway("RMC", "3", 1936);
        rmcRaceways[8] = new Raceway("RMC", "3 1/2", 2584);
        rmcRaceways[9] = new Raceway("RMC", "4", 3326);
        rmcRaceways[10] = new Raceway("RMC", "5", 5220);
        rmcRaceways[11] = new Raceway("RMC", "6", 7528);

        padRaceways = new Raceway[12];
        padRaceways[0] = new Raceway("PAD", "1/2", 74);
        padRaceways[1] = new Raceway("PAD", "3/4", 131);
        padRaceways[2] = new Raceway("PAD", "1", 214);
        padRaceways[3] = new Raceway("PAD", "1 1/4", 374);
        padRaceways[4] = new Raceway("PAD", "1 1/2", 513);
        padRaceways[5] = new Raceway("PAD", "2", 849);
        padRaceways[6] = new Raceway("PAD", "2 1/2", 1212);
        padRaceways[7] = new Raceway("PAD", "3", 1877);
        padRaceways[8] = new Raceway("PAD", "3 1/2", 2511);
        padRaceways[9] = new Raceway("PAD", "4", 3237);
        padRaceways[10] = new Raceway("PAD", "5", 5099);
        padRaceways[11] = new Raceway("PAD", "6", 7373);

        tray = new double[12];
        tray[0] = 5;
        tray[1] = 10;
        tray[2] = 15;
        tray[3] = 20;
        tray[4] = 22.5;
        tray[5] = 30;
        tray[6] = 40;
        tray[7] = 45;
        tray[8] = 50;
        tray[9] = 60;
        tray[10] = 75;
        tray[11] = 90;

        itm = new int[34];
        itm[0] = 15;
        itm[1] = 20;
        itm[2] = 25;
        itm[3] = 30;
        itm[4] = 40;
        itm[5] = 50;
        itm[6] = 60;
        itm[7] = 70;
        itm[8] = 80;
        itm[9] = 90;
        itm[10] = 100;
        itm[11] = 125;
        itm[12] = 150;
        itm[13] = 175;
        itm[14] = 200;
        itm[15] = 225;
        itm[16] = 250;
        itm[17] = 300;
        itm[18] = 350;
        itm[19] = 400;
        itm[20] = 450;
        itm[21] = 500;
        itm[22] = 600;
        itm[23] = 700;
        itm[24] = 800;
        itm[25] = 1000;
        itm[26] = 1200;
        itm[27] = 1600;
        itm[28] = 2000;
        itm[29] = 2500;
        itm[30] = 3000;
        itm[31] = 4000;
        itm[32] = 5000;
        itm[33] = 6000;
    }

    public Conductor[] getAlConductors() {
        return alConductors;
    }

    public void setAlConductors(Conductor[] alConductors) {
        this.alConductors = alConductors;
    }

    public Conductor[] getCuConductors() {
        return cuConductors;
    }

    public void setCuConductors(Conductor[] cuConductors) {
        this.cuConductors = cuConductors;
    }

    public Raceway[] getEmtRaceways() {
        return emtRaceways;
    }

    public void setEmtRaceways(Raceway[] emtRaceways) {
        this.emtRaceways = emtRaceways;
    }

    public Raceway[] getFmcRaceways() {
        return fmcRaceways;
    }

    public void setFmcRaceways(Raceway[] fmcRaceways) {
        this.fmcRaceways = fmcRaceways;
    }

    public Raceway[] getImcRaceways() {
        return imcRaceways;
    }

    public void setImcRaceways(Raceway[] imcRaceways) {
        this.imcRaceways = imcRaceways;
    }

    public Raceway[] getRmcRaceways() {
        return rmcRaceways;
    }

    public void setRmcRaceways(Raceway[] rmcRaceways) {
        this.rmcRaceways = rmcRaceways;
    }

    public Raceway[] getPadRaceways() {
        return padRaceways;
    }

    public void setPadRaceways(Raceway[] padRaceways) {
        this.padRaceways = padRaceways;
    }

    public double[] getTray() {
        return tray;
    }

    public void setTray(double[] tray) {
        this.tray = tray;
    }

    public int[] getItm() {
        return itm;
    }

    public void setItm(int[] itm) {
        this.itm = itm;
    }
}
