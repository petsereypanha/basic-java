package array;

import java.util.Scanner;

public class two_dimesional_product {
    public static void main(String[] args) {
        String product[][] = new String[10][5];
        int i,n = 0;
        double total;
        Scanner objin = new Scanner(System.in);
        do{
            System.out.print("Input number of product :");
            n=objin.nextInt();
        }while(n>10);
        for(i=0;i<n;i++){
            System.out.println("================= Product :"+i+" ==================");
            System.out.print(" Input ID    :");product[i][0]=objin.next();
            System.out.print(" Input Name  :");objin.nextLine();product[i][1]=objin.nextLine();
            System.out.print(" Input Price :");product[i][2]=objin.next();
            System.out.print(" Input Qty   :");product[i][3]=objin.next();
            
            total = Float.parseFloat(product[i][2]) * Integer.parseInt(product[i][3]);
            product[i][4]=String.valueOf(total);
            
        } 
        System.out.printf("%-12s%-14s%-15s%-13s%-15s\n","ID","Name","Price","QTY","Total");
        for(i=0;i<n;i++){
            System.out.printf("%-12s%-14s%-15s%-13s%-15s\n",product[i][0],product[i][1],product[i][2],product[i][3],product[i][4]);
        }
    }
    
}
