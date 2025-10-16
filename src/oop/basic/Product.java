package oop.basic;

import oop.Persion;

public class Product extends Persion {
    protected int qty;
    protected float price;
    protected float discount;
    static protected float tax;
    public double Todal() {
        return qty*price;
    }
    public double Payment() {
        return  (Todal() - (Todal() / discount) - tax);
    }
}
