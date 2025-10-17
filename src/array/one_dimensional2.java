package array;

import java.util.Random;

public class one_dimensional2 {
    public static void main(String[] args) {
        int [] a = new int[100];
            Random ran = new Random();
            int n=20;
            System.out.println("InArray Output (version 2");
//            random 1-100 with n number
            for (int i = 0; i < n; i++) {
                   a[i] = ran.nextInt(100) +1;
            }
//            output
            for(int i=0; i < n ; i++){
                System.out.print(a[i]+" ");
            }
    }
    
}
