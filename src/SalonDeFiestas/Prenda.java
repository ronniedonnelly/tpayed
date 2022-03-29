package SalonDeFiestas;

public class Prenda {
    private final int nomPrenda; // esto seria el codigol
    private int horaIngreso;

    public Prenda(int nomPrenda) {
        this.nomPrenda = nomPrenda;
    }

    public int getNomPrenda() {
        return nomPrenda;
    }

    public int getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(int horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

}

