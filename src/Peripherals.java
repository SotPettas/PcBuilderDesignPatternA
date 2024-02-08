

// Η αφαιρετική κλάση Peripherals υλοποιεί το διεπαφή ItemPc και αντιπροσωπεύει περιφερειακές συσκευές υπολογιστή.


public abstract class Peripherals implements ItemPc  {

    // Η μέθοδος packaging() επιστρέφει ένα αντικείμενο συσκευασίας τύπου Boxed, που υποδηλώνει
    // ότι οι περιφερειακές συσκευές είναι συσκευασμένες σε κουτί.


    @Override
    public Packaging packaging() {
        return new Boxed();
    }

    // Η μέθοδος price() είναι αφαιρετική και πρέπει να υλοποιηθεί από τις υποκλάσεις
    // της κλάσης για να επιστρέψει την τιμή της περιφερειακής συσκευής.

    @Override
    public abstract float price();
}
