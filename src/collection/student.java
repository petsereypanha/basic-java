package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Student{
    private  int id;
    private String name,gender;
    private float score;
    
    public void Input(){
        Scanner cin = new Scanner(System.in);
        System.out.print("Input ID     :"); id=cin.nextInt();
        System.out.print("Input Name   :"); name=cin.next();
        System.out.print("Input Gender :"); gender=cin.next();
        System.out.print("Input Score  :"); score = cin.nextFloat();
    }
    public static void Header(){
        System.out.printf("\n%12s%14%16s%15s\n","ID","Name","Gender","Score");
    }
    public void Output(){
        System.out.printf("\n%12d%14s%16s%15.2f\n",id,name,gender,score);
    }
            public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu = new Student();
        Scanner cin = new Scanner(System.in);
        int i,n,op;
        do {
            System.out.println("============| M E N U |==============");
            System.out.println(" 1. Input");
            System.out.println(" 2. Output");
            System.out.println(" 3. Search");
            System.out.println(" 4. Update");
            System.out.println(" 5. Remove");
            System.out.println(" 6. Sort");
            System.out.println(" 0. Exit");
            System.out.println("______________________________________");
            System.out.print("Please Select One Option :");
            op = cin.nextInt();
            switch(op){
                case 1 -> {
                    System.out.print("Input Number of student :");
                    n = cin.nextInt();
                    for(i=0;i<n;i++){
                        System.out.println("======------- Student "+(i+1)+" --------========");
                        stu = new Student();
                        stu.Input();
                    }
                }
                case 2 -> {
                    Student.Header();
                    for(i=0;i<list.size();i++){
                        list.get(i).Output();
                    }
                }
            }
        } while (op!=0);
        
    }

}
