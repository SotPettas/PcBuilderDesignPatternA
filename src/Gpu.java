

// Η κλάση Gpu είναι μια υποκλάση της κλάσης Components και αναπαριστά μια κάρτα γραφικών (GPU).

public class Gpu extends Components  {

    // Η μέθοδος price() υλοποιείται για να επιστρέφει την τιμή της κάρτας γραφικών, η οποία είναι 225.0.
    @Override
    public float price() {
        return 225.0f;
    }

    // Η μέθοδος name() επιστρέφει το όνομα της κάρτας γραφικών, το οποίο είναι "GPU"

    @Override
    public String name() {
        return "GPU";
    }

}
