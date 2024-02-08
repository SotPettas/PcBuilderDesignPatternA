
import java.util.ArrayList;
import java.util.List;

//  Η κλάση Pc αντιπροσωπεύει έναν υπολογιστή.
public class Pc {

    // δύο ιδιωτικές λίστες itemPcs και softwares για τα αντικείμενα και το λογισμικό αντίστοιχα.

    private List<ItemPc> itemPcs = new ArrayList<>();
    private List<Software> softwares = new ArrayList<>();

    // Η μέθοδος addItem προσθέτει ένα αντικείμενο στη λίστα itemPcs.

    public void addItem(ItemPc item) {
        itemPcs.add(item);
    }

    // Η μέθοδος addSoftware προσθέτει ένα λογισμικό στη λίστα softwares.

    public void addSoftware(Software software) {
        softwares.add(software);
    }

    // Η μέθοδος getTotalPrice υπολογίζει το συνολικό κόστος του υπολογιστή, συμπεριλαμβανομένων
    // των αντικειμένων και του λογισμικού.

    public float getTotalPrice() {
        float totalPrice = 0.0f;
        for (ItemPc item : itemPcs) {
            totalPrice += item.price();
        }
        for (Software software : softwares) {
            totalPrice += software.price();
        }
        return totalPrice;
    }

    //  Η μέθοδος showItems εμφανίζει τα αντικείμενα και το λογισμικό του υπολογιστή, μαζί
    //  με τις τιμές τους και τον τρόπο συσκευασίας των αντικειμένων.

    public void showItems() {
        System.out.println("Hardware Items:");
        for (ItemPc item : itemPcs) {
            System.out.println("Item: " + item.name() + " Packaging: " + item.packaging().pack() + " Price: " + item.price());
        }

        System.out.println("Software Items:");
        for (Software software : softwares) {
            System.out.println("Price: " + software.price() + " Software: " + software.name());
        }
    }




}
