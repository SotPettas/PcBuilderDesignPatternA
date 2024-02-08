

import java.lang.String;


// Η διεπαφή ItemPc ορίζει τα χαρακτηριστικά ενός αντικειμένου Η/Υ.


public interface ItemPc {

    //  Η μέθοδος name() επιστρέφει το όνομα του αντικειμένου.

    public String name();

    //  Η μέθοδος packaging() επιστρέφει τον τύπο συσκευασίας του αντικειμένου.
    public Packaging packaging();

    //  Η μέθοδος price() επιστρέφει την τιμή του αντικειμένου.
    public float price();
}
