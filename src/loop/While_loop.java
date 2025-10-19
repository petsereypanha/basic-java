package loop;
public class While_loop{
    public static void main(String[] args) {
        int i;
        System.out.println("Form Incremental Loop");
        i =1;           //  Initailize
        while(i<=10){
            System.out.print(i+" ");        // condition
            i++;        // stop
        }
        System.out.println("\nForm Decremental loop");
        i=10;       // Initailize
        while(i>=1){        // condition
            System.out.print(i+" ");
            i--;        // stop
        }
    }
    
}
