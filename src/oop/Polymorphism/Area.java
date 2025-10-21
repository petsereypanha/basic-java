package oop.Polymorphism;

import static java.lang.Math.pow;

public class Area {

    public Area(int r){ // Circle
        System.out.println(" Area Of Circle ="+3.14*pow(r,2)+"cm^2");
    }
    public Area(float l,float b){   // Rectagle
        System.out.println(" Area Of Rectagle ="+(l*b)+"cm^2");
    }
    public Area(float a){   // Square
        System.out.println(" Area Of Square ="+pow(a, 2)+"cm^2");
    }
    public static void main(String[] args) {
        Area a = new Area(3);
        Area a1 = new Area(10, 5);
        Area a2 = new Area(3.5f);
    }
    
}
