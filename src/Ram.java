

//Η κλάση Ram αντιπροσωπεύει τη μνήμη RAM και επεκτείνει την αφαιρετική κλάση Components.


public class Ram extends Components  {


    // Η μέθοδος price() υλοποιείται για να επιστρέφει την τιμή της μνήμης RAM, η οποία ορίζεται ως 33.0.

    @Override
    public float price() {
        return 33.0f;
    }


    //  Η μέθοδος name() επιστρέφει το όνομα του αντικειμένου, το οποίο σε αυτήν την περίπτωση είναι "RAM".

    @Override
    public String name() {
        return "RAM";
    }

}
