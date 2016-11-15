package model.Animal;

/**
 * Created by Алексей on 15.11.2016.
 */
public class Main extends Animal {
    Main(boolean vegeterians, String eats, int noOfLegs) {
        super(true, "+", 1);
    }

    public static void main(String[] args) {

        Shark shark1 = new Shark();
        System.out.println(shark1.fin + "|" + shark1.noOfLegs + "|" + shark1.eats + "|" + shark1.vegeterians);

        Shark shark2 = new Shark(true);
        System.out.println(shark2.fin + "|" + shark2.noOfLegs + "|" + shark2.eats + "|" + shark2.vegeterians);

        Shark shark3 = new Shark(true, "fish", 0);
        System.out.println(shark3.fin + "|" + shark3.noOfLegs + "|" + shark3.eats + "|" + shark3.vegeterians);

        Eagle eagle1 = new Eagle();
        System.out.println(eagle1.feathers + "|" + eagle1.noOfLegs + "|" + eagle1.eats + "|" + eagle1.vegeterians);

        Eagle eagle2 = new Eagle(true);
        System.out.println(eagle2.feathers + "|" + eagle2.noOfLegs + "|" + eagle2.eats + "|" + eagle2.vegeterians);

        Eagle eagle3 = new Eagle(true, "worm", 2);
        System.out.println(eagle3.feathers + "|" + eagle3.noOfLegs + "|" + eagle3.eats + "|" + eagle3.vegeterians);

        Cow cow1 = new Cow();
        System.out.println(cow1.hoof + "|" + cow1.noOfLegs + "|" + cow1.eats + "|" + cow1.vegeterians);

        Cow cow2 = new Cow(true);
        System.out.println(cow2.hoof + "|" + cow2.noOfLegs + "|" + cow2.eats + "|" + cow2.vegeterians);

        Cow cow3 = new Cow(true, "grass", 4);
        System.out.println(cow3.hoof + "|" + cow3.noOfLegs + "|" + cow3.eats + "|" + cow3.vegeterians);


    }
}




