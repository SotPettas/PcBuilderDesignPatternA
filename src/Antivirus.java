
// Η κλάση Antivirus είναι μια υποκλάση της κλάσης Apps και υλοποιεί το λογισμικό αντιιών.

public class Antivirus extends Apps  {


    // Η μέθοδος price() επιστρέφει την τιμή του λογισμικού αντιιών
    @Override
    public float price() {
        return 35.0f;
    }

    // Η μέθοδος name() επιστρέφει το όνομα του λογισμικού αντιιών

    @Override
    public String name() {
        return "Antivirus";
    }

}
