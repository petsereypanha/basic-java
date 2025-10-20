
package control_statement;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExampleThree {
    public static void main(String[] args) {
        Scanner objin = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###0.00");
        float score1,score2,score3,score4,score5,total,average;
        System.out.print("Input   Score 1   :");
          score1 = objin.nextFloat();
        System.out.print("Input   Score 2   :");
          score2 = objin.nextFloat();
        System.out.print("Input   Score 3   :");
          score3 = objin.nextFloat();
        System.out.print("Input   Score 4   :");
          score4 = objin.nextFloat();
        System.out.print("Input   Score 5   :");
          score5 = objin.nextFloat();
        total = score1+score2+score3+score4+score5;
        average = total/5;
        
        System.out.println("Output Score 1  :"+df.format(score1));
        System.out.println("Output Score 1  :"+df.format(score2));
        System.out.println("Output Score 1  :"+df.format(score3));
        System.out.println("Output Score 1  :"+df.format(score4));
        System.out.println("Output Score 1  :"+df.format(score5));
        System.out.println("Output Total    :"+df.format(total));
        System.out.println("Output Average  :"+df.format(average));
       
    }
    
}
