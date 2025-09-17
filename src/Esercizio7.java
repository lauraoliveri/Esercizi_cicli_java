import java.util.Scanner;

public class Esercizio7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("inserisci il primo numero");

        int primoNum = scan.nextInt();

        System.out.println("inserisci il secondo numero");

        int secondoNum = scan.nextInt();

        System.out.println("inserisci il terzo numero");

        int terzoNum = scan.nextInt();

        if ( primoNum > secondoNum){
            if ( primoNum > terzoNum){
                System.out.println("Il più grande è: " + primoNum);
            }
            else {
                System.out.println("Il più grande è: " + terzoNum);
            }
        }else{
            if( secondoNum > terzoNum){
                System.out.println("Il più grande è: " + secondoNum);
            }else {
                System.out.println("Il più grande è: " + terzoNum);
            }
        }
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
