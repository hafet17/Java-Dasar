
import java.util.Scanner;

/**
 *
 * @author Hafidz
 */
public class Percabangan3 {
    public static void main(String[] args) {
        Scanner kali = new Scanner(System.in);
        
        int menu;
        System.out.println("Program Memilih Menu Makanan");
        System.out.println("=============================");
        System.out.print("Masukkan Type Menu = ");
        menu = kali.nextInt();
        
        if (menu ==1)
            System.out.println("Ayam Goreng");
         else if (menu ==2) 
            System.out.println("Mie Goreng");
         else if (menu ==3) 
            System.out.println("Nasi Pecel");
         else if (menu ==4)
             System.out.println("Lalapan Lele");
         else 
             System.out.println("Pilih Menu Yang Lain");
    }
}
