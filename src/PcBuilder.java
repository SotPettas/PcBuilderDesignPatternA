

// Η κλάση PcBuilder είναι υπεύθυνη για τη δημιουργία διαφόρων ειδών υπολογιστών

public class PcBuilder {

// Η μέθοδος buildStandardPc() δημιουργεί έναν τυπικό υπολογιστή.
    public Pc buildStandardPc() {
        Pc pc = new Pc();



        // Προσθέτουμε αντικείμενα από το ItemPc interface. προσθέτει σε αυτόν συσκευασμένα αντικείμενα όπως επεξεργαστή,
        // κάρτα γραφικών, μνήμη RAM, δίσκο SSD, μητρική πλακέτα, οθόνη, πληκτρολόγιο και ποντίκι, καθώς και
        // λογισμικό όπως τα Windows και ένα αντιικό καταστροφής.
        pc.addItem(new Cpu());
        pc.addItem(new Gpu());
        pc.addItem(new Ram());
        pc.addItem(new Ssd());
        pc.addItem(new MotherBoard());
        pc.addItem(new Monitor());
        pc.addItem(new Keyboard());
        pc.addItem(new Mouse());

        // Προσθέτουμε αντικείμενα από το Software interface
        pc.addSoftware(new Windows());
        pc.addSoftware(new Antivirus());

        return pc;
    }

    // Η μέθοδος buildBasePc() δημιουργεί ένα βασικό μοντέλο υπολογιστή, περιοριζόμενη σε αντικείμενα όπως
    // επεξεργαστή, κάρτα γραφικών, μνήμη RAM, δίσκο SSD και μητρική πλακέτα, καθώς και σε λογισμικό όπως τα Windows.

    public Pc buildBasePc() {
        Pc pc = new Pc();

        // Προσθέτουμε αντικείμενα από το ItemPc interface
        pc.addItem(new Cpu());
        pc.addItem(new Gpu());
        pc.addItem(new Ram());
        pc.addItem(new Ssd());
        pc.addItem(new MotherBoard());

        // Προσθέτουμε αντικείμενα από το Software interface
        pc.addSoftware(new Windows());

        return pc;
    }


    }




