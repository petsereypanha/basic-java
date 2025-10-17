package array;

import java.util.Scanner;

public class two_dimensional_row_col {
    public static void main(String[] args) {
        int array[][] = new int[30][20];
        int i,j,row,col;
        Scanner cin = new Scanner(System.in);
        do{
            System.out.print(" Input number of row :");
            row=cin.nextInt();
        }while(row>30);
        do{
            System.out.print(" Input number of row :");
            col=cin.nextInt();
        }while(col>20);
        
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print(" Input array ["+i+"]["+j+"] =");
                array[i][j] = cin.nextInt();
            }
        }
        
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print(" "+array[i][j]);
            }
            System.out.println("");
        }
    }
    
}
