
/*
Sie entschließen sich dazu, eine neue Villa zu errichten, um komfortabler studieren zu können.


Diese soll folgenden Grundriss haben.
 x1 x2 x4 x3


Die Villa hat 3 Etagen. Es soll gelten: x2 = 2 * x4 und x1 = 5 * x3. Sie sind sich jedoch noch unsicher, welche Größe Ihre Villa haben soll. Daher schreiben Sie ein Java-Programm, das mögliche Längen für x1 und x2 in Metern über die Tastatur einliest und in Abhängigkeit dieser Werte die Wohnfläche berechnet.


Außerdem soll das Programm ausgeben, wie teuer ein Rundweg um Ihre Villa wird, wenn pro Meter mit Kosten von 175,- € zu rechnen ist.

*/






import java.util.Scanner;


public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Benutzer nach den Längen für x1 und x2 fragen
        System.out.println("Geben Sie die Länge für x1 in Metern ein: ");
        double x1 = scanner.nextDouble();


        System.out.println("Geben Sie die Länge für x2 in Metern ein: ");
        double x2 = scanner.nextDouble();


        // Berechnungen basierend auf den Bedingungen
        double x4 = x2 / 2;
        double x3 = x1 / 5;


        // Berechnung der Wohnfläche
        double grundrissFlaeche = x1 * x2 - (x1 - 2*x3) * x4;
        double wohnflaeche = grundrissFlaeche * 3; // 3 Etagen


        // Berechnung der Kosten für den Rundweg
        double umfang =  x1 + 2 * x2 + 2 * x3 + 2* x4 +
                (x1 - 2*x3);


        double kostenRundweg = umfang * 175;


        // Ergebnisse ausgeben
        System.out.println("Die Wohnfläche Ihrer Villa beträgt: " + wohnflaeche + " Quadratmeter.");
        System.out.println("Die Kosten für den Rundweg um Ihre Villa betragen: " + kostenRundweg + " Euro.");
    }
}

