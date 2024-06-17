
/* Aufgabe 1: Programmieren in C
Schreiben Sie ein Java-Programm, das die Anzahl der Sekunden im Monat Oktober 2019
berechnet */




        public class Main {
            public static void main(String[] args) {




                // Definiere die Anzahl der Tage im Oktober 2019
                int tageImOktober = 31;


                // Definiere die Anzahl der Stunden pro Tag
                int stundenProTag = 24;


                // Definiere die Anzahl der Minuten pro Stunde
                int minutenProStunde = 60;


                // Definiere die Anzahl der Sekunden pro Minute
                int sekundenProMinute = 60;


                // Berechne die Gesamtanzahl der Sekunden im Oktober 2019
                int sekundenImOktober = tageImOktober * stundenProTag *
                        minutenProStunde * sekundenProMinute;


                // Ausgabe der Ergebnisse
                System.out.println("Die Anzahl der Sekunden im Oktober 2019 beträgt: " + sekundenImOktober);


            }
        }