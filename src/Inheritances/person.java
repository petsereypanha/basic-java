package Inheritances;

import java.util.*;

public class person {
	
	private int id;
	private String name,gender;
	
	public void Input() {
			Scanner cin = new Scanner(System.in);
			System.out.print("Input ID     :"); id = cin.nextInt();
			System.out.print("Input Name   :"); cin.nextLine();name = cin.nextLine();
			System.out.print("Input Gender :"); gender = cin.next();
	}
	
	public void Header() {
		System.out.printf("%12s%14s%16s","ID","Name","Gender");
	}
	
	public void Output() {
		System.out.printf("%12d%14s%16s",id,name,gender);
	}
}