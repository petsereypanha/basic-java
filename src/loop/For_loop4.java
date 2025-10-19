
package loop;

import static java.lang.Math.cos;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class For_loop4 {
    public static void main(String[] args) {
            int i,n;
            int op;
            Scanner objin = new Scanner(System.in);
            do{
                System.out.println("\n__________________| M E N U |___________________");
                System.out.println(" 1/. 1 + 2 + 3 + 4 + .... + n");
                System.out.println(" 2/. 2 + 6 + 8 + 10 + ... + (2n)");
                System.out.println(" 3/. 2 + 5 + 8 + 11 + ... + (3n-1)");
                System.out.println(" 4/. 1 * 2 * 3 * 4 * ... * n");
                System.out.println(" 5/. pow(1,2) + pow(2,2) + pow(3,2) + ... + pow(n,2)");
                System.out.println(" 6/. pow(2,3) + pow(4,3) + pow(6,3) + ... + pow(2n,3)");
                System.out.println(" 7/. sqrt(1) + sqrt(2) + sqrt(3) + ... + sqrt(n)");
                System.out.println(" 8/. sqrt(2) + sqrt(4) + sqrt(6) + ... + sqrt(2n)");
                System.out.println(" 9/. sin(0) + sin(1) + sin(2) + sin(3) + ... +sin(n)");
                System.out.println(" 10/. cos(0) + cos(1) + cos(2) + cos(3) + ... +cos(n)");
                System.out.println(" 11/. 1! + 2! + 3! + 4! + ... + n!");
                System.out.println(" 12/. Exit");
                System.out.print("Input Select One Option :");
                op=objin.nextInt();
                switch(op){
                    case 1 -> {
                        float sum=0;
                         System.out.println(" 1/. 1 + 2 + 3 + 4 + .... + n");
                         System.out.print("Input Number for loop : ");
                         n=objin.nextInt();
                        for(i=1;i<=n;i++){
                            sum=sum+i;
                            System.out.print(i+" + ");
                        }
                        System.out.println("\b\b = "+sum);
                    }
                    case 2 -> {
                        float sum=0;
                        System.out.println(" 2/. 2 + 6 + 8 + 10 + ... + (2n)");
                        System.out.print("Input Number for loop : ");
                        n=objin.nextInt();
                        for(i=1;i<=n;i++){
                            sum+=(2*n);
                            System.out.print((2*i)+" + ");
                        }
                        System.out.println("\b\b = "+sum);
                    }
                    case 3 -> {
                        float sum=0;
                        System.out.println(" 3/. 2 + 5 + 8 + 11 + ... + (3n-1)");
                        System.out.print("Input Number for loop : ");
                        n=objin.nextInt();
                        for(i=1;i<=n;i++){
                            sum+=(3*i-1);
                            System.out.print((3*i-1)+" + ");
                        }
                        System.out.println("\b\b = "+sum);
                    }
                    case 4 -> {
                        float sum=0;
                        System.out.println(" 4/. 1 * 2 * 3 * 4 * ... * n");
                        System.out.print("Inpu Number for loop : ");
                        n=objin.nextInt();
                        for(i=1;i<=n;i++){
                            sum=sum*(i);
                            System.out.print(i+" * ");
                        }
                        System.out.println("\b\b = "+sum);
                    }
                    case 5 -> {
                        float sum=0;
                         System.out.println(" 5/. pow(1,2) + pow(2,2) + pow(3,2) + ... + pow(n,2)");
                         System.out.print("Input Number for loop : ");
                         n=objin.nextInt();
                         for(i=1;i<=n;i++){
                             sum=(float) (sum+pow(i,2));
                             System.out.print(pow(i,2)+" + ");
                         }
                         System.out.println("\b\b = "+sum);
                    }
                    case 6 -> {
                        float sum=0;
                        System.out.println(" 6/. pow(2,3) + pow(4,3) + pow(6,3) + ... + pow(2n,3)");
                        System.out.print("Input Number for loop : ");
                         n=objin.nextInt();
                         for(i=1;i<=n;i++){
                             sum=(float) (sum+pow(2*i,2));
                             System.out.print(pow(2*i,2)+" + ");
                         }
                         System.out.println("\b\b = "+sum);
                    }
                    case 7 -> {
                        float sum=0;
                        System.out.println(" 7/. sqrt(1) + sqrt(2) + sqrt(3) + ... + sqrt(n)");
                        System.out.print("Input Number for loop : ");
                         n=objin.nextInt();
                         for(i=1;i<=n;i++){
                             sum=(float) (sum+sqrt(i));
                             System.out.print(sqrt(i)+" + ");
                         }
                         System.out.println("\b\b = "+sum);
                    }
                    case 8 -> {
                        float sum=0;
                        System.out.println(" 8/. sqrt(2) + sqrt(4) + sqrt(6) + ... + sqrt(2n)");
                        System.out.print("Input Number for loop : ");
                         n=objin.nextInt();
                         for(i=1;i<=n;i++){
                             sum=(float) (sum+sqrt(2*i));
                             System.out.print(sqrt(2*i)+" + ");
                         }
                         System.out.println("\b\b = "+sum);
                    }
                    case 9 -> {
                        float sum=0;
                        System.out.println(" 9/. sin(0) + sin(1) + sin(2) + sin(3) + ... +sin(n)");
                        System.out.print("Input Number for loop : ");
                         n=objin.nextInt();
                         for(i=1;i<=n;i++){
                             sum=(float) (sum+sin(i));
                             System.out.print(sin(i)+" + ");
                         }
                         System.out.println("\b\b = "+sum);
                    }
                    case 10 -> {
                         float sum=0;
                        System.out.println(" 10/. cos(0) + cos(1) + cos(2) + cos(3) + ... +cos(n)");
                        System.out.print("Input Number for loop : ");
                         n=objin.nextInt();
                         for(i=1;i<=n;i++){
                             sum= (float) (sum+cos(i));
                             System.out.print(cos(i)+" + ");
                         }
                         System.out.println("\b\b = "+sum);
                    }
                    case 11 -> {
                        float sum = 1,sum1 = 0;
                        System.out.println(" 11/. 1! + 2! + 3! + 4! + ... + n!");
                        System.out.print("Input Number for loop : ");
                        n=objin.nextInt();
                        for(i=1;i<=n;i++){
                            sum = sum * i;
                            sum1 = sum1 +sum;
                            System.out.print(i+"! + ");
                        }
                        System.out.println("\b\b = "+sum1);
                    }
                    
                }
            }while(op!=12);
        }
    }
    
