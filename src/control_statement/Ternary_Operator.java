
package control_statement;
public class Ternary_Operator {
    public static void main(String[] args) {
       int age=10;
       String result = (age>=18) ? "You can vote" : "You cann't vote ..!";
        System.out.println(result);
        
        String gender="Male";
        double bonus = (gender.equalsIgnoreCase("Male")) ? 50.00 : 70.00;
        System.out.println("Bouns :"+bonus+"$");
    }
    
}
