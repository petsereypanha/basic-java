
package funtion;

import java.util.Scanner;

public final class product_function {
     int code,qty,discount;
    String name;
    float price;
    void Input(){
            Scanner objin = new Scanner(System.in);
            System.out.print("Input ID    :"); code = objin.nextInt();
            System.out.print("Input Qty   :"); qty = objin.nextInt();
            System.out.print("Input Name  :"); name = objin.next();
            System.out.print("Input Price :"); price = objin.nextFloat();
    }
    float Total(){
        return price*qty;
    }
    float Discount(){
        if(Total()>=100 && Total()<500)
        {
            discount = 10;
        }
        else if (Total()>=500 && Total() <1000)
        {
            discount = 20;
        }
        else if(Total()>=100 && Total() <2000)
        {
            discount = 30;
        }
        else{
            discount = 50;
        }
        return discount;
    }
    double Payment(){
        return Total()-Total()*Discount()/100;
    }
    void Output(){
        System.out.println("Code\tQty\tName\tPrice\tDiscont\tTotal\tPayment");
        System.out.println(code+"\t"+qty+"\t"+name+"\t"+price+"\t"+Discount()+"\t"+Total()+"\t"+Payment());
    }
    public product_function(){
        Input();
        Output();
    }
    public static void main(String[] args) {
        new product_function();
    }
    
}

