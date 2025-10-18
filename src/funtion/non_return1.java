package funtion;
public final class non_return1 {
    
    void sum1(){
        int x=100;
        int y= 400;
        System.out.println("Result X+Y : "+(x+y));
    }
    
    void sum2(int x,int y){
        System.out.println("Result Y-X :"+(x-y));
    }
    
    public non_return1(){
        sum1();
        sum2(100,400);
    }
    public static void main(String[] args) {
        new non_return1();
    }
    
}
