/*
Schreiben Sie ein Java-Programm,dass einen Nettobetrag von der Tastatur einliest,
die Mehrwertsteuer mit 19 % und den Bruttobetrag berechnet und
alle 3 Werte 8-stellig mit 2 Nachkommastellen formatiert ausgibt.


Die Ausgabe des Programms sollte in etwa so aussehen:


Programm zur Berechnung eines Bruttobetrages :


Bitte geben Sie den Nettobetrag in EUR ein: ___________


Nettobetrag = xxxxx.xx EUR
Mehrwertsteuersatz 19.00 % = xxxxx.xx EUR
Bruttobetrag = xxxxx.xx EUR
*/


import java.util.Scanner;
import java.text.DecimalFormat;


public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00000000.00");


        System.out.println("Programm zur Berechnung eines Bruttobetrages");


                // Eingabe des Nettobetrages
                System.out.print("Bitte geben Sie den Nettobetrag in EUR ein: ");
        double nettobetrag = scanner.nextDouble();

        // Berechnung der Mehrwertsteuer und des Bruttobetrages
        double mehrwertsteuer = nettobetrag * 0.19;
        double bruttobetrag = nettobetrag + mehrwertsteuer;

        // Ausgabe der Ergebnisse
        System.out.println("Nettobetrag = " +
                df.format(nettobetrag) + " EUR");
        System.out.println("Mehrwertsteuersatz 19.00 % = " +
                df.format(mehrwertsteuer) + " EUR");
        System.out.println("Bruttobetrag = " +
                df.format(bruttobetrag) + " EUR");
    }
}
