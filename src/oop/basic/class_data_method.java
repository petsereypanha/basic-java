package oop.basic;

import java.util.Scanner;

public class class_data_method {
    public int id;
    public String name;
    public String sex;
    public float score;
    public  void  Input() {
        Scanner objin = new Scanner(System.in);
        System.out.print("Input ID  :");
        this.id = objin.nextInt();
        System.out.print("Input Name  :");
        this.name = objin.next();
        System.out.print("Input sex  :");
        this.sex = objin.next();
        System.out.print("Input Score  :");
        this.score = objin.nextFloat();
    }
    
}
