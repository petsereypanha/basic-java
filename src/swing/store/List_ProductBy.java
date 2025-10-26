package swing.store;

import java.util.ArrayList;

public class List_ProductBy{
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public int getQty() {
        return qty;
    }
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(){
        this.amount = amount;
    }
    private int code,qty;
    private String name;
    private float price;
    private double amount;

    public List_ProductBy(int code, int qty, String name, float price, double amount) {
        this.code = code;
        this.qty = qty;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    
    static  ArrayList<List_ProductBy> listproductby = new ArrayList<>();
    
}
