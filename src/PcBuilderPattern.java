

//  Η κλάση PcBuilderPattern παρουσιάζει ένα παράδειγμα εφαρμογής του σχεδιαστικού προτύπου Builder
//  για τη δημιουργία διαφόρων ειδών υπολογιστών.

public class PcBuilderPattern {

    //  Η μέθοδος main αρχικοποιεί ένα αντικείμενο της κλάσης PcBuilder

    public static void main(String[] args) {
        PcBuilder builder = new PcBuilder();

        // χρησιμοποιεί τον κατασκευαστή της για να δημιουργήσει ένα τυπικό υπολογιστή (standardPc).

        Pc standardPc = builder.buildStandardPc();

        // Στη συνέχεια, εμφανίζει τα στοιχεία του  υπολογιστή καθώς και το συνολικό κόστος τους,
        // χρησιμοποιώντας τις μεθόδους showItems() και getTotalPrice() της κλάσης Pc.


        System.out.println("Standard PC:");
        standardPc.showItems();
        System.out.println("Total Price: " + standardPc.getTotalPrice());

        // χρησιμοποιεί τον κατασκευαστή της για να δημιουργήσει ένα βασικό υπολογιστή (basePc).

        Pc basePc = builder.buildBasePc();

        // Στη συνέχεια, εμφανίζει τα στοιχεία του  υπολογιστή καθώς και το συνολικό κόστος τους,
        // χρησιμοποιώντας τις μεθόδους showItems() και getTotalPrice() της κλάσης Pc.

        System.out.println("\nBase PC:");
        basePc.showItems();
        System.out.println("Total Price: " + basePc.getTotalPrice());
    }


    }


