package oop.Inheritances1;

import java.util.*;

public class Person {
		
	protected String id,name,sex,address,dob;
	
	public String getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void Input() {
		Scanner cin = new Scanner(System.in);
		System.out.print("Input ID      :"); id = cin.next();
		System.out.print("Input Name    :"); cin.nextLine();name = cin.nextLine();
		System.out.print("Input Sex     :"); sex = cin.next();
		System.out.print("Input Address :"); cin.nextLine();address = cin.nextLine();
		System.out.print("Input DOB     :");  dob = cin.next();
	}
	
	public void Header() {
		System.out.printf("%12s%14s%13s%17s%13s","ID","Name","Sex","Address","DOB");
	}
	
	public void Output() {
		System.out.printf("%12s%14s%13s%17s%13s",id,name,sex,address,dob);
	}
}
