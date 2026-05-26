import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {
    public static void main(String[] args) {

        ArrayList<Task> aufgaben = new ArrayList<>();
        Scanner eingabe = new Scanner(System.in);
        int wahl = -1;

        while (wahl != 0) {
            System.out.println("\n=== To-Do Liste ===");
            System.out.println("1 = Aufgabe hinzufügen");
            System.out.println("2 = Alle Aufgaben anzeigen");
            System.out.println("3 = Aufgabe als erledigt markieren");
            System.out.println("0 = Beenden");
            System.out.print("Deine Wahl: ");
            wahl = eingabe.nextInt();

            if (wahl == 1) {
                eingabe.nextLine();
                System.out.println("Wahl 1: Welche Aufgabe möchtest du hinzufügen?:  ");
                String titel = eingabe.nextLine();
                aufgaben.add(new Task(titel));
                System.out.println("Die Aufgabe: " + titel + " wurde hinzugefügt.");

            } else if (wahl == 2) {
                for (Task t : aufgaben) {
                    t.anzeigen();
                }
            } else if (wahl == 3) {
                for (int i = 0; i < aufgaben.size(); i++) {
                    System.out.print(i + ": ");
                    aufgaben.get(i).anzeigen();
                }
                System.out.print("Welche Nummer ist erledigt?: ");
                int nummer = eingabe.nextInt();
                aufgaben.get(nummer).erledigt = true;
                System.out.println("Aufgabe als erledigt markiert! ✓");
            } else if (wahl == 0) {
                System.out.println("Viel Erfolg beim erledigen der Aufgaben");
            }
        }
    } // eom
} // eoc
