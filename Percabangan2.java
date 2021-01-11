
import java.util.Scanner;

/**
 *
 * @author Hafidz
 */
public class Percabangan2 {

    public static void main(String[] args) {
        Scanner kali = new Scanner(System.in);

        String Pemograman;
        System.out.println("Program Memilih Pemograman Web");
        System.out.println("====================================");
        System.out.print("Masukkan Type = ");
        Pemograman = kali.next();

        if (Pemograman.equalsIgnoreCase("1")) {
            System.out.println("HTML (Hypertext Markup Languange)");
        } else if (Pemograman.equalsIgnoreCase("2")) {
            System.out.println("PHP (Hypertext Processor)");
        } else if (Pemograman.equalsIgnoreCase("3")) {
            System.out.println("CSS (Cascading Style Sheet)");
        } else if (Pemograman.equalsIgnoreCase("4")) {
            System.out.println("JS (Java Script)");
        } else {
            System.out.println("Cek Pemograman Lagi");
        }

    }

}
