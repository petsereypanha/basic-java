package loop;

import java.util.Scanner;

public class Each_loop2 {
    public static void main(String[] args) {
        int rows, number = 1, counter, j;       
        Scanner input = new Scanner(System.in);     // to get user is input
        System.out.println("Enter the number of rows for floyed's triangle :"); // Copying user into an integer variable named rows
        rows = input.nextInt();
        System.out.println("Floyd's triangle");
        System.out.println("****************");
        for( counter= 1; counter <= rows; counter++){
            for(j = 1; j <= counter; j++){
                System.out.print(number+" ");    // Increamenting the number value
                number ++;
            }
            //   for new line
            System.out.println();
        }
    }
    
}
