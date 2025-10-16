/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basic;

import java.util.Scanner;

/**
 *
 * @author sereypanha
 */
public class Exerses1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String id,name,gender,Addres;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input ID        :"); id=sc.next();
        System.out.print("Input Name      :"); sc.nextLine(); name=sc.nextLine();
        System.out.print("Input Gender    :"); gender=sc.next();
        System.out.print("Input Address   :"); sc.nextLine(); Addres=sc.nextLine();
        
        System.out.println("Output ID     :"+id);
        System.out.println("Output Name   :"+name);
        System.out.println("Output Gender :"+gender);
        System.out.println("Output Address:"+Addres);
    }
    
}
