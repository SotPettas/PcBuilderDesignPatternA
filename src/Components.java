
// Η αφηρημένη κλάση Components είναι μια υποκλάση της διεπαφής ItemPc και αναπαριστά
// κοινά χαρακτηριστικά των συστατικών ενός υπολογιστή.


public abstract class Components implements ItemPc  {

    // Η μέθοδος packaging() υποκλάσης επιστρέφει ένα αντικείμενο τύπου Assembled,
    // το οποίο αναπαριστά τον τύπο συσκευασίας "Συναρμολογημένο" για τα συστατικά.

    @Override
    public Packaging packaging() {
        return new Assembled();
    }

    // Η μέθοδος price() είναι αφηρημένη και πρέπει να υλοποιηθεί από τις υποκλάσεις της κλάσης
    // Components. Αυτή η μέθοδος θα επιστρέφει την τιμή του κάθε συστατικού.

    @Override
    public abstract float price();


}
