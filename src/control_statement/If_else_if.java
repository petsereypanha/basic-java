
package control_statement;

import java.text.DecimalFormat;
import java.util.Scanner;

public class If_else_if {
    public static void main(String[] args) {
        int code;
        String name;
        int qty;
        DecimalFormat df = new DecimalFormat("####0.000");
        double price,total,dis,pay;
        Scanner objin = new Scanner(System.in);
        System.out.print("Input Code     :");
        code = objin.nextInt();
        System.out.print("Input Name     :");
        name = objin.next();
        System.out.print("Input Quantity :");
        qty = objin.nextInt();
        System.out.print("Input Price    :");
        price = objin.nextFloat();
        total = price*qty;
        if(total>=1 && total<10)
            dis = total * 0.1;
        else if(total>=10 && total<20)
            dis = total * 0.2;
        else if(total>=20 && total<30)
            dis = total * 0.3;
        else if(total>=30 && total<40)
            dis = total * 0.4;
        else if(total>=40 && total<50)
            dis = total * 0.5;
        else 
            dis = total * 0.6;
        pay = total - dis;
        
        System.out.println("Output Total    :"+df.format(total)+"$");
        System.out.println("Output Discount :"+df.format(dis));
        System.out.println("Output Payment  :"+df.format(pay));
    }
    
}
