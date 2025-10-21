/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.basic;

import java.util.Scanner;

/**
 *
 * @author sereypanha
 */
public class Test2 {

       public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
    
    private int id;
    private String name,gender;
    private float  score;

    
    public  void Input(){
        
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Input Id     :"); id = sc.nextInt();
        System.out.print("Input Name   :"); name = sc.next();
        System.out.print("Input Gender :"); gender = sc.next();
        System.out.print("Input Score  :"); score = sc.nextFloat();
    }
    
    public  void Output(){
        System.out.println("Output ID     :"+id);
        System.out.println("Output Name   :"+name);
        System.out.println("Outout Gender :"+gender);
        System.out.println("Output Score  :"+score);
    }
    public static void main(String[] args) {
        Test2 ts = new Test2();
        Scanner sc = new Scanner(System.in);
        int op=0;
        do{
            System.out.println("1. Input ");
            System.out.println("2. Output ");
            System.out.println("3. Exit ");
            System.out.print("Please Select One Option :");
            op = sc.nextInt();
            switch (op) {
                case 1 -> {
                    ts.Input();
                }
                case 2 -> {
                    ts.Output();
                }
                case 3 -> {
                    System.exit(0);
                }
            }
        }while(op!=3);
    }
}
