import java.util.Scanner;

public class Esercizio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero");

        int n = scan.nextInt();

        int cubo = n*n*n;

        System.out.println("Il numero è: " + n + " e il cubo di " + n + " è: " + cubo);

    }
}
