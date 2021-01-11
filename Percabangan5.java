
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hafidz
 */
public class Percabangan5 {
    public static void main(String[] args) {
        Scanner kali = new Scanner(System.in);
        
        System.out.println("Program Memiih Jurusan STTNJ");
        System.out.println("1.Tehnik Informatika");
        System.out.println("2.Tehnik Elektrp");
        System.out.print("Masukkan Jurusan = ");
        int pilih = kali.nextInt();
        
        if (pilih ==1) {
            System.out.println("Anda Memilih Tehnik Informatika ");
        } else if (pilih ==2) {
            System.out.println("Anda Memilih Tehnik Elektro ");
        } else {
            System.out.println("Cek Jurusan Lagi ");
        }
        
    } 
}
