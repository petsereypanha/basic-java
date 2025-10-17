package array;

import java.util.Scanner;

public class Exercises_two_dime {
    public static void main(String[] args) {
        Scanner objin = new Scanner(System.in);
        int j,i;
        int row,colum;
        System.out.print("Input element Row   :");
        row = objin.nextInt();
        System.out.print("Input element Colum :");
        colum = objin.nextInt();
        int arr[][] = new int [row][colum];
        for(i=0;i< row;i++){
            System.out.println("Input New row["+i+"]");
            for(j=0;j<colum;j++){
                System.out.print("Input Colum ["+j+"] :");
                arr[i][j]=objin.nextInt();
            }
            System.out.println("");
        }
        for(i=0;i< row;i++){
            System.out.println("Input New row["+i+"]");
            for(j=0;j<colum;j++){
                if(arr[i][j]%2==0){
                System.out.println("Output Colum ["+j+"] :"+arr[i][j]);
                }
            }
            System.out.println("");
        }
    }
    
}
