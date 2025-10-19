package loop;
public class Nested_loop {
    public static void main(String[] args) {
        for(int i=1; i<=2 ;i++){
            for(int j=1; j<=4; j++){
                for(int k=1; k<=10 ; k++){
                    System.out.print(" "+k);
                }
                System.out.println("");
            }
        }
    }
    
}
