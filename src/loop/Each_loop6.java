package loop;

import java.util.Scanner;

public class Each_loop6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decial number :");
        int num = input.nextInt();     
        int rem;             // for string remainder
        String str2="";     // for string result
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; // digits in hexadecimal number system
        while(num>0)
        {
            rem = num%16;
            str2 = hex[rem]+str2;
            num=num/16;
        }
        System.out.println("Method 2: Decimal to hexa decimal : "+str2);
    }
    
}
