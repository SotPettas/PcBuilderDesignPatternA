

// Η κλάση Cpu είναι μια υποκλάση της κλάσης Components και αναπαριστά ένα επεξεργαστή (CPU).

public class Cpu extends Components  {

    // Η μέθοδος price() υλοποιείται για να επιστρέφει την τιμή του επεξεργαστή, η οποία είναι 125.0.

    @Override
    public float price() {
        return 125.0f;
    }

    // Η μέθοδος name() επιστρέφει το όνομα του επεξεργαστή, το οποίο είναι "CPU".

    @Override
    public String name() {
        return "CPU";
    }

}
