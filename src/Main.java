import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Spiel spiel = new Spiel();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Willkommen zum Spiel!");

        while(!spiel.isSpielBeendet()) {
            druckeFeld(spiel.getFeld());
            System.out.print("Spieler " + spiel.getSamZug().getSymbol() + " ist am Zug: ");
            System.out.println("\nEingabe: Reihe (0-3)");
            int r = scanner.nextInt();
            System.out.println("Eingabe: Spalte (0-3)");
            int s = scanner.nextInt();
            System.out.println(spiel.macheZug(r, s));
        }

        druckeFeld(spiel.getFeld());
        System.out.println("---Spiel ist beendet.---");
    }

    private static void druckeFeld(Feld feld) {

        System.out.print("   ");
        for (int s = 0; s < 4; s++) {
            System.out.print(s + " ");
        }
        System.out.println();

        for (int r = 0; r < 4; r++) {
            System.out.print(r + "  ");
            for (int s = 0; s < 4; s++) {
                char c = feld.getFeld(r, s);
                System.out.print(c == '\u0000' ? ". " : c + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
