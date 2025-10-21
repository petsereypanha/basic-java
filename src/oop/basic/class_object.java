package oop.basic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class class_object {
    private int id;
    private String name,sex;
    private float score1,score2,score3;
    public void Input(){
        Scanner ob = new Scanner(System.in);
        System.out.print("Input ID     :");id=ob.nextInt();
        System.out.print("Input Name   :");name=ob.next();
        System.out.print("Input Sex    :");sex=ob.next();
        System.out.print("Input Scoer1 :");score1=ob.nextFloat();
        System.out.print("Input Scoer2 :");score2=ob.nextFloat();
        System.out.print("Input Scoer3 :");score3=ob.nextFloat();
    }
    public double Total(){
        return score1+score2+score3;
    }
    public double Average(){
        return Total()/3;
    }
    public String Grade(){
           return  (Average()<=100 && Average()>=90)?  "A"
            :(Average()<90 && Average()>=80)? "B"
            :(Average()<80 && Average()>=70)?  "C"
            :(Average()<70 && Average()>=60)?   "D"
            :(Average()<60 && Average()>=50)?   "E"
            :"F";
    }
    public void Output(){
        System.out.println("==========------| OUPUT |------===============");
        DecimalFormat df = new  DecimalFormat("#.##");
        System.out.println("Ouput ID     :"+id);
        System.out.println("Ouput Name   :"+name);
        System.out.println("Ouput Sex    :"+sex);
        System.out.println("Ouput Scoer1 :"+score1);
        System.out.println("Ouput Scoer2 :"+score2);
        System.out.println("Ouput Scoer3 :"+score3);
        System.out.println("Ouput Total  :"+Total());
        System.out.println("Ouput Average:"+df.format(Average()));
        System.out.println("Ouput Grade  :"+Grade());

    }
    public static void main(String[] args) {
        class_object obj = new  class_object();
        obj.Input();
        obj.Output();
    }
    
}
