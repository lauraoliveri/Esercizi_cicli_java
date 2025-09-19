
import java.util.*;
public class Eserc {
    public static void main(String[] args) {

        int righe = 5;

        ArrayList<Integer> rigaPrecedente = new ArrayList<Integer>();
        for ( int i = 0; i < righe; i++) {

            ArrayList<Integer> rigaAttuale = new ArrayList<Integer>();

            if (i > 0){
                rigaAttuale.add(1);
            }

            for ( int j = 1; j < rigaPrecedente.size(); j++){

                int numero = rigaPrecedente.get(j - 1) + rigaPrecedente.get(j);

                rigaAttuale.add(numero);
            }

            rigaAttuale.add(1);

            for (int num : rigaAttuale){
                System.out.print(num + " ");
            }

            System.out.println();

            rigaPrecedente = rigaAttuale;
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



 */