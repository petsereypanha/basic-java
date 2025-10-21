package oop.basic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test1 {
    private float x,y;
    public void Input(){
        try (Scanner cin = new Scanner(System.in)) {
            System.out.print("Input X :");x=cin.nextFloat();
            System.out.print("Input Y :");y=cin.nextFloat();
        }
    }
    public float Sum(){
        return x+y;
    }
    public float Sub(){
        return x-y;
    }
    public float Mul(){
        return x*y;
    }
    public float Dev(){
        return x/y;
    }
    public void Output(){
        DecimalFormat df = new DecimalFormat("#.###");
            System.out.println("Input X :"+x);
            System.out.println("Input Y :"+y);
            System.out.println("Input X+Y :"+Sum());
            System.out.println("Input X-Y :"+Sub());
            System.out.println("Input X*Y :"+Mul());
            System.out.println("Input X/Y :"+df.format(Dev()));  
    }
    public static void main(String[] args) {
        Test1 ts = new Test1();
        ts.Input();
        ts.Output();
    }
}
