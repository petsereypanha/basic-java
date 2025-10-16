package oop.basic;

import oop.Product;

import java.util.Scanner;

public class Type_Product extends Product {

    public Type_Product(){}
    public Type_Product(int _qty,float _price,float _discount){
        tax = 66.F;
        qty = _qty;
        price = _price;
        discount = _discount;
    }
    public void Input(){
        tax = 44.5F;
        Scanner scan = new Scanner(System.in);
        id = (int) Math.floor(Math.random()*100);
        rollNumber = (int)(Math.floor(Math.random()*1000));
        System.out.print("Input Product Name     :");
        name = scan.nextLine();
        System.out.print("Input Product Price    :");
        price = scan.nextFloat();
        System.out.print("Input Product Discount :");
        discount = scan.nextFloat();
        Todal();
        Payment();
    }
    public void Header() {
        System.out.printf("\n%12s %14s %14s %15s %18s %15s %15s\n",
                "ID","RollNum","Name","Price","Discount","Total","Payment");
    }
    public void Output() {
        System.out.printf("\n%12s %14s %14s %15s %18s %15s %15s",
                id,rollNumber,name,price,discount,Todal(),Payment());
    }
}
