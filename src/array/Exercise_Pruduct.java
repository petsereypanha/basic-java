package array;

import java.util.Scanner;

public class Exercise_Pruduct {
    public static void main(String[] args) {
            int j,i;
            int id[][] = new int[10][3];
            Scanner objin = new Scanner(System.in);
            String name[][] = new String[10][3];
            float Price[][] = new float[10][3];
            for(i=0;i<10;i++){
                for(j=0;j<3;j++){
                    System.out.print("Input ID    :");
                    id[i][j] = objin.nextInt();
                    System.out.print("Input Name  :");
                    name[i][j] = objin.next();
                    System.out.print("Input Price :");
                    Price[i][j] = objin.nextFloat();
                }
                System.out.println("");
            }
    }
    
}
