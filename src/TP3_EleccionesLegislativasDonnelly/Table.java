package TP3_EleccionesLegislativasDonnelly;

public class Table {
    private int cantDePresidentes = 1;
    private int cantDeVicepresidentes  = 1;
    private int cantDeVocales = 2;
    private Urna urna;

    public Table(Urna urna){
        this.urna = urna;

    }
    public int getCantDePresidentes() {
        return cantDePresidentes;
    }
    public int getCantDeVicepresidentes() {
        return cantDeVicepresidentes;
    }
    public int getCantDeVocales() {
        return cantDeVocales;
    }
}
