import java.util.Scanner;

public class Esercizio11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numeri = new int[5];

        System.out.println("Inserisci 5 numeri");

        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = scan.nextInt();
        }
        int somma = 0;

        int numero = numeri.length;

        for ( int j = 0; j < numeri.length; j++){
            System.out.println(numeri[j]);
            somma = somma + numeri[j];
        }

        int media = somma / numero;

        System.out.println("La somma dei numeri è " + somma);
        System.out.println("La media è " + media);
    }

    }

    /*
    Scrivi un programma in Java per inserire 5 numeri da tastiera e trovare la loro somma e media.

Dati di test
Immettere i 5 numeri: 1 2 3 4 5
Uscita prevista:

Inserisci i 5 numeri:
1
2
3
4
5
La somma di 5 no è: 15
La media è: 3.0
     */