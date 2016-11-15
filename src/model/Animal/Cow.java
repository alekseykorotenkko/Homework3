package model.Animal;

/**
 * Created by Алексей on 15.11.2016.
 */
public class Cow extends Mammal {
    boolean hoof;
    Cow () {
        super(true, "grass", 4);
    }

    Cow (boolean vegeterians, String eats, int noOflegs) {
        super (vegeterians, eats, noOflegs);
        this.hoof = true;
        this.vegeterians = true;
        this.eats = "grass";
        this.noOfLegs = 4;


    }
    Cow (boolean hoof) {
        super (true, "grass", 4);
        this.hoof = true;
        this.vegeterians = true;
        this.eats = "grass";
        this.noOfLegs = 4;
    }
}
