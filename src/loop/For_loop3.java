
package loop;

import java.util.Scanner;

public class For_loop3 {
    public static void main(String[] args) {
        int n,op,i;
        String st = null;
        Scanner objin = new Scanner(System.in);
        do{
            System.out.println("1.  Loop 1");
            System.out.println("1.  Loop 2");
            System.out.println("1.  Loop 3");
            System.out.println("1.  Loop 4");
            System.out.println("1.  Loop 5");
        System.out.print("Please Select One Option  :");
        op=objin.nextInt();
        System.out.print("Input Number of Loop      :");
        n=objin.nextInt();
        switch(op){
            case 1:{
                for(i=2;i<=n;i+=2){
                    System.out.print(i+" ");
                }
            }break;
            case 2:{
                for(i=2;i<=n;i+=3){
                    System.out.print(i+" ");
                }
            }break;
            case 3:{
                for(i=n;i>=n;i-=2){
                    System.out.print(i+" ");
                }
            }break;
            case 4:{
                 for(i=n;i>=n;i-=3){
                    System.out.print(i+" ");
                }
            }break;
            case 5:{
                 for(i=n;i>=n;i-=1){
                    System.out.print(i+" ");
                }
            }break;
          }  
         System.out.print("\n Please Input Yes to Continue ....!");
         st=objin.next();
        }while(st.equals("yes"));
    }
    
}
