package basic;

import java.util.Scanner;

public class sintak {

    public static void main(String[] args) {
        int id;
        String name;
        float score;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input ID    :"); id=sc.nextInt();
        System.out.print("Input Name  :");sc.nextLine(); name=sc.nextLine();
        System.out.print("Input Score :"); score=sc.nextFloat();
        
        System.out.println("ID        :"+id);
        System.out.println("Name      :"+name);
        System.out.println("Score      :"+score);
    }
    
}
