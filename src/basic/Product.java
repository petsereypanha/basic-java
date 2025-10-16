package basic;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        int code,qty;
        String name;
        float price;
        double total;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input Code    :"); code=sc.nextInt();
        System.out.print("Input Qty     :"); qty=sc.nextInt();
        System.out.print("Input Name    :");  sc.nextLine(); name=sc.nextLine();
        System.out.print("Input Price   :"); price=sc.nextFloat();
        total=price*qty;
        
        System.out.println("Output Code    :"+code);
        System.out.println("Output Qty    :"+qty);
        System.out.println("Output Name    :"+name);
        System.out.println("Output Price    :"+price);
        System.out.println("Output Total    :"+total);


    }
    
}
