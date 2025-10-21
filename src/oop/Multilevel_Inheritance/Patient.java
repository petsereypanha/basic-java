package oop.Multilevel_Inheritance;

import java.util.*;

public class Patient extends Hospital{
    private String illness,address,phone;
    private int age;
    
    @Override
    public void Input(){
        Scanner cin = new Scanner(System.in);
        super.Input();
        System.out.print("Input Illness  :"); illness = cin.next();
        System.out.print("Input Address  :"); address = cin.next();
        System.out.print("Input Phone    :"); phone = cin.next();
        System.out.print("Input AGE      :"); age = cin.nextInt();
    }
    
    @Override
    public void Header(){
        super.Header();
        System.out.printf("%17s%17s%15s%13s\n","Illness","Address","Phone","Age");
    }
    
    @Override
    public void Output(){
        super.Output();
        System.out.printf("%17s%17s%15s%13d\n",illness,address,phone,age);        
    }
    
    public static void main(String[] args) {
        Patient pt = new Patient();
        pt.Input();
        pt.Header();
        pt.Output();
    }
}
