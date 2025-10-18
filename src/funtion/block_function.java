package funtion;
public final class block_function {
    int Sum2(int x)
    {
        return (x);
    }
    int Sum3(int a,int c,int d)
    {
        return Sum2(a)+Sum2(c+d);
    }
    int Sum4(int a,int c)
    {
        return Sum2(a)+c;
    }
    public block_function(){
        System.out.println("Calling function Sum2 :"+ Sum2(23));
        System.out.println("Calling function Sum3 :"+ Sum3(100,6,9));
        System.out.println("Calling function Sum4 :"+ Sum4(45,10));
    }
    public static void main(String[] args) {
        new block_function();
    }
    
}
