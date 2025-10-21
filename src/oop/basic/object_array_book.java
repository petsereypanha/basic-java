package oop.basic;

import java.util.Scanner;

public class object_array_book {
    private int code;
    private String title;
    private String subject;
    private float price;
    
    // defaul
    public object_array_book(){
        code = 129;
        title = "teaching";
        subject = "IT";
        price = 2000;
    }
    
    // constructor with parameter
    public object_array_book(int  code, String title, String subject, float price){
        this.code = code;
        this.title = title;
        this.subject = subject;
        this.price = price;
    }
    
    // Input 
    public void Input(){
        Scanner objin = new Scanner(System.in);
        System.out.print("Input Code    :");code = objin.nextInt();
        System.out.print("Input Title   :");title = objin.next();
        System.out.print("Input Subject :");subject = objin.next();
        System.out.print("Input Price   :");price = objin.nextFloat();
    }
    
    // Output 
    public void Output(){
        System.out.println("  Code     :"+code);
        System.out.println("  Tite     :"+title);
        System.out.println("  Subject  :"+subject);
        System.out.println("  Price    :"+price);
    }
    public static void main(String[] args) {
            // defual
            object_array_book oba = new object_array_book();
            oba.Output();
            
            // constructor with parameter
            object_array_book oba1 = new object_array_book(12000,"Art","Pobuler",2000);
            oba1.Output();
            
            // Input & Output
            object_array_book oba2[];
            oba2 = new object_array_book[30];
            int i,n;
            Scanner objin = new Scanner(System.in);
            System.out.print("Input element of array :");
            n = objin.nextInt();
            for(i=0;i<n;i++){
              oba2[i].Input();
            }
            for(i=0;i<n;i++){
             oba2[i].Output();
            }
    }
    
}
