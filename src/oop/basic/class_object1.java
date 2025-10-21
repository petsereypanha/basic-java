package oop.basic;

import java.util.Scanner;

public class class_object1 {
    public int id;
    public String name;
    public String gender;
    public float Score;
    public void Input(){
        Scanner objin = new Scanner(System.in);
        System.out.print("Input ID     :"); id = objin.nextInt();
        System.out.print("Input Name   :"); name = objin.next();
        System.out.print("Input Gender :"); gender = objin.next();
        System.out.print("Input Score  :"); Score = objin.nextFloat();
    }
    public void Ouput(){
        System.out.println("Output ID     :"+id); 
        System.out.println("Output Name   :"+name);
        System.out.println("Output Gender :"+gender); 
        System.out.println("Output Score  :"+Score);    
    }
    public static void main(String[] args) {
       class_object1 cin = new class_object1();
       cin.Input();
       cin.Ouput();
    }
    
}
