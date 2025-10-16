package oop.Inheritances1;

import java.util.*;

public class Employee extends Person{
	
	Scanner cin = new Scanner(System.in);
	private float salary,rate,hour,payment;

	public void Input() {
		super.Input();
		System.out.print("Input Salary  :"); salary = cin.nextFloat();
		System.out.print("Input Rate    :"); rate = cin.nextFloat();
		System.out.print("Input Hour    :"); hour = cin.nextFloat();
		payment = salary + (rate*hour);
	}
	
	public void Header() {
		super.Header();
		System.out.printf("%16s%14s%14s%17s\n","Salary","Rate","Hour","Payment");
	}
	
	public void Output() {
		super.Output();
		System.out.printf("%16.2f%14.2f%14.2f%17.2f\n",salary,rate,hour,payment);
	}
	
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		Employee em = new Employee();
		int i,n,op;
		boolean b = false;
		try (Scanner objin = new Scanner(System.in)) {
			do {
				System.out.println("==============| M E N U |=============");
				System.out.println("|                                     |");
				System.out.println("|             1. Input                |");
				System.out.println("|             2. Output               |");
				System.out.println("|             3. Search               |");
				System.out.println("|             4. Update               |");
				System.out.println("|             5. Remove               |");
				System.out.println("|             0. Exit                 |");
				System.out.println("=======================================");
				System.out.print("Please Select One Option :"); op = objin.nextInt();
				switch(op) {
				case 1 -> {
					System.out.print("Input Number of Employee  :"); n = objin.nextInt();
					for(i=0;i<n;i++) {
						System.out.println("===========| Employee "+i+1+" |============");
						em = new Employee();
						em.Input();
						list.add(em);
					}
				}
				case 2 -> {
					em.Header();
					for(i=0;i<list.size();i++) {
						list.get(i).Output();
					}
				}
				case 3 -> {
					String sid;
					System.out.print("Input Person's ID for Search  :");
					sid = objin.next();
					for(i=0;i<list.size();i++) {
						if(sid==list.get(i).getID()) {
							em.Header();
							list.get(i).Output();
							b=true;
						}
					}
					if(b==false) {
						System.out.println("Search not found ...!");
					}
				}
				case 4 -> {
					String sname;
					System.out.print("Input Person's Name for Search to Update :");
					sname = objin.next();
					for(i=0;i<list.size();i++) {
						if(sname==list.get(i).getName()) {
							em.Input();
							list.set(i, em);
							System.out.println("Update Successful ..!");
							b=true;
						}
					}
					if(b==false) {
						System.out.println("Search not found ..!");
					}
				}
			  }
			}while(op != 0);
		}
	}
}
