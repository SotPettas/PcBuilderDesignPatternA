

// Η κλάση Assembled υλοποιεί τη διεπαφή Packaging και αναπαριστά τον τύπο συσκευασίας "Συναρμολογημένο".

public class Assembled implements Packaging  {

    // Η μέθοδος pack() επιστρέφει τον τύπο της συσκευασίας, που είναι "Συναρμολογημένο".
    @Override
    public String pack() {
        return "Assembled";
    }

}
