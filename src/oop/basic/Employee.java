package oop.basic;

import java.util.Scanner;

public class Employee extends Persion{
    private String gender;
    private String position;
    private double salary;
    static float rate = 30F;
    private int hour;
    public Employee(){}
    public Employee(String __name,String __gender,String __position,double __salary,int __hour){
        id = (int) Math.floor(Math.random()*100);
        rollNumber = (int)(Math.floor(Math.random()*1000));
        name = __name;
        gender = __gender;
        position = __position;
        salary = __salary;
        hour= __hour;
    }
    public Double Total_Income(){
        return (salary + (rate * hour));
    }
    public void Input(){
        Scanner scan = new Scanner(System.in);
        id = (int) Math.floor(Math.random()*100);
        rollNumber = (int)(Math.floor(Math.random()*1000));
        System.out.print("Input Employee Name     :");
        name = scan.next();
        System.out.print("Input Employee Gender   :");
        gender = scan.next();
        System.out.print("Input Employee Position :");
        position = scan.next();
        System.out.print("Input Employee Salary   :");
        salary = scan.nextFloat();
        System.out.print("Input Employee Hour     :");
        hour = scan.nextInt();
    }
    public void Header(){
        System.out.printf("\n%2s %15s %16s %11s %15s %16s %10s %14s %16s\n\n",
                "ID","RollNum","Name","Gender","Position","Salary","Hour","Rate","Income");
    }
    public void Output(){
        System.out.printf("%2d %15d %16s %11s %15s %16f %10d %14f %16f\n",
                id,rollNumber,name,gender,position,salary,hour,rate,Total_Income());
    }
}
