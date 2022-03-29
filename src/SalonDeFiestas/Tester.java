package SalonDeFiestas;

public class Tester {
    public static void main(String[] args) {
        // instancio un sobretodo.
        Prenda miprenda1= new Prenda(1);


        // instancio una campera.
        Prenda miprenda2= new Prenda(2);

        // instancio dos prendas delicadas campera.
        Prenda miprenda3= new Prenda(3);
        Prenda miprenda4= new Prenda(3);

        Ropero miRopero = new Ropero();

        // se guardan  tres prendas en el ropero a las 10am:
        miRopero.agregarPrenda(miprenda3, 10);
        miRopero.agregarPrenda(miprenda4, 10);
        miRopero.agregarPrenda(miprenda1, 10);

        System.out.println("El horario de Ingreso fue: " + miprenda1.getHoraIngreso());

        // ver la cantidad de prendas delicadas en el ropero.
        System.out.println("Numero de Prendas Delicadas" + miRopero.nroPrendasDelicadas());

    }
}





