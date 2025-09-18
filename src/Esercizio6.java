import java.util.Scanner;

public class Esercizio6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero");

        int n = scan.nextInt();

        for ( int i = 0; i < n; i++){

            for ( int k = n - 1; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++){
                System.out.print("@");
            }
            System.out.println("");
        }

    }
}


/* Scrivi un programma Java che, dato un numero in input, stampi un triangolo come nell'esempio.

Esempio:

Inserisci il numero: 6
Uscita prevista:
      @
     @@
    @@@
   @@@@
  @@@@@
 @@@@@@

 */