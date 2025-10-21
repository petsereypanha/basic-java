package oop.Multilevel_Inheritance;

import  java.util.*;

public class Person {
    protected int id;
    protected String name,sex;
    
    public void Input(){
        Scanner objin = new Scanner(System.in);
        System.out.print("Input ID     :");  id = objin.nextInt();
        System.out.print("Input Name   :");  name = objin.next();
        System.out.print("Input Sex    :");  sex = objin.next();
    }
    
    public void Header(){
        System.out.printf("%12s%14s%13s","ID","Name","Sex");
    }
    
    public void Output(){
        System.out.printf("%12d%14s%13s",id,name,sex);  
    }
}
