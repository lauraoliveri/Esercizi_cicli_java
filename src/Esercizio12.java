import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Esercizio12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero");

        int primon = scan.nextInt();

        System.out.println("Inserisci un numero");

        int secondon = scan.nextInt();

        System.out.println("Inserisci un numero");

        int terzon = scan.nextInt();

        List<Integer> myArr = new ArrayList<Integer>(Arrays.asList(primon, secondon, terzon)); // li metto in un array per poi confrontarli

        String ordine = ""; // utile per stampare in console

        boolean crescente = true;
        boolean decrescente = true;

        Integer numeroPrecedente = null;

        for (int i : myArr){

            if ( numeroPrecedente != null){ // inizio a confrontare dal secondo numero perchè numeroPrecedente è null all 'inizio
                if ( numeroPrecedente < i){
                    decrescente = false;
                }else if ( numeroPrecedente > i){
                    crescente = false;
                }
            }

            numeroPrecedente = i; // aggiorno la variabile per confrontare il numero precedente con il successivo

        }

        if (crescente){
            ordine = "crescente";
        } else if (decrescente) {
            ordine = "decrescente";
        }
        else {
            ordine = "nè decrescente nè crescente";
        }


        System.out.println("Ordine " + ordine);
    }
}

/*
Scrivete un programma che accetti tre numeri dall'utente e stampi "crescente" se i numeri sono in ordine crescente, "decrescente" se i numeri sono in ordine decrescente e "Né ordine crescente o decrescente" in caso contrario.

Dati di test
Immettere il primo numero: 1524
Immettere il secondo numero: 2345
Immettere il terzo numero: 3321
Uscita prevista:

Ordine crescente

 */