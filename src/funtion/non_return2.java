
package funtion;
public final class non_return2 {

        int a=500,b=200;
        void Sum(){
             System.out.println("A + B :"+(a+b));
        }
        void Sub(){
             System.out.println("A - B :"+(a-b));
        }
        void Mul(){
            System.out.println("A * B :"+(a*b));
        }
        void Div(){
            System.out.println("A / B :"+(a/b));
        }
        public non_return2(){
            Sum();
            Sub();
            Mul();
            Div();
        }
       public static void main(String[] args) {
           new non_return2();
    }
    
}
