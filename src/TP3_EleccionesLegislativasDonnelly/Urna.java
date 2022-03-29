package TP3_EleccionesLegislativasDonnelly;

import TP3_EleccionesLegislativasDonnelly.Boleta;

public class Urna {
    private Boleta[] boletas = new Boleta[200];
    private int cantidad;
    private int[] votos = new int[4];
    private int partidoGanador;
    private String answer;


    public void votar(Boleta boleta) {
        // Suma 1 a la cantidad de votos totales
        boletas[cantidad] = boleta;
        cantidad++;

    }

    public String partidoganador() {
        // Recorre el array de boletas hasta la cantidad de votos y busca el codigo del nombre del
        // partido de cada boleta. Luego, con ese valor, se lo utiliza como posición para el array de votos restándole 1.
        // De esta manera, la cantidad de votos del partido con code 1 se va a guardar en la posición 0 del array votos
        // Lo mismo pasa con los otros partidos
        //Busca el valor mayor del array votos y luego usamos el método "posición" para encontrar la posición del valor
        // mayor --> le sumamos 1 así tenemos el código del nombre del partido

        for (int i = 0; i < cantidad; i++) {
            votos[boletas[i].getPartido() - 1]++;
        }
        int mayor = votos[0];
        for (int i = 0; i < votos.length; i++) {
            if (votos[i] > mayor) { //
                mayor = votos[i];
            }
            partidoGanador = posicion(votos, mayor) + 1;

        }
        // usamos un if para que al imprimir en pantalla aparezca el nombre del Partido ganador en lugar de su código
        // y así lograr que sea menos confuso
        if (partidoGanador == 1) {
            answer = "El partido ganador es: Frente de Todos";
        } else if (partidoGanador == 2) {
            answer = "El partido ganador es: JxC ";
        } else if (partidoGanador == 3) {
            answer = "El partido ganador es: Avanza Libertad";
        } else if (partidoGanador == 4) {
            answer = "El partido ganador es: Frente de izquierda";
        }
        return answer;


}


    public int posicion(int[] array, int numero){
        // método que dado un array y un número me devuelva la posición de ese número
        int i=0;
           while(i<array.length){
               if(array[i]==numero){

                   return i;
               }
                    i++;
           }
           return -1;
    }

    public int nrodevotos(){
        return cantidad;
    }

}







