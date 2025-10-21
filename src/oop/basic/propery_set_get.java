package oop.basic;
public class propery_set_get {
    private int id;
    private String name;
    
    // create propery set
    public void setID(int id){
        this.id=id;
    }
    public void setName(String name){
       this.name = name;
    }
    
    // create propery get
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public static void main(String[] args) {
        propery_set_get psg = new propery_set_get();
        psg.setID(10303); 
        psg.setName("SereyPanha"); 
        
        System.out.println("Id    :"+psg.getID());
        System.out.println(" Name :"+psg.getName());
    }
    
}
