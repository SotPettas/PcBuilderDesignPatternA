

// Η κλάση Ssd αντιπροσωπεύει έναν SSD και επεκτείνει την αφαιρετική κλάση Components.


public class Ssd extends Components  {

    // Η μέθοδος price() υλοποιείται για να επιστρέφει την τιμή του SSD, η οποία ορίζεται ως 77.0.

    @Override
    public float price() {
        return 77.0f;
    }

    //Η μέθοδος name() επιστρέφει το όνομα του αντικειμένου, το οποίο σε αυτήν την περίπτωση είναι "SSD".

    @Override
    public String name() {
        return "SSD";
    }

}
