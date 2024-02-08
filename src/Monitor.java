



//  Η κλάση Monitor είναι μια υποκλάση της κλάσης Peripherals και αναπαριστά ένα περιφερειακό,
//  συγκεκριμένα έναν οθόνη.

public class Monitor extends Peripherals  {

//  Η μέθοδος packaging() υποκλάσης επιστρέφει ένα αντικείμενο τύπου Boxed,
//  το οποίο αναπαριστά τον τύπο συσκευασίας "Σε κουτί".

    @Override
    public Packaging packaging() {
        return new Boxed();
    }


    //  Η μέθοδος price() υλοποιείται για να επιστρέφει την τιμή της οθόνης, η οποία είναι 335.0.

    @Override
    public float price() {
        return 335.0f;
    }

    // Η μέθοδος name() επιστρέφει το όνομα της οθόνης, το οποίο είναι "Monitor"

    @Override
    public String name() {
        return "Monitor";
    }

}
