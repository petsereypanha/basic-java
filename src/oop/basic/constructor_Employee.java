package oop.basic;

import java.util.Scanner;

public class constructor_Employee {
    private int id;
    private String name,gender,position,dob;
    private float salary;
    
    // defaul
    public constructor_Employee(){
        id = 12034;
        name = "Jing Kang";
        gender = "Male";
        position = "Team Leader";
        dob = "10/04/1993";
        salary = 2000;
    }
    
    // construtor with parameter 
    public constructor_Employee(int id, String name, String gender, String position, String dob, float salary){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.position = position;
        this.dob = dob;
        this.salary = salary;
    }
    
    // Input
    public void Input(){
        Scanner objin = new Scanner(System.in);
        System.out.print("Input ID       :"); id = objin.nextInt();
        System.out.print("Input Name     :"); name = objin.next();
        System.out.print("Input gender   :"); gender = objin.next();
        System.out.print("Input position :"); position = objin.next();
        System.out.print("Input dob      :"); dob = objin.nextLine();
        System.out.print("Input salary   :"); salary = objin.nextFloat();
    }
    
    // Output 
    public void Output(){
        System.out.println(" ID       :"+id);
        System.out.println(" Name     :"+name);
        System.out.println(" Gender   :"+gender);
        System.out.println(" Position :"+position);
        System.out.println(" dob      :"+dob);
        System.out.println(" Salary   :"+salary+"$");
    }
    public static void main(String[] args) {
        // defual constructor
        constructor_Employee cm = new constructor_Employee();
        cm.Output();
        
        // constructer with paramater 
        constructor_Employee cm1 = new constructor_Employee(2001,"SereyPanha","Male","Manager","10/03/2002",2000);
        cm1.Output();
        
        // Input Output
        constructor_Employee cm2 = new constructor_Employee();
        cm2.Input();
        cm2.Output();
        
    }
    
}
