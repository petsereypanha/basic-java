package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class student {
	      private int id;
	      private String name,gender,grade;
	      private float score1,score2,score3,total,avg;
	      
	      public student(){
	 
	      }
	      public void Input() {
	    	 Scanner cin = new Scanner(System.in);
	    	 System.out.print("Input ID     :"); id = cin.nextInt();
	    	 System.out.print("Input Name   :"); name = cin.next();
	    	 System.out.print("Input Gender :"); gender = cin.next();
	    	 System.out.print("Input Score1 :"); score1 = cin.nextFloat();
	    	 System.out.print("Input Score2 :"); score2 = cin.nextFloat();
	    	 System.out.print("Input Score3 :"); score3 = cin.nextFloat();	    	 
	    	 total = score1 + score2 +score3;
	    	 avg = total/3;
	    	 grade = (avg>=90&&avg<=100)? "A" :
	    		     (avg<=90&&avg>80)?  "B" :
	    		     (avg<=80&&avg>70)?  "C" :
		    		 (avg<=70&&avg>60)?  "D" :
		    		 (avg<=80&&avg>70)?  "E" :
		    	     "F";
	      }
	      public static void Header() {
	    	  System.out.printf("\n%12s%14s%16s%15s%15s\n","ID","Name","Gender","Total","Grade");
	      }
	      public void Output() {
	    	  System.out.printf("\n%12d%14s%16s%15.2f%15s\n",id,name,gender,total,grade);
	      }
	      public int Search(ArrayList<student> list, int size) {
	    	  Scanner cin = new Scanner(System.in);
	    	  int i,sid, index=-1;
	    	  System.out.print("Input Student ID for Search :");
	    	  sid = cin.nextInt();
	    	  for(i=0;i<size;i++) {
	    		  if(sid==list.get(i).id) {
	    			  index = i;
	    		  }
	    	  }
	    	  return index;
	      }
}
