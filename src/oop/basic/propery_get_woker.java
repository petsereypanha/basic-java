package oop.basic;

import java.util.Scanner;

public class propery_get_woker {
        private int id,hour;
        private String name,gender;
        private float salary,rate;
        
        // defaul constructor
        public propery_get_woker(){
            
        }
        public int getID(){
            return id;
        }
        // Input
        public void Input(){
            Scanner objin = new Scanner(System.in);
            System.out.print("Input ID     :");id = objin.nextInt();
            System.out.print("Input Name   :");name= objin.next();
            System.out.print("Input Gender :");gender = objin.next();
            System.out.print("Input Hour   :");hour = objin.nextInt();
            System.out.print("Input salary :");salary = objin.nextFloat();
            System.out.print("Input rate   :");rate = objin.nextFloat();
        }
        
        public double Income(){
            return (salary+(hour*rate));
        }
        
        public static void Header(){
            System.out.printf("%-12s%-14s%-15s%-14s%-16s%-14s%-16s\n","ID","Name","Gender","Hour","Salary","Rate","Income");
        }
        public void Output(){
            System.out.printf("%-12d%-14s%-15s%-14d%-15.2f$%-14f%-15.2f$\n",id,name,gender,hour,salary,rate,Income());
        }
    public static void main(String[] args) {
        Scanner objin = new Scanner(System.in);
        propery_get_woker wk[] = new propery_get_woker[50];
        int op,i,n = 0,j;
        boolean f=false;
        do{
            System.out.println("\n===========--------| M E N U |----------============");
            System.out.println("1. Input ");
            System.out.println("2. Output");
            System.out.println("3. Search");
            System.out.println("4. Update");
            System.out.println("5. Delete");
            System.out.println("6. Exite ");
            System.out.println("____________________________________________________");
            System.out.print("Please Select One Option :");
            op = objin.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.print("Input Element of array  :");n=objin.nextInt();
                    for(i=0;i<n;i++){
                        System.out.println("_________________| Woker #"+i+" |_________________");
                        wk[i] = new propery_get_woker();
                        wk[i].Input();
                    }
                }
                case 2 -> {
                    propery_get_woker.Header();
                    for(i=0;i<n;i++){
                        wk[i].Output();
                    }
                }
                case 3 -> {
                    int sid;
                    System.out.print("Input ID To Search :"); sid = objin.nextInt();
                    for(i=0;i<n;i++){
                        if(sid==wk[i].getID()){
                            propery_get_woker.Header();
                            wk[i].Output();
                            f=true;
                        }
                    }
                    if(f==false){
                        System.out.println("Search Error ..!");
                    }
                }
                case 4 -> {
                    int sid;
                    System.out.print("Input ID To Search For Update :"); sid=objin.nextInt();
                    for(i=0;i<n;i++){
                        if(sid==wk[i].getID()){
                            wk[i].Input();
                        }
                        f=true;
                    }
                    if(f==false){
                        System.out.println("Update Error ...!");
                    }
                }
                case 5 ->{
                    int sid;
                    System.out.print("Input ID To Sarch For Delete :");
                    sid = objin.nextInt();
                    for(i=0;i<n;i++){
                        if(sid==wk[i].getID()){
                            for(j=i;j<n-1;j++){
                                wk[j] = wk[j+1];
                            }
                            n--;
                            f=true;
                        }
                    }
                    if(f==false){
                        System.out.println("Delete Error ..!");
                    }
                }
          
            }
        }while(op!=6);
    }
    
}