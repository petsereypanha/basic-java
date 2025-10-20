package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class employee {
    private int id;
    private String name,gender,position;
    private float  salary;

    public employee(){

    }

    public int getID(){
        return id;
    }

    public float getSalary(){
        return salary;
    }

    public void Input(){
        Scanner cin = new Scanner(System.in);
            System.out.print("Input ID        :"); id = cin.nextInt();
            System.out.print("Input Name      :"); name = cin.next();
            System.out.print("Input Gender    :"); gender = cin.next();
            System.out.print("Input Position  :"); position = cin.next();
            System.out.print("Input Salary    :"); salary = cin.nextFloat();
    }
    public static void Header(){
        System.out.printf("\n%12s%14s%16s%18s%16s\n","ID","Name","Gender","Position","Salary");
    }
    public void Output(){
        System.out.printf("\n%12d%14s%16s%18s%16.2f\n",id,name,gender,position,salary);
        
    }
    public int search(ArrayList<employee> list,int size){
        Scanner cin = new Scanner(System.in);
        int sid,i,index=-1;
        System.out.print("Input id of employee to search :");sid = cin.nextInt();
        for(i=0;i<size;i++){
            if(sid==list.get(i).getID()){
                index=i;
            }
        }
        return index;
    }
    
}
class employeeDetail{
    public static void main(String[] args) {
        ArrayList<employee> list = new ArrayList<>();
        employee emp = new employee();
        boolean b = false;
        int i,n,op,sid;
        try (Scanner cin = new Scanner(System.in)) {
        do {
            System.out.println("======-------| M E N U |-------========");
            System.out.println("1. Input");
            System.out.println("2. Output");
            System.out.println("3. Search");
            System.out.println("4. Update");
            System.out.println("5. Remove");
            System.out.println("6. Insert");
            System.out.println("7. Sort");
            System.out.println("8. Find the maximum salary of employee");
            System.out.println("9. Find the minimum salary of employee");
            System.out.println("10. Find same salary emplyee");
            System.out.println("0. Exit");
            System.out.println("_________________________________________");
            System.out.print("Please Select One Option :"); op = cin.nextInt();
            switch(op){
                case 1 -> {
                    System.out.print("Input Number of Employee :"); n = cin.nextInt();
                    for(i=0;i<n;i++){
                        System.out.println("=====-----| Employee "+i+1+" |------=======");
                        emp = new employee();
                        emp.Input();
                        list.add(emp);
                    }
                }
                case 2 -> {
                    employee.Header();
                    for(i=0;i<list.size();i++){
                        list.get(i).Output();
                    }
                }
                case 3 -> {
                    int index= emp.search(list, list.size());
                    if(index==-1){
                        System.out.println("Search is nt fuond..!");
                    }else{
                        employee.Header();
                        list.get(index).Output();
                    }
                }
                case 4 -> {
                    int index= emp.search(list, list.size());
                    if(index==-1){
                        System.out.println("Search is nt fuond..!");
                    }else{
                        emp.Input();
                        list.set(index, emp);
                        System.out.println("Update is Successful");
                    }
                }
                case 5 -> {
                    int index= emp.search(list, list.size());
                    if(index==-1){
                        System.out.println("Search is nt fuond..!");
                    }else{
                        list.remove(index);
                        System.out.println("Remove is Successful");
                    }
                }
                case 6 -> {
                    int index= emp.search(list, list.size());
                    if(index==-1){
                        System.out.println("Search is nt fuond..!");
                    }else{
                        emp = new employee();
                            emp.Input();
                            list.add(index, emp);
                            System.out.println("Insert is Successful");
                    }
                }
                case 7 -> {
                    Collections.sort(list,Comparator.comparing(employee::getID));
                    employee.Header();
                    for (i = 0; i < list.size(); i++) {
                        list.get(i).Output();
                    }
                }
                case 8 -> {
                    employee emp1 = list.stream().max(Comparator.comparingDouble(employee::getSalary)).get();
                    employee.Header();
                    emp1.Output();
                }
            }
        } while (op!=0);
      }
    }
}
                                     