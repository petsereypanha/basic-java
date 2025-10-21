package oop.Polymorphism;

public class Test1 {

    public void show(){
        System.out.println(" I can fly. ");
    }
    public void speak(String title){
        System.out.println(" I can speak " + title);
    }
}

class Test2 extends Test1{
    @Override
    public void show(){
        super.show();
        System.out.println(" I can run.");
    }
    
    @Override
    public void speak(String title){
        super.speak(title);
        System.out.println(" I can speak khmer ");
    }
    public static void main(String[] args) {
        Test2 t = new Test2();
        t.show();
        t.speak("Thialand"); 
    }
}