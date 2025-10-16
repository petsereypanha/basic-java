package oop.Heirarchicla_Inheritance;

import java.util.*;

public class Employee  extends Person{
		private String position;
		private float salary;
		
		public Employee() {
			super();
			position = "N/A";
			salary = 0;
		}
		
		public Employee(int id,String name,String gender,String position,float salary) {
			super(id,name,gender);
			this.position = position;
			this.salary = salary;
		}
		public void Input() {
			super.Input();
			try (Scanner cin = new Scanner(System.in)) {
				System.out.print(" Input Position :"); position = cin.nextLine();
				System.out.print(" Input Salary   :"); salary = cin.nextFloat();
			}
		}
		public void Header() {
			super.Header();
			System.out.printf("%18s%16\n","Position","Salary");
		}
		public void Output() {
			super.Output();
			System.out.printf("%18s%15.2f$\n",position,salary);
		}
		
		public static void main(String[] args) {
			int op;
			Employee em = new Employee();
			Employee h = new Employee();
			try (Scanner cin = new Scanner(System.in)) {
				do {
					System.out.println("\n===============| M E N U |=============");
					System.out.println(" 1. Input");
					System.out.println(" 2. Output");
					System.out.println(" 3. Default Constructor");
					System.out.println(" 4. Constructor With Parameter");
					System.out.println(" 0. Exit");
					System.out.println("=========================================");
					System.out.print("Please Choose One Option :");
					op = cin.nextInt();
					switch(op) {
					case 1 -> {
						em.Input();
					}
					case 2 -> {
						h.Header();
						em.Output();
					}
					case 3 -> {
						Employee em1 = new Employee();
						h.Header();
						em1.Output();
					}
					case 4 -> {
						Employee em2 = new Employee(1001,"Heng Chenda","Famale","Soware Engering",1200);
						h.Header();
						em2.Output();
					}
					}
				}while(op!=0);
			}
		}
}
