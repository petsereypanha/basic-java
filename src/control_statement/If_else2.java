
package control_statement;

import java.util.Scanner;

public class If_else2 {
    public static void main(String[] args) {
        Scanner objin = new Scanner(System.in);
        String sex;
        System.out.print("Input Gender(Male Or Female):");
        sex=objin.next();
        
        if (sex.equalsIgnoreCase("Male")) {
            System.out.println("Yes, right You input Male");
        } else {
            System.out.println("No, right You Input Other Gender");
        }
    }
    
}
