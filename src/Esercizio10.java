import java.util.Scanner;

public class Esercizio10 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero");

        int righe =  scan.nextInt();

        for ( int i = righe; i > 0; i--){
            for (int j = 0; j < i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
Scrivi un programma Java che, dato un numero in input,  stampa un triangolo * come nell'esempio

Dati di test
Inserisci il numero: 6
Uscita prevista:

******
*****
****
***
**
*
 */