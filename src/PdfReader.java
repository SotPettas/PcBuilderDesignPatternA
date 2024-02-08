

// Η κλάση PdfReader αποτελεί μια υποκλάση της κλάσης Apps και αναπαριστά ένα πρόγραμμα ανάγνωσης PDF.

public class PdfReader extends Apps  {

    // Η μέθοδος price() υλοποιείται για να επιστρέφει την τιμή του προγράμματος ανάγνωσης PDF, η οποία είναι 21.0.

    @Override
    public float price() {
        return 21.0f;
    }

    //  Η μέθοδος name() επιστρέφει το όνομα του προγράμματος ανάγνωσης PDF, το οποίο είναι "PdfReader".

    @Override
    public String name() {
        return "PdfReader";
    }

}
