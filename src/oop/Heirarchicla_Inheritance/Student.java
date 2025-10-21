package oop.Heirarchicla_Inheritance;

import  java.util.*;

public class Student extends Employee {
    
    private float salary;

    public Student() {
        super();
        salary = 0;
    }

    public Student(int id, String name, String gender, String dob, String dop, String position,float salary) {
        super(id, name, gender, dob, dop, position);
        this.salary = salary;
    }

    @Override
    public void Input(){
        Scanner cin = new Scanner(System.in);
        super.Input();
        System.out.print("Innput  Salary :");
        salary = cin.nextFloat();
    }
    
    @Override
    public void Header(){
        super.Header();
        System.out.printf("%12s\n","Salary");
    }
    
    @Override
    public void Output(){
        super.Output();
        System.out.printf("%12.2f\n",salary);
    }
    public static void main(String[] args) {
        int op ;
        Student stu = new Student();
        Student hh = new Student();
        Scanner cin = new Scanner(System.in);
        do{
            System.out.println("=========| M E N U |==========");
            System.out.println(" 1. Input ");
            System.out.println(" 2. Output ");
            System.out.println(" 3. Defaul Contractor");
            System.out.println(" 0. Contractor With Parameter ");
            System.out.println("==============================");
            System.out.print("Please Select One Option :");
            op = cin.nextInt();
            switch (op) {
                case 1 -> {
                    stu.Input();
                }
                case 2 -> {
                    hh.Header();
                    stu.Output();
                }
                case 3 -> {
                    Student stu1 = new Student();
                    hh.Header();
                    stu1.Output();
                }
                case 4 -> {
                    Student stu2 = new Student(1002,"JiingKang","Male","10/02/2002","TK/BTB","Manager",800);
                    hh.Header();
                    stu2.Output();
                }
            }
        }while(op!=0);
    }
}
