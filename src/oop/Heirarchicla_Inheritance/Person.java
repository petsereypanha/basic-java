package oop.Heirarchicla_Inheritance;

import java.util.*;

public class Person {
    
    protected int id;
    protected String name,gender;
    
    public Person(){
        id = 0;
        name = "N/A";
        gender = "N/A";
    }

    public Person(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    
    public void Input(){
        Scanner cin = new Scanner(System.in);
        System.out.print("Input ID     :"); id = cin.nextInt();
        System.out.print("Input Name   :"); name = cin.next();
        System.out.print("Input Gender :"); gender = cin.next();
    }
    
    public void Header(){
        System.out.printf("%12s%14s%16s","ID","Name","Gender");
    }
    
    public void Output(){
        System.out.printf("%12d%14s%16s",id,name,gender);
    }
}
