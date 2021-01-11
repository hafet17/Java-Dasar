
import java.util.Scanner;

/**
 *
 * @author Hafidz
 */
public class Percabangan4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user , pass;
        
        System.out.print("Username : "); user = input.next();
        System.out.print("Password : "); pass = input.next();
    
    
        if (user.equals("root")  && pass.equals("1")) {
            System.out.println("Login Sukses");
        } else {
            System.out.println("Login Gagal");
        }
        
    }

}
