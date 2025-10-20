/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package control_statement;

import java.util.Scanner;

/**
 *
 * @author sereypanha
 */
public class Swicht_Case1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int week;
        Scanner objin = new Scanner(System.in);
        System.out.print("Input Week:"); week=objin.nextInt();
        switch (week) {
            case 1 -> {
                System.out.println("Day1!");
            }
             case 2 -> {
                System.out.println("Day2!");
            }
             case 3 -> {
                System.out.println("Day3!");
            }
             case 4 -> {
                System.out.println("Day4!");
            }
            default -> {
                System.out.println("Invide Day");
            }
        }
    }
    
}
