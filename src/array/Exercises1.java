
package array;

import java.util.Scanner;

public class Exercises1 {
    public static void main(String[] args) {
         String id [] = new String[40];
        String name [] = new String[40];
        double score[] = new double[40];
        int i,n;
        Scanner objin = new Scanner(System.in);
        System.out.print("Input Element of Array :");
        n = objin.nextInt();
        for(i=0;i<n;i++){
            System.out.print("Input Id   ["+i+"] :");
            id[i] = objin.next();
            System.out.print("Input Name ["+i+"] :");
            name[i] = objin.next();
            System.out.print("Input Score["+i+"] :");
            score [i] = objin.nextDouble();
        }
        for(i=0;i<n;i++){
            System.out.print("Input Id   ["+i+"]  :"+id[i]);
            System.out.print("\tInput Name ["+i+"]  :"+name[i]);
            System.out.println("\tInput Score["+i+"]  :"+score[i]);
        }
    }
    
}
