

//  Η κλάση MotherBoard είναι μια υποκλάση της κλάσης Components και αναπαριστά τη μητρική πλακέτα του υπολογιστή

public class MotherBoard extends Components  {

    // Η μέθοδος price() υλοποιείται για να επιστρέψει την τιμή της μητρικής πλακέτας, η οποία είναι 78.0.

    @Override
    public float price() {
        return 78.0f;
    }

    //Η μέθοδος name() επιστρέφει το όνομα της μητρικής πλακέτας, το οποίο είναι "MotherBoard".

    @Override
    public String name() {
        return "MotherBoard";
    }

}
