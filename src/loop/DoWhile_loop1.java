package loop;

import java.util.Scanner;

public class DoWhile_loop1 {
    public static void main(String[] args) {
        double  sum;
        int n,i;
        String op,st;
        Scanner objin = new Scanner(System.in);
        do{
            System.out.println("A. Sum Loop 1");
            System.out.println("B. Sum Loop 2");
            System.out.println("C. Sum Loop 3");
            System.out.println("D. Sum Loop 4");
            System.out.println("E. Sum Loop 5");
            System.out.println("F. Sum Loop 6");
            System.out.print("Choose One (A->F) :");
            op=objin.next();
            System.out.print("Input Number Of Loop :");
            n=objin.nextInt();
            switch(op){
                case "a", "A" -> {
                    sum=0.0;
                    for(i=1;i<n;i++){
                        sum = sum +i;
                    }
                    System.out.println("Sum of Loop1 :"+sum);
                }
                case "b", "B" -> {
                    sum=0.0;
                    for(i=1;i<n;i++){
                        sum = sum + Math.sqrt(i);
                    }
                    System.out.println("Sum of Loop2 :"+sum);
                }
                case "c", "C" -> {
                    sum=0.0;
                    for(i=1;i<n;i++){
                        sum = sum + Math.pow(i, 3);
                    }
                    System.out.println("Sum of Loop3 :"+sum);
                }
                case "d", "D" -> {
                    sum=0.0;
                    for(i=1;i<n;i++){
                        sum = sum + Math.sin(i);
                    }
                    System.out.println("Sum of Loop4 :"+sum);
                }
                case "f", "F" -> {
                    sum=0.0;
                    for(i=1;i<n;i++){
                        sum = sum + Math.log(i);
                    }
                    System.out.println("Sum of Loop5 :"+sum);
                }
            }
            System.out.println("Press Yes to Continue ..! or Press No Exit ..!");
          st=objin.next();
        }while(st.equals("Yes"));
    }
    
}
