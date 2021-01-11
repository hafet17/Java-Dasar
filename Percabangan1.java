
import java.util.Scanner;

/**
 *
 * @author Hafidz
 */
public class Percabangan1 {
    public static void main(String[] args) {
        Scanner kali = new Scanner(System.in);
        
        Double status,angka;
        System.out.print("Masukkan Angka = ");
        angka = kali.nextDouble();
        
        status = angka%2;
        if (status ==0) {
            System.out.println("Bilangan Genap");
        } else {
            System.out.println("Bilangan Ganjil");
        }
    }
    
}
