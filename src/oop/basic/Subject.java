package oop.basic;

import oop.Student;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Subject extends Student {
    private Double CPP;
    private Double DSA;
    private Double CA;
    private Double En;
    private Double Java;
    public Subject(){}
    public Subject(String _name,String _gender,int _age,String _DOB,String _address,String _department
            ,String _Class,Double _CPP,Double _DSA,Double _CA,Double _En,Double _Java){
        id = (int) Math.floor(Math.random()*100);
        rollNumber = (int)(Math.floor(Math.random()*1000));
        name = _name;
        gender = _gender;
        age = _age;
        DOB = _DOB;
        address = _address;
        department = _department;
        Class = _Class;
        CPP = _CPP;
        Java = _Java;
        CA = _CA;
        En = _En;
        DSA = _DSA;
        Total();
        Average();
        Grade();
    }
    public void Input (){
        Scanner scan = new Scanner(System.in);
        id = (int) Math.floor(Math.random()*100);
        rollNumber = (int)(Math.floor(Math.random()*1000));
        System.out.print("Input Student Name       : ");
        name = scan.nextLine();
        System.out.print("Input Student Gender     : ");
        gender = scan.next();
        System.out.print("Input Student Age        : ");
        age = scan.nextInt();
        System.out.print("Input Student DOB        : ");
        DOB = scan.next();
        System.out.print("Input Student Address    : ");
        address = scan.next();
        System.out.print("Input Student Department : ");
        department = scan.next();
        System.out.print("Input Student Class      : ");
        Class = scan.next();
        Random ranData = new  Random();
        CPP = ranData.nextDouble(100);
        CA = ranData.nextDouble(100);
        Java = ranData.nextDouble(100);
        En = ranData.nextDouble(100);
        DSA = ranData.nextDouble(100);
    }
    public Double Total (){
        return  CPP + DSA + CA + En + Java;
    }
    public Double Average (){
        return Total()/5;
    }
    public char[] Grade(){
        return new char[]{(Average() <= 100.0 && Average() > 90.0) ? 'A' :
                (Average() <= 90.0 && Average() > 80.0) ? 'B' :
                        (Average() <= 80.0 && Average() > 70.0) ? 'C' :
                                (Average() <= 70.0 && Average() > 60.0) ? 'D' :
                                        (Average() <= 60.0 && Average() > 50.0) ? 'E' : 'F'};
    }
    public void Header (){
        System.out.printf("\n%2s %7s %9s %10s %8s %8s %10s %7s %5s %5s %5s %5s %5s %5s %7s %8s %7s\n\n"
        ,"ID","RolNum","Name","Gender","Age","DOB","Address","Dep","Class","Cpp","Ca","En","Java","Dsa","Total","Avg","Grade");
    }
    public void Output (){
        DecimalFormat df = new DecimalFormat("##.##");
        System.out.printf("\n%2d %7s %9s %10s %8d %8s %10s %7s %5s %5s %5s %5s %5s %5s %7s %8s %7s"
                ,id,rollNumber,name,gender,age,DOB,address,department,Class,df.format(CPP),df.format(CA),df.format(En)
                ,df.format(Java),df.format(DSA),df.format(Total()),df.format(Average()),Arrays.toString(Grade()));
    }
}
