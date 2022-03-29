package SalonDeFiestas;

public class Ropero {
    private Prenda[] prendas = new Prenda[300];
    private int cantMaxPrendas;
    private int cantprendas = 0;


     public Ropero(){
         Prenda[] prendas = new Prenda[300];
    }

     /* es lo mismo que hacer
    public Ropero(int cantidad){
        this.prendas = new Prenda[cantidad];
    }

     */



    public void agregarPrenda(Prenda prenda, int horaIngreso){
       /* -- lo que hizo fabri -- for (int i = 0; i <= prendas.length - 1; i++) {
            if(prendas[i]==null){
                prenda.setHoraIngreso(horaIngreso);
                prendas[i] = prenda;
                return; //corta el flujo del for
            }
        }
        */
        prendas[cantprendas] = prenda;
        cantprendas++;
        prenda.setHoraIngreso(horaIngreso);
    }

    public int nroPrendasDelicadas(){
        int contador = 0;
        for (int i = 0; i < prendas.length; i++) {
            if(prendas[i] != null){
                if(prendas[i].getNomPrenda() == 3){
                    contador ++;
                }
            }

        }
        return contador;



       // int[] tipoDePrenda = new int[3];
       // for (int i = 0; i < cantprendas; i++) {
       //     tipoDePrenda[prendas[i].getNomPrenda()-1]++;
        }

        //return tipoDePrenda[2];
}

