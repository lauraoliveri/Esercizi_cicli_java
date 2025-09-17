import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero");

        int n = scan.nextInt();

        int somma = 0;

        for ( int i = 0; i < n*2 ; i++) {
            int resto = i % 2;
            if (resto != 0) {
                somma = somma + i;
                System.out.println(i);
            }
        }

        System.out.println("La somma del numero naturale dispari fino a "+ n +" termini è:" + somma);

    }
}
