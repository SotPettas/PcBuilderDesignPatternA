

//  Η κλάση Mouse είναι μια υποκλάση της κλάσης Peripherals και αναπαριστά ένα περιφερειακό, συγκεκριμένα ένα ποντίκι.

public class Mouse extends Peripherals  {

// Η μέθοδος packaging() υποκλάσης επιστρέφει ένα αντικείμενο τύπου Boxed,
// το οποίο αναπαριστά τον τύπο συσκευασίας "Σε κουτί".


    @Override
    public Packaging packaging() {
        return new Boxed();
    }

    // Η μέθοδος price() υλοποιείται για να επιστρέφει την τιμή του ποντικιού, η οποία είναι 5.0.

    @Override
    public float price() {
        return 5.0f;
    }

    // Η μέθοδος name() επιστρέφει το όνομα του ποντικιού, το οποίο είναι "Mouse".

    @Override
    public String name() {
        return "Mouse";
    }

}
