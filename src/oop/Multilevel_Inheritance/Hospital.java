package oop.Multilevel_Inheritance;

import java.util.*;

public class Hospital extends Person{
    protected int roomNo,bedNo;
    protected String date;
    
    @Override
    public void Input(){
       Scanner cin = new Scanner(System.in);
        super.Input();
        System.out.print("Input RoomNo   :"); roomNo = cin.nextInt();
        System.out.print("Input BedNo    :"); bedNo = cin.nextInt();
        System.out.print("Input Date     :"); date = cin.next();
    }
    
    @Override
    public void Header(){
        super.Header();
        System.out.printf("%16s%15s%14s","RoomNo","BedNo","Date");
    }

    @Override
    public void Output(){
        super.Output();
        System.out.printf("%16d%15s%14s",roomNo,bedNo,date);
    }
}
