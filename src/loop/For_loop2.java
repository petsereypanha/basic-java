
package loop;
public class For_loop2 {
    public static void main(String[] args) {
         // 3 6 9 12 15
            for(int i = 3; i<=15 ; i+=3 ){
                System.out.print(" "+i);
            }
            System.out.println();
            // -5 -4 -3 ... 10
            for(int i = -5; i<=10; i++){
                System.out.print(" "+i);
            }
            System.out.println();
            // 100 90 80 ... 10
            for(int i = 100; i>=10 ; i-=10){
                System.out.print(" "+i);
            }
            System.out.println();
            // 10 9 8 ... -10
            for(int i=10; i>=-10; i--){
                System.out.print(" "+i);
            }
            System.out.println();
    }
    
}
