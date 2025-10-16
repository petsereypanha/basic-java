/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basic;

import java.util.Scanner;


public class Exerses2 {
    public static void main(String[] args) {
        int code,qty;
        String name;
        float price,total;
         Scanner sc = new Scanner(System.in);
         
         System.out.print("Input Code   :");  code=sc.nextInt();
         System.out.print("Input Qty    :");  qty=sc.nextInt();
         System.out.print("Input Name   :");  sc.nextLine();name=sc.nextLine();
         System.out.print("Input Price  :");  price=sc.nextFloat();
         total = price * qty;
         
         System.out.println("Output Code   :"+code);
         System.out.println("Output Qty    :"+qty);
         System.out.println("Output Name   :"+name);
         System.out.println("Output Price  :"+price);
         System.out.println("Output Total  :"+total);
    }
    
}
