import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci il numero da calcolare");

        int numero = scan.nextInt();

        System.out.println("Inserisci il numero di termini");

        int termini = scan.nextInt();

        for (int i = 0; i <= termini ; i++) {

            System.out.println( numero + "X" + i + "=" + numero * i);
        }
    }
}
