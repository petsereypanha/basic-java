package oop.basic;

import java.util.Scanner;

public class class_object2 {
    private int x;
    private int y;
    private int z;
    public void Input(){
        Scanner objin = new Scanner(System.in);
        System.out.print("Input value x :"); x=objin.nextInt();
        System.out.print("Input value y :"); y=objin.nextInt();
        System.out.print("Input value z :"); z=objin.nextInt();
    }
    private int sum(){
        return x+y+z;
    }
    private int sub(){
        return x+y/z;
    }
    public void Output(){
        System.out.println("X :"+x+"\tY :"+y+"\tZ :"+z);
        System.out.println("Sum  :"+sum());
        System.out.println("Sub  :"+sub());
    }
     public static void main(String[] args) {
        class_object2 cb = new class_object2();
        cb.Input();
        cb.Output();
    }
    
};
