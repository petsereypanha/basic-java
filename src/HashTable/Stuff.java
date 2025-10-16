package HashTable;

import java.util.*;

public class Stuff {  // public = default 
    private int id;
    private String name,gender,position;
    private float salary;
    
    public void Input() {
		Scanner cin = new Scanner(System.in);
		System.out.print("Input ID      :"); id = cin.nextInt();
		System.out.print("Input Name    :"); cin.nextLine();name = cin.nextLine();
		System.out.print("Input Gender  :"); gender = cin.next();
		System.out.print("Input Position:"); cin.nextLine(); position = cin.nextLine();
		System.out.print("Input Salary  :"); salary = cin.nextFloat();
	}
    
    public static void Header() {
		System.out.printf("\n%12s%14s%16s%18s%16s\n","ID","Name","Gender","Position","Salary");
	}
    
    public void Output() {
		System.out.printf("%12d%14s%16s%18s%16.2f\n",id,name,gender,position,salary);
	}
    public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		Hashtable<Integer, Stuff> ht = new Hashtable<>();
		Stuff st = new Stuff();
		int i,n,op;
		do {
			System.out.println("==========| M E N U |==========");
			System.out.println("|    1.  Input                 |");
			System.out.println("|    2.  Output                |");
			System.out.println("|    3.  Search                |");
			System.out.println("|    4.  Update                |");
			System.out.println("|    5.  Remove                |");
			System.out.println("|    0.  Exit                  |");
			System.out.println("===============================");
			System.out.print("Please Select One Option  :");
			op = cin.nextInt();
			switch(op) {
			case 1 -> {
				System.out.print("Input Number of Stuff :");
				n = cin.nextInt();
				for(i=0;i<n;i++) {
					System.out.println("==========| Stuff "+(i+1)+" |===========");
					st = new Stuff();
					st.Input();
					ht.put(i, st);
				}
			}
			case 2 -> {
				Stuff.Header();
				for(Map.Entry<Integer, Stuff> tem : ht.entrySet()) {
					tem.getValue().Output();
				}
			}
			case 3 -> {
				int sid;
				System.out.print("Input Stuff ID for Search  :");
				sid = cin.nextInt();
//				for(Map.Entry<Integer, Stuff> tem : ht.entrySet()) {
//					boolean b=ht.contains(sid);
//					if(b) {
//						tem.getKey();
//					}else {
//						System.out.println("Search not Found ..!");
//					}
//				}
				boolean b = false;
				for(Map.Entry<Integer, Stuff> tem : ht.entrySet()) {
				     if(sid==tem.getValue().id) {
				    	 Stuff.Header();
				    	 tem.getValue().Output();
				    	 b=true;
				     }
			    }
				if(b==false) {
					System.out.println("Search not Found ..!");
				}
			}
			case 4 -> {
//				int sid=0;
//				System.out.print("Input Stuff ID for Search  :");
//				sid = cin.nextInt();
//				for(Map.Entry<Integer, Stuff> tem : ht.entrySet()) {
//					boolean b=ht.contains(sid);
//					if(b) {
//						tem.getValue().Input();
//					}else {
//						System.out.println("Search not Found ..!");
//					}
//				}
				for(Map.Entry<Integer, Stuff> tem : ht.entrySet()) {
				    System.out.println("Key"+tem.getKey()+",");
				    tem.getValue().Output();
				}
				int skey;
				System.out.print("Input Stuff Key for Search  :");
				skey = cin.nextInt();
				boolean b = false;
				for(Map.Entry<Integer, Stuff> tem : ht.entrySet()) {
				     if(skey==tem.getKey()) {
				    	 st = new Stuff();
				    	 st.Input();
				    	 ht.put(skey, st);
				    	 b=true;
				    	 System.out.println("Update Successful ..!");
				     }
			    }
				if(b==false) {
					System.out.println("Search not Found ..!");
				}
				
			}
			case 5 -> {
//				int sid;
//				System.out.print("Input Stuff ID for Search  :");
//				sid = cin.nextInt();
//				for(Map.Entry<Integer, Stuff> tem : ht.entrySet()) {
//					boolean b=ht.contains(sid);
//					if(b) {
//						tem.getKey();
//						ht.remove(sid);
//					}else {
//						System.out.println("Search not Found ..!");
//					}
//				}
				for(Map.Entry<Integer, Stuff> tem : ht.entrySet()) {
				    System.out.println("Key"+tem.getKey()+",");
				    tem.getValue().Output();
				}
				int skey;
				System.out.print("Input Stuff Key for Search  :");
				skey = cin.nextInt();
				boolean b = false;
				for(Map.Entry<Integer, Stuff> tem : ht.entrySet()) {
				     if(skey==tem.getKey()) {
				    	 ht.remove(tem.getKey());
				    	 b=true;
				    	 System.out.println("Remove Successful ..!");
				     }
			    }
				if(b==false) {
					System.out.println("Search not Found ..!");
				}
			}
			}
		}while(op!=0);
	}
}
