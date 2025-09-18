
import java.util.*;
import java.util.Scanner;

public class Esercizio7Part2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("inserisci il primo numero");

        int primoNum = scan.nextInt();

        System.out.println("inserisci il secondo numero");

        int secondoNum = scan.nextInt();

        System.out.println("inserisci il terzo numero");

        int terzoNum = scan.nextInt();

        List<Integer> myNum = new ArrayList<Integer>(Arrays.asList(primoNum, secondoNum, terzoNum));


        int biggerNum = myNum.getFirst();

        for ( int i : myNum){
            if ( biggerNum > i){
                biggerNum = biggerNum;
            }else {
                biggerNum = i;
            }
        }

        System.out.println("Il numero più grande è: " + biggerNum);
    }
}


/* Prendi tre numeri dall'utente e stampa il numero più grande.

Dati di test
Immettere il 1 ° numero: 25
Immettere il 2 ° numero: 78
Immettere il 3 ° numero: 87
Uscita prevista:
Il più grande: 87
*/