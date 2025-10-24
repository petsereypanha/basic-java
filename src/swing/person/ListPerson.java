package swing.person;

import java.util.ArrayList;

public class ListPerson {
    public int getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    private int id;
    private String name,gender;
    private  int age;
    
    public ListPerson(int id,String name,String gender,int age){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    
    static  ArrayList<ListPerson> listPersons = new ArrayList<>();
    
}
