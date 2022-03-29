package TP3_EleccionesLegislativasDonnelly;

public class Boleta {
    private int partido;
    private int code;

    public Boleta(int partido, int code) {
        this.partido = partido;
        this.code = code;

    }
    public int getPartido() {
        return partido;
    }

}