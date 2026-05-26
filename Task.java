public class Task {

    String titel;
    boolean erledigt;

    Task(String titel) {
        this.titel = titel;
        this.erledigt = false;
    }

    void anzeigen() {
        String status = erledigt ? "✓" : "✗";
        System.out.println(status + " " + titel);
    }
} // eoc
