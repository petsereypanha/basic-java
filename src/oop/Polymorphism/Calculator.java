package oop.Polymorphism;
public class Calculator {
    public void Sum(int a,int b){
        System.out.println(" A + B ="+(a+b));
    }
    public void Sum(float a,float b){
        System.out.println(" A + B ="+(a+b));
    }
    public void Sum(int a,float b,double c){
        System.out.println(" A + B ="+(a+b));
    }
    public int Sum(int a,int b,int c){
        return (a+b+c);
    }
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.Sum(100, 200);
        c.Sum(11.11f,22.22f);
        c.Sum(10, 22.55f, 55.55);
        System.out.println(" A + B + C ="+c.Sum(10, 20, 30));
    }
    
}
