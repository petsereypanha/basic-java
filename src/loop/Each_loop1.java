package loop;

import java.util.Random;

public class Each_loop1 {
    public static void main(String[] args) {
        int counter;
        Random rnum = new Random();
        System.out.println("Random Number:");
        System.out.println("**************");
        for(counter = 1; counter <= 20; counter++){
            System.out.println(rnum.nextInt(200));
        }
    }
    
}
