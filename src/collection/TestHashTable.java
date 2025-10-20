package collection;

import java.util.*;

public class TestHashTable {
    public static void main(String[] args) {
       Hashtable<Integer,String> th = new Hashtable<Integer,String>();
       Hashtable<Integer,String> th1 = new Hashtable<Integer,String>();
       th.put(1001, "chenna");
       th.put(20002, "Kanna");
       th.put(3003, "Jing");
       th.put(4309, "Serey");
       
       // update
       th.put(5005,"Kaka");
       
       // clear
       th.clear();
       
       // remove
       th.remove(1001);
       
       // Searrch 
       boolean b = th.containsKey(4309);
       if(b){
           System.out.println("Search found");
       }else{
           System.out.println("Search not found");
       }
       
       // Size
        System.out.println("Size of list"+th.size());
        
       // clone
          th1 = (Hashtable<Integer, String>)th.clone();
       
        System.out.println("Key\tValue");
         for(Map.Entry<Integer ,String> temp : th.entrySet()){
            System.out.println("Key ="+temp.getKey()+"    Value ="+temp.getValue());
        }
         System.out.println("Clone");
          for(Map.Entry<Integer ,String> temp : th1.entrySet()){
            System.out.println("Key ="+temp.getKey()+"    Value ="+temp.getValue());
        }
    }
    
}
