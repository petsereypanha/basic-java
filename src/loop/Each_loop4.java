package loop;

import java.util.Scanner;

public class Each_loop4 {
    public static void main(String[] args) {
        boolean isVowel = false; 
        char ch;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a character : ");
            ch = scanner.next().charAt(0);
        }
        switch(ch){
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> isVowel     =  true;
           
        }
        if(isVowel == true){
            System.out.println(ch+" is a Vowel");
        }
        else {
            if(ch>='a' && ch <='z' || ch >='A' && ch <= 'z'){
                System.out.println(ch+"is a Consonant");
            }
            else {
                System.out.println("Input is not an alphabet");
            }
        }
    }
    
}
