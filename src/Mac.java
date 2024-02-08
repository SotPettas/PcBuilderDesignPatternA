


//  Η κλάση Mac είναι μια υποκλάση της κλάσης Os και αναπαριστά το λειτουργικό σύστημα Mac.

public class Mac extends Os  {

//  Η μέθοδος price() υλοποιείται για να επιστρέφει την τιμή του λειτουργικού συστήματος Mac, η οποία είναι 105.0.

    @Override
    public float price() {
        return 105.0f;
    }


    //   Η μέθοδος name() επιστρέφει το όνομα του λειτουργικού συστήματος, το οποίο είναι "Mac".

    @Override
    public String name() {
        return "Mac";
    }

}
