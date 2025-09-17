import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero");

        int n = scan.nextInt();

        System.out.println("Numero di input:" + n);

        System.out.print("I primi n numeri naturali sono:");

        for (int i = n; i > 0  ; i--) {

            System.out.print(i + ", ");
        }

        System.out.println(" ");

        System.out.println("La somma del numero naturale fino a n termini:");


        int somma = 0;

        for (int i = 1; i <= n  ; i++) {

            somma =  somma + i;

            if (i == n){
                System.out.print(i);
            }else {
                System.out.print(i + "+");
            }
        }

        System.out.print("= " + somma );

    }
}
