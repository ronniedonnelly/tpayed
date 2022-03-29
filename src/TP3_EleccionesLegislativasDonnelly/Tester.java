package TP3_EleccionesLegislativasDonnelly;
public class Tester {
    public static void main(String[] args) {

        // instancio una boleta con código 12 del “Frente de todos”:
        Boleta miboleta1 = new Boleta(1, 12);
        // instancio una boleta con código 15 de “Avanza libertad”:
        Boleta miboleta2 = new Boleta(3, 15);
        Boleta miboleta3 = new Boleta(3, 19);
        Boleta miboleta4 = new Boleta(2, 22);
        Boleta miboleta5 = new Boleta(2,34);
        Urna miurna = new Urna();

        miurna.votar(miboleta1);
        miurna.votar(miboleta3);
        miurna.votar(miboleta2);
        miurna.votar(miboleta4);

// cantidad de boletas dentro de la urna:
        System.out.println("La cantidad total de votos: " + miurna.nrodevotos());

// el partido más votado en esta urna:
      System.out.println(miurna.partidoganador());

    }
}
