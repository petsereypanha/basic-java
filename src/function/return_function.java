package function;
public class return_function {
    int Sum1()   // retutn non-paramater
    {
        int x,y;
        x=100;
        y=200;
        return x+y;
    }
    int Sum2(int x,int y)
    {
        return (x+y);
    }
    double Sum3(double x,double y,double z)
    {
        return (x+y+z);
    }
    public return_function()
    {
        System.out.println("Calling Function Sum1 :"+Sum1());
        System.out.println("Calling Function Sum2 :"+Sum2(10,39));
        System.out.println("Calling Function Sum3 :"+Sum3(300,500,200));
    }
    public static void main(String[] args) {
        new return_function();
    }
    
}
