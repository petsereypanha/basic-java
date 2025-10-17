package array;

import java.util.Scanner;

public class one_dimesional_sanh_in {
    public static void main(String[] args) {
       int arr[] = new int[40];
        int i,n;
        Scanner array = new Scanner(System.in);
        System.out.print("Input Element of array :");
        n = array.nextInt();
        for(i=0;i<n;i++){
            System.out.print("Input A["+i+"] :");
            arr[i]=array.nextInt();
        }
        for(i=0;i<n;i++){
            System.out.println("Input A["+i+"] :"+arr[i]);
        }
    }
    
}
