package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
	public static void main(String[] args) {
		int i,n,op;
		ArrayList<student> list = new ArrayList<>();
		student stu = new student();
		try (Scanner cin = new Scanner(System.in)) {
			do {
				System.out.println("==========| M E N U |===========");
				System.out.println("|  1. Input                     |");
				System.out.println("|  2. Output                    |");
				System.out.println("|  3. Search                    |");
				System.out.println("|  4. Update                    |");
				System.out.println("|  5. Remove                    |");
				System.out.println("|  6. Insert                    |");
				System.out.println("|  7. Sort                      |");
				System.out.println("|  8. Find the maximum of Total |");
				System.out.println("|  9. Find the minimum of Total |");
				System.out.println("|  0. Exit                      |");
				System.out.println("================================");
				System.out.print("Plesea Select One Option :");
				op = cin.nextInt();
				switch(op){
					case 1 -> {
						System.out.print("Input Element of Student :");
						n = cin.nextInt();
						for(i=0;i<n;i++) {
							System.out.println("=======| Student "+i+1+" |========");
							stu = new student();
							stu.Input();
							list.add(stu);
						}
					}
					case 2 -> {
						student.Header();
						for(i=0;i<list.size();i++) {
							list.get(i).Output();
						}
					}
					case 3 -> {
						int index = stu.Search(list,list.size());
						if(index==-1) {
							System.out.println("Search is not Found ..!");
						}else {
							student.Header();
							list.get(index).Output();
						}
					}
					case 4 -> {
						
					}
					case 5 -> {
						
					}
					case 6 -> {
						
					}
					case 7 -> {
						
					}
					case 8 -> {
						
					}
					case 9 -> {
						
					}
				}
			}while(op!=0);
		}
	}
}
