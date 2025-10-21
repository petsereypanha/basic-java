package oop.Polymorphism;
public abstract class TestA {   //Abstact class
    private int a,b,c;
    public abstract void Speak();   // Abstruct method
    public abstract void Read();   // Abstruct method
    public abstract double price(); // Abstruct method
    public void show(){
        System.out.println(" I can fly.");
    }
}
class TestB extends TestA{
    @Override
    public void Speak(){
        System.out.println(" I can speak khmer.");
    }
    
    @Override
    public void Read(){
        System.out.println(" I can read book.");
    }
    
    @Override
    public double price(){
        return 10;
    }
    public static void main(String[] args) {
        TestB t = new TestB();
        t.Speak();
        t.Read();
        System.out.println(" Price ="+t.price());
    }
}
