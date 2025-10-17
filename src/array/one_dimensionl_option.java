package array;

import java.util.Scanner;

public class one_dimensionl_option {
    public static void main(String[] args) {
        int i,n = 0,op,j,temp,m;
        int sn;
        boolean b = false;
        int arr[] = new int[100];
        Scanner objin = new Scanner(System.in);
        do {            
            System.out.println(" 1. Input  ");
            System.out.println(" 2. Output ");
            System.out.println(" 3. Search ");
            System.out.println(" 4. Update ");
            System.out.println(" 5. Delete ");
            System.out.println(" 6. Insert ");
            System.out.println(" 7. Sort   ");
            System.out.println(" 8. Appent ");
            System.out.println(" 9. Exit   ");
            System.out.print("Please Select One Option :");
            op = objin.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.print("Input Element of Array :");
                    n = objin.nextInt();
                    for(i=0;i<n;i++){
                        System.out.print("Input Array["+i+"] :");
                        arr[i] = objin.nextInt();
                    }
                }
                case 2 -> {
                    for(i=0;i<n;i++){
                        System.out.println("Input Array["+i+"] :"+arr[i]);
                    }
                }
                case 3 -> {
                    System.out.print("Input Array to Search :");
                    sn = objin.nextInt();
                    for(i=0;i<n;i++){
                        if(sn==arr[i]){
                            System.out.println("Input Array["+i+"] :"+arr[i]);
                            b=true;
                        }
                    }
                    if(b==false){
                        System.out.println("Search is not found ...!");
                    }
                }
                case 4 -> {
                    System.out.print("Input Array to Search for Update :");
                    sn = objin.nextInt();
                    for(i=0;i<n;i++){
                        if(arr[i]==sn){
                            System.out.println("Input Array["+i+"] :");
                            arr[i] = objin.nextInt();
                            b=true;
                        }
                    }
                    if(b==false){
                        System.out.println("Search is not found ...!");
                    }
                }
                case 5 -> {
                    System.out.print("Input Array to Search :");
                    sn = objin.nextInt();
                    for(i=0;i<n;i++){
                        if(arr[i]==sn){
                            for(j=i;j<n;j++){
                                arr[j] = arr[j++];
                            }
                            n=n-1;
                        }
                    }
                    if(b==false){
                        System.out.println("Search is not found ...!");
                    }
                }
                case 6 -> {
                    System.out.print("Input Array to Search :");
                    sn = objin.nextInt();
                    for(i=0;i<n;i++){
                        if(arr[i]==sn){
                            for(j=i;j<n;j--){
                                arr[j] = arr[j+1];
                            }
                            n=n+1;
                            System.out.print("Input Array["+i+"] :");
                            arr[i] = objin.nextInt();
                            b=true;
                        }
                    }
                    if(b==false){
                        System.out.println("Search is not found ...!");
                    }
                }
                case 7 -> {
                    for(i=0;i<n;i++){
                        for(j=i+1;j<n;j++){
                            if(arr[i]<arr[j]){
                                temp=arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                            }
                        }
                    }
                    System.out.println("Sort is Completed ..!");
                }
                case 8 -> {
                    System.out.print("Input Element of Array :");
                    m = objin.nextInt();
                    for(i=n;i<n+m;i++){
                        System.out.print("Input Array["+i+"] :");
                        arr[i] = objin.nextInt();
                    }
                    System.out.println("Appent Successful ..!");
                } 
            }
        } while (op!=9);
    }
}