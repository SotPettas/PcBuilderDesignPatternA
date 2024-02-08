

     // Η κλάση Keyboard είναι μια υποκλάση της κλάσης Peripherals
     // και αναπαριστά ένα περιφερειακό, συγκεκριμένα ένα πληκτρολόγιο.

public class Keyboard extends Peripherals  {

    //  Η μέθοδος packaging() υποκλάσης επιστρέφει ένα αντικείμενο τύπου Boxed,
    //  το οποίο αναπαριστά τον τύπο συσκευασίας "Σε κουτί".

    @Override
    public Packaging packaging() {
        return new Boxed();
    }

    // Η μέθοδος price() υλοποιείται για να επιστρέφει την τιμή του πληκτρολογίου, η οποία είναι 15.0

    @Override
    public float price() {
        return 15.0f;
    }

    // Η μέθοδος name() επιστρέφει το όνομα του πληκτρολογίου, το οποίο είναι "Keyboard"

    @Override
    public String name() {
        return "Keyboard";
    }

}
