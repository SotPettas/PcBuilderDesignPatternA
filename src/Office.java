

//  Η κλάση Office είναι μια υποκλάση της κλάσης Apps και αναπαριστά την εφαρμογή γραφείου Office.

public class Office extends Apps  {

    // Η μέθοδος price() υλοποιείται για να επιστρέφει την τιμή της εφαρμογής Office, η οποία είναι 12.0

    @Override
    public float price() {
        return 12.0f;
    }

    // Η μέθοδος name() επιστρέφει το όνομα της εφαρμογής Office.

    @Override
    public String name() {
        return "Office";
    }

}
