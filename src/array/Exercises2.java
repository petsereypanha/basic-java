package array;

import java.util.Scanner;

public class Exercises2 {
    public static void main(String[] args) {
            double [] score = new double[100];
            double  totalscore = 0;
            double  average = 1 ;
            String  grade = null;
            int n;
            Scanner objin = new Scanner(System.in);
            System.out.print("Input Element of Array :");
            n = objin.nextInt();
//            Input
            for (int i = 0; i < n; i++) {
                System.out.print("Input Score["+i+"] :");
                score[i] = objin.nextDouble();
                totalscore += score[i];
                average = totalscore/i;
                grade = (average<100 && average >=90)? "A"
                     :(average<90 && average >=80)? "B"
                     :(average<80 && average >=70)? "C"
                     :(average<70 && average >=60)? "D"
                     :(average<60 && average >=50)? "E"
                     : "F" ;       
            }
//            Output
            for (int i = 0; i < n; i++) {
                System.out.println("Output Score["+i+"]      :"+score[i]);
                System.out.println("Output TotalScore["+i+"] :"+totalscore);
                System.out.println("Output Average["+i+"]    :"+average);
                System.out.println("Output Grade["+i+"]      :"+grade);
            }
    }
    
}
