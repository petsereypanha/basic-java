package loop;
public class DoWhile_loop {
    public static void main(String[] args) {
        int i;
        System.out.println("Form Incremental Loop");
        i=1;    // initailize
        do{
            System.out.print(i+" ");      
            i++;        // stop
        }while(i<=10);      // condition
        System.out.println("\nForm Decremental loop");
        i=10;       // initalize
        do{
            System.out.print(i+" ");
            i--;        // stop
        }while(i>=1); // condition
    }
    
}
