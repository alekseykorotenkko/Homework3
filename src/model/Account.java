package model;

/**
 * Created by Алексей on 14.11.2016.
 */
public class Account {
    int id;
    int amount;

    Account()
    {}

    Account (int i){this.id = i;}
    Account(int i, int a)
    {
        this.id = i;
        this.amount = a;

    }

    public int getId(){
        return (id);
    }

    public int getAmount(){
        return (amount);
    }
}