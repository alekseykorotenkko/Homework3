package model;

/**
 * Created by Алексей on 14.11.2016.
 */
public class Main {
    public static void main (String[] args)
    {


        Account ac1 = new Account();
        Account ac2 = new Account(8);
        Account ac3 = new Account(8,15);

        System.out.println(ac1.id + "" + ac1.amount);
        System.out.println(ac1.id + "" + ac2.amount);
        System.out.println(ac3.id + "" + ac3.amount);
        ;


    }

}