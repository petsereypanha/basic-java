package collection;

import java.util.*;

public class Exercisses {
     private String word;
     private String speech;
     private String description;
     
     public void Input (){
         Scanner objin = new Scanner(System.in);
         System.out.print("Input Word        :"); word=objin.next();
         System.out.print("Input Speech      :"); speech=objin.next();
         System.out.print("Ipnut Description :"); description=objin.next();
     }
     
     public static void Header(){
         System.out.printf("\n%-14s%-16s%21s\n","Word","Speech","Description");
     }
     public void Output(){
         System.out.printf("%-14s%-16s%21s\n",word,speech,description);
     }
     public static void main(String[] args) {
         Scanner objin = new Scanner(System.in);
         Hashtable<Integer,Exercisses> ht  = new Hashtable<>();
         Exercisses ex = new Exercisses();
         int i,n,op;
         do {             
             System.out.println("==============| M E N U |=============");
             System.out.println("|              1. Input               |");
             System.out.println("|              2. Output              |");
             System.out.println("|              3. Search              |");
             System.out.println("|              4. Update              |");
             System.out.println("|              5. Remove              |");
             System.out.println("|              0. Exite               |");
             System.out.println("=======================================");
             System.out.print("Please Select One Option  :");
             op = objin.nextInt();
             switch (op) {
                 case 1 -> {
                     System.out.print("Input Number :");
                     n = objin.nextInt();
                     for(i=0;i<n;i++){
                         System.out.println("===========| Number "+(i+1)+" |==============");
                         ex = new Exercisses();
                         ex.Input();
                         ht.put(i, ex);
                     }
                 }
                 case 2 -> {
                     Exercisses.Header();
                     for (Map.Entry<Integer, Exercisses> entry : ht.entrySet()) {
                         entry.getValue().Output();
                         
                     }
                 }
                 case 3 -> {
                     String sword;
                     boolean b = false;
                     System.out.print("Input Word to Search  :");
                     sword = objin.next();
                     for (Map.Entry<Integer, Exercisses> entry : ht.entrySet()) {
                         if(sword == null ? entry.getValue().word == null : sword.equals(entry.getValue().word)){
                             Exercisses.Header();
                             entry.getValue().Output();
                             b=true;
                         }
                         
                     }
                     if(b==false){
                         System.out.println("Search not found ..!");
                     }
                 }
                 case 4 -> {
                     for (Map.Entry<Integer, Exercisses> entry : ht.entrySet()) {
                           System.out.println("Key"+entry.getKey()+",");
                           entry.getValue().Output();
                     }
                     int skey;
                     boolean b=false;
                     System.out.print("Input key to  update :");
                     skey = objin.nextInt();
                     for (Map.Entry<Integer, Exercisses> entry : ht.entrySet()) {
                         if(skey==entry.getKey()){
                             ex = new Exercisses();
                             ex.Input();
                             ht.put(skey, ex);
                             b=true;
                             System.out.println("Update Successful ..!");
                         }
                     }
                     if(b==false){
                         System.out.println("Search not  found ..!");
                     }
                 }
                 case 5 -> {
                     for (Map.Entry<Integer, Exercisses> entry : ht.entrySet()) {
                           System.out.println("Key"+entry.getKey()+",");
                           entry.getValue().Output();
                     }
                     int skey;
                     boolean b=false;
                     System.out.print("Input key to  update :");
                     skey = objin.nextInt();
                     for (Map.Entry<Integer, Exercisses> entry : ht.entrySet()) {
                         if(skey==entry.getKey()){
                             ht.remove(entry.getKey());
                             System.out.println("Remove Successful ..!");
                         }
                     }
                     if(b==false){
                         System.out.println("Search not  found ..!");
                     }
                 }
             }
       

         } while (op!=0);
    }
}
