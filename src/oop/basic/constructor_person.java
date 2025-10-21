package oop.basic;
public class constructor_person {
    // private , public , protected , defaul;
    private int id;
    private String name,gender;
    private float height;
    
    // create defaul contructor
    public constructor_person(){
        id = 007;
        name = "SereyPanha";
        gender = "Male";
        height = 1.49f;
    }
    
    // create contructor with parameter
    public constructor_person(int id,String name, String gender,float height){
       this.id = id;
       this.name = name;
       this.gender = gender;
       this.height = height;
    }
    
    public void  Ouput(){
        System.out.println(" ID     :"+id);
        System.out.println(" Nmae   :"+name);
        System.out.println(" Gender :"+gender);
        System.out.println(" Heigth :"+height+"m");
    }
    public static void main(String[] args) {
        System.out.println("Defaul contructor ");
        constructor_person con = new  constructor_person();
        con.Ouput();
        
        System.out.println("contructor with parameter");
        constructor_person con1 = new  constructor_person(005,"kaka","female",180f);
        con1.Ouput();

    }
}
