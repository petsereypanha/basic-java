package swing.employee;

import java.util.ArrayList;

public class Employee_Form {
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getPosition() {
        return position;
    }
    public String getAddress() {
        return address;
    }
    public float getSalary() {
        return salary;
    }
    private int id;
    private String name,gender,position,address;
    private float salary;
    
    public Employee_Form(int id,String name,String gender,String position,String address,float salary){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.position = position;
        this.address = address;
        this.salary = salary;
    }
    
    static  ArrayList<Employee_Form> list_Employee = new ArrayList<>();
}
