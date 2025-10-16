package AWT;

import java.util.ArrayList;

public class ListPerson {
    private int id;
    private String name,gender;
    private float salary;
    
    public ListPerson(int id, String name, String gender, float salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public float getSalary() {
        return salary;
    }
    
    static ArrayList<ListPerson> list = new ArrayList<>();
    
    
    
}
