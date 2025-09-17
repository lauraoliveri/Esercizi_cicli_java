import java.util.Scanner;

public class Esercizio8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero");

        int n = scan.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i);

            }
            System.out.println(" ");
        }
    }
}

/*
Scrivi un programma in Java per stampa un triangolo in cui ogni riga è un numero ripetuto.

Esempio

Inserisci N:

4

Stampa

1
22
333
4444
 */