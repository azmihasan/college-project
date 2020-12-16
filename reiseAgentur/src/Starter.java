import entities.*;

import java.util.Scanner;

public class Starter {

    private static Scanner scan = new Scanner(System.in);
    private static Reiseagentur reise;
    private static final boolean GUI = true;

    public static void main(String[]args){

        reise = new Reiseagentur("Reiseagentur","DE01");
        reise.setAdresse(new Adresse("Die Straße","10","10432","Berlin"));

        showMenue();
        int choice = readUserInput();
        processUserInput(choice);



    }

    public static void showMenue(){

        String menuEntries[] = { "Privatkunde anlegen",
                "Geschaeftskunde anlegen",
                "Reservierung anlegen und Kundennummer zuordnen",
                "Kunde mit Reservierungen anzeigen (Auswahl durch Kundennummer)",
                "Kunde mit Reservierungen anzeigen (Auswahl durch Name)",
                "Reservierungen anzeigen (Auswahl durch Reservierungsnummer)",
                "Beenden" };

        System.out.println("Menü");
        System.out.println("=====");

        for (int i=0;i < menuEntries.length;i++){
            System.out.println((i+1) + ".t"+ menuEntries[i]);
        }
    }

    private static int readUserInput() {

        int choice = -1;

        System.out.print("Auswahl:" + "\t");

        if (scan.hasNextLine()) {
            String stringChoice = scan.nextLine();
            try {

                choice = Integer.parseInt(stringChoice);
            } catch (NumberFormatException nfe) {
                System.err.println(nfe.getMessage());
            }
        }
        System.out.println();

        return choice;
    }

    private static void processUserInput(int choice) {

        switch (choice) {
            case 1:
                privatkundeAnlegen();
                break;
            case 2:
                geschaeftskundeAnlegen();
                break;
            case 3:
                reservierungAnlegen();
                break;
            case 4:
                kundenDurchNummerSuchen();
                break;
            case 5:
                kundenDurchNameSuchen();
                break;
            case 6:
                reservierungSuchen();
                break;
            case 7:
                quitApp();
                break;
            default: {
                System.out.println("Invalider Input!");
                scan.reset();
            }

        }
    }

    private static void privatkundeAnlegen() {
        
        reise.addKunden(new Privatkunde(Anrede.Herr,"",""));

    }

    private static void geschaeftskundeAnlegen() {

    }

    private static void reservierungAnlegen() {

    }

    private static void reservierungSuchen() {

    }

    private static void kundenDurchNameSuchen() {

    }

    private static void kundenDurchNummerSuchen() {

    }

    private static void quitApp() {
        scan.close();
        System.exit(0);
    }

}
