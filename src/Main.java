import java.util.Scanner; // Importera Scanner klassen

public class Main {
    public static void main(String[] args) {

        // Deklarera konstant värden = En konstant är ett Fast värde som ej kan ändras. Praxis konstanter Id = STORA BOKSTÄVER.
        // MathPI fungerar med direkt i beräkning, utan att behöva ange denna konstant här = MathPI * radius * radius;
        final double PI = 3.14;

        //Deklarera resten av värden
        float radius;
        double area;
        double circ;

        //Hämta information = Hämta information ifrån användaren om cirkelns radie
        Scanner scanner = new Scanner(System.in); // Deklarera en scanner
        System.out.println("Ange kvadratens sida: "); // Fråga användaren om cirkelns radie
        radius = scanner.nextFloat(); // Läs in kvadratens sida som en Float genom scannern

        // Beräkning = Beräkna cirkelns omkrets och area
        area = PI * radius * radius; // Beräkna cirkelns area (Pi x radie x radie)
        circ = PI * 2 * radius; // Beräkna cirkelns omkrets (Pi x 2 x radie)

        // Skriv ut = Skriv ut information på sidan
        System.out.println("Cirkelns omkrets är: " + circ);
        System.out.println("Cirkelns area är: " +area);

    }
}
