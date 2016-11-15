package model.Animal;

/**
 * Created by Алексей on 15.11.2016.
 */
public class Shark extends Fish {
    boolean fin;

    Shark () {
        super(false, "fish", 0);
        this.fin = true;
    }

    Shark (boolean vegeterians, String eats, int noOflegs) {
        super (vegeterians, eats,noOflegs);
        this.fin = true;
        this.vegeterians = false;
        this.eats = "fish";
        this.noOfLegs = 0;


    }
    Shark (boolean fin) {
        super (false, "fish", 0);
        this.fin = true;
        this.vegeterians = false;
        this.eats = "fish";
        this.noOfLegs = 0;
    }
}
