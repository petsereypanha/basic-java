
package control_statement;
public class If_else3 {
    public static void main(String[] args) {
         String uname,pass,upass;
        uname="dyna";
        pass="123";
        upass="123";
        if(uname.equals("dyna"))
            if(pass.equals("123"))
                if(upass.equals("123"))
                    System.out.println("Well Come To User Login ...!");
                else
                    System.out.println("Invalid Comfirm Password");
            else
                    System.out.println("Invalid Comfirm Password");
        else
                    System.out.println("Invalid Comfirm Password");
    }
    
}
