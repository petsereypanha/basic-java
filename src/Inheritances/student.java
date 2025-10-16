package Inheritances;

import java.util.Scanner;

class student extends person{
	private float php,python,java;
	
	@Override
	public void Input() {
		super.Input();
		try (Scanner cin = new Scanner(System.in)) {
			System.out.print("Input PHP    :"); php = cin.nextFloat();
			System.out.print("Input Python :"); python = cin.nextFloat();
			System.out.print("Input Java   :"); java = cin.nextFloat();
		}
	}
	
	@Override
	public void Header() {
		super.Header();
		System.out.printf("%13s%16s%14s\n","PHP","Python","Java");
	}
	
	@Override
	public void Output() {
		super.Output();
		System.out.printf("%13.2f%16.2f%14.2f\n",php,python,java);
	}
	
	public static void main(String[] args) {
		student stu = new student();
		stu.Input();
		stu.Header();
		stu.Output();
	}
}


