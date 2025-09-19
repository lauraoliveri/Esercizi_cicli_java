import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TriangolodiPascal {
    public static void main(String[] args){


        int righe = 5;


        List<Integer> rigaPrecedente = new ArrayList<Integer>();

        for (int i = 0; i < righe; i++ ) {

            List<Integer> rigaSuccessiva = new ArrayList<Integer>();

            // se è la prima riga non salva il primo 1
            if ( i != 0) {
                rigaSuccessiva.add(1);
            }


            for (int j = 1; j < rigaPrecedente.size(); j++) {  // ciclo per calcolare i numeri interni

                int num = rigaPrecedente.get(j - 1) + rigaPrecedente.get(j);
                rigaSuccessiva.add(num);
            }

            rigaSuccessiva.add(1);

            for (int num : rigaSuccessiva) {
                System.out.print(num + " ");
            }
            System.out.println();

            // aggiorniamo l'array della lista precedente
            rigaPrecedente = rigaSuccessiva;


        }

    }
}

/* Scrivete un programma Java per visualizzare il triangolo di Pascal.

Dati di test
Immettere il numero di righe: 5
Uscita prevista:

Immettere il numero di righe: 5
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1


1. creo le colonne
2. creo le righe
3. stampo tutti gli uno
4. stampare i numeri "al centro";
     * creo un array per salvare la riga di numeri;
     * creo un for per iterare sull array e fare la somma
     * stampo i numeri

 */