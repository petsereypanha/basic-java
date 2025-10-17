package array;

import java.util.Scanner;

public class one_dimensional_dowhile {
    public static void main(String[] args) {
                int [] a = new int[100];
                String st;
                Scanner objin = new Scanner(System.in);
                int n=0,op,i;
                do {            
                    System.out.println("1. Input \n");
                    System.out.println("2. Ouput \n");
                    System.out.println("3. Search\n");
                    System.out.print("Please Choose One Option :");
                    op=objin.nextInt();
                    switch (op) {
                        case 1 -> {
                            System.out.print("Input N:");
                            n=objin.nextInt();
                            for(i=0;i<n;i++){
                                System.out.print("Input Array :");
                                a[i]=objin.nextInt();
                            }
                        }
                        case 2 -> {
                            for(i=0;i<n;i++){
                                System.out.print(a[i]);
                            }
                        }
                        case 3 -> {
                            int svalue;
                            int b=0;
                            System.out.print("Input Value to Search :");
                            svalue=objin.nextInt();
                            for(i=0;i<n;i++){
                                if(a[i]==svalue){
                                System.out.println(a[i]);
                                System.out.println("Search found");
                                b=1;
                                break;
                                }
                            }
                            if(b==0){
                                System.out.println("Search not found");
                            }
                        }
                    }
                    System.out.println("Press yes To Continue ..!");
                    st=objin.next();
                } while (st.equals("yes"));
    }
    
}
