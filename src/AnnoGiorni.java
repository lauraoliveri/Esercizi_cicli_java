import java.util.Scanner;

public class AnnoGiorni {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un mese sottoforma di numero");

        int mese = scan.nextInt();

        System.out.println("Inserisci un anno");

        int anno = scan.nextInt();

        String[] mesi = {
                "Gennaio", "Febbraio", "Marzo", "Aprile",
                "Maggio", "Giugno", "Luglio", "Agosto",
                "Settembre", "Ottobre", "Novembre", "Dicembre"
        };

        int[] giorni = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String meseCorrispettivo = mesi[mese - 1];

        int giorniDelMese = giorni[mese - 1];

        //quanti giorni ha quel mese di quell' anno: prendo il mese, se il mese è febbraio e quindi indice 1 allora giorni [indice mese - 1]

        if ( mese == 2 && ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0))){
            giorniDelMese = 29;
        }

        System.out.println(meseCorrispettivo + " " + anno + " ha " + giorniDelMese + " giorni");

    }
}


/*
 Scrivere un programma Java per trovare il numero di giorni in un mese.

Dati di test
Immettere un numero di mese: 2
Input un anno: 2016
Uscita prevista:
Febbraio 2016 ha 29 giorni
 */
