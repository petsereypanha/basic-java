package oop.basic;

import oop.Employee;

import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        String st;
        int op;
        do {
            System.out.print("Select One Option :");
            op = sc.nextInt();
            switch (op) {
                case 1 -> {
                    Subject student1 = new Subject("Jing", "Male", 23, "20.03.2003", "PhomePenh",
                            "IT", "A4", 50.0, 77.7, 66.6, 99.0, 77.6);
                            Subject student =  new Subject();

                            student.Input();
                            student.Header();
                            student.Output();
                    student1.Output();
                }
                case 2 -> {
                    Type_Product tp = new Type_Product();
                    Type_Product tp1 = new Type_Product(23,44.44F,10);
                    tp1.Output();
                    tp.Input();
                    tp.Output();
                }
                case 3 -> {
                    Employee em = new Employee();
                    Employee em1 = new Employee("Serey","Male","Ld",2233F,23);
                    em1.Output();
                    em.Input();
                    em.Header();
                    em.Output();
                }
                default -> throw new IllegalStateException("Unexpected value: " + op);
            }
            System.out.print("Press yes To Continue ..!");
            st=sc.next().toLowerCase();
        }while(st.equals("yes"));
    }
}
