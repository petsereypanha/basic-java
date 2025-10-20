
package control_statement;

import java.util.Scanner;

public class If_else1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.print("Input X   :");
        x=sc.nextInt();
        System.out.print("Input Y   :");
        y=sc.nextInt();
        if (x>y) {
            System.out.println("X is Greater than Y");
        } else {
            System.out.println("Y is Greter than X");
        }
    }
    
}
