package oop.Heirarchicla_Inheritance;

import java.util.*;

public class Employee extends Person{
    
    protected String dob,dop,position;
    
    public Employee(){
        super();
        dob = "N/A";
        dop = "N/A";
        position = "N/A";
    }

    public Employee(int id, String name, String gender,String dob, String dop, String position) {
        super(id, name, gender);
        this.dob = dob;
        this.dop = dop;
        this.position = position;
    }
    
    @Override
    public void Input(){
        super.Input();
        Scanner cin = new Scanner(System.in);
        System.out.print("Input DOB      :"); dob = cin.nextLine();
        System.out.print("Input DOP      :"); dop = cin.nextLine();
        System.out.print("Input Position :"); position = cin.next();
    }
    
    @Override
    public void Header(){
        super.Header();
        System.out.printf("%13s%13s%17s","DOB","DOP","Position");
    }
    
    @Override
    public void Output(){
        super.Output();
         System.out.printf("%13s%13s%17s",dob,dop,position);
    }
    public static void main(String[] args) {
        int op;
        Employee emp = new Employee();
        Employee h   = new Employee();
        Scanner cin = new Scanner(System.in);
        do{
            System.out.println("=========| M E N U |===========");
            System.out.println(" 1. Input ");
            System.out.println(" 2. Output ");
            System.out.println(" 3. Defaul Contractor");
            System.out.println(" 4. Contractor With Parameter ");
            System.out.println(" 0. Exit ");
            System.out.println("===============================");
            System.out.print("Please Select One Option :");
            op = cin.nextInt();
            switch (op) {
                case 1 -> {
                    emp.Input();
                }
                case 2 -> {
                    h.Header();
                    emp.Output();
                }
                case 3 -> {
                    Employee emp1 = new Employee();
                    h.Header();
                    emp1.Output();
                }
                case 4 -> {
                    Employee emp2 = new Employee(1002,"JiingKang","Male","10/02/2002","TK/BTB","Manager");
                    h.Header();
                    emp2.Output();
                }
            }
        }while(op!=0);
    }
}
