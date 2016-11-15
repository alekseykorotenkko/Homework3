package model.Animal;

/**
 * Created by Алексей on 15.11.2016.
 */
public class Eagle extends Bird {
    boolean feathers;
    Eagle () {
        super(false, "worm", 2);
    }

    Eagle (boolean vegeterians, String eats, int noOflegs) {
        super (vegeterians, eats, noOflegs);
        this.feathers = true;
        this.vegeterians = false;
        this.eats = "worm";
        this.noOfLegs = 2;


    }
    Eagle (boolean feathers) {
        super (false, "worm", 2);
        this.feathers = true;
        this.vegeterians = false;
        this.eats = "worm";
        this.noOfLegs = 2;
    }
}
