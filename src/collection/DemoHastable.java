package collection;

import java.util.*;

public class DemoHastable {
    public static void main(String[] args) {
       Hashtable<String,Integer> hm = new Hashtable<String,Integer>();
       hm.put("Serey",100);
       hm.put("Jing",5100);
       hm.put("Kaka",900);
       
        System.out.println(hm.get("Serey"));
        
        for(Map.Entry<String,Integer> temp : hm.entrySet()){
            System.out.println("Key ="+temp.getKey()+"    Value ="+temp.getValue());
        }
    }
    
}
