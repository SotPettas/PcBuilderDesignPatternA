

//  Η κλάση Linux είναι μια υποκλάση της κλάσης Os και αναπαριστά το λειτουργικό σύστημα Linux.


public class Linux extends Os  {

    //Η μέθοδος price() υλοποιείται για να επιστρέφει την τιμή του λειτουργικού συστήματος Linux, η οποία είναι 45.0.

    @Override
    public float price() {
        return 45.0f;
    }

    //    Η μέθοδος name() επιστρέφει το όνομα του λειτουργικού συστήματος, το οποίο είναι "Linux".

    @Override
    public String name() {
        return "Linux";
    }

}
