package function;

import java.util.Scanner;

public final class non_has1 {
        void Student(int id,String name,String gender, float score1, float  score2, float score3){
            System.out.println("ID\tName\tGender\tScore1\tScore2\tScore3");
            System.out.println(+id+"\t"+name+"\t"+gender+"\t"+score1+"\t"+score2+"\t"+score3);
        }
        public non_has1(){
            int id;
            String name,gender;
            float   score1,score2,score3;
            Scanner objin = new Scanner(System.in);
            System.out.print("Input ID     :"); id=objin.nextInt();
            System.out.print("Input Name   :"); name=objin.next();
            System.out.print("Input Gemder :"); gender=objin.next();
            System.out.print("Input Score1 :"); score1=objin.nextFloat();
            System.out.print("Input Score2 :"); score2=objin.nextFloat();
            System.out.print("Input Score3 :"); score3=objin.nextFloat();
            Student(id,name,gender,score1,score2,score3);
        }
     public static void main(String[] args) {
         new non_has1();
    }
    
}
