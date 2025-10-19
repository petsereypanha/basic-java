package loop;

import java.util.Scanner;

public class Each_loop3 {
    public static void main(String[] args) {
        int temp;
        boolean isPrime = true;
        int num;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter any number :");   // capture the input in an integer
            num = scan.nextInt();
        } // capture the input in an integer
        for(int i=2;i<=num/2;i++){
            temp=num%i;
            if(temp==0){
                isPrime=false;
                break;
            }
        }
        // If isPrime is true then the number is prime else not
        if(isPrime){
            System.out.println(num+" is a Prime Number");
        }
        else{
            System.out.println(num+"is not a Prime Number");
        }
    }
    
}
