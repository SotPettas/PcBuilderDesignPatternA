


// Η κλάση Windows επεκτείνει την αφαιρετική κλάση Os και αντιπροσωπεύει το λειτουργικό σύστημα Windows.

public class Windows extends Os  {

    // Η μέθοδος price() υλοποιείται για να επιστρέφει την τιμή του λειτουργικού συστήματος
    // Windows, η οποία ορίζεται ως 150.0.

    @Override
    public float price() {
        return 150.0f;
    }

    //  Η μέθοδος name() επιστρέφει το όνομα του λειτουργικού συστήματος, το οποίο σε αυτήν την περίπτωση είναι "Windows".

    @Override
    public String name() {
        return "Windows";
    }

}
