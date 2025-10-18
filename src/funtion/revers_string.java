package funtion;

import java.util.Scanner;

public final class revers_string {
    void ReversSting()
    {
        String original, revers = " ";
            Scanner in = new Scanner(System.in);
            
            System.out.print("Enter a string to reverse :");
            original = in.nextLine();
            
            int length = original.length();
            
            for(int i = length - 1; i>=0; i--)
            {
                revers = revers + original.charAt(i);
            }
            
            System.out.println("Reverse of entered string is :"+revers);
            }
    public revers_string(){
             ReversSting();
    }
    public static void main(String[] args) {
        new  ReversSting();
    }
     
}
