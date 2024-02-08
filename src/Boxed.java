
// Η κλάση Boxed υλοποιεί τη διεπαφή Packaging και αναπαριστά τον τύπο συσκευασίας "Σε κουτί".


public class Boxed implements Packaging {


    // Η μέθοδος pack() επιστρέφει τον τύπο της συσκευασίας, που είναι "Σε κουτί".


    @Override
    public String pack() {
        return "Boxed";
    }


}
