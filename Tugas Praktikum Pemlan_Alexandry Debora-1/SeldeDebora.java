/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrak1Debora;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class SeldeDebora {
    public static void main(String args[]){  
        Scanner scan = new Scanner(System.in);
        int angka;
        angka = scan.nextInt();

        isSelde(angka);
    }
    
    public static int balik(int angka) {
        int hasil;
        hasil = 0;
        int mod;

        while (angka > 0) {
            mod = angka % 10;
            hasil = hasil * 10 + mod;
            angka = angka / 10;
        }

        return hasil;
    }

    public static boolean isSelde(int angka) {
        int selde;
        selde = angka;

        if (selde == balik(angka))
            System.out.println(angka + " adalah selde.");
        else
            System.out.println(angka + " bukan selde.");

        return true;
    }
}

