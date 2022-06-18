/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3Debora;

/**
 *
 * @author ACER
 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Alexandry Debora");
        System.out.println("215150707111018");
        
        Baju.tampilan();
        Baju tokobaju = new Baju();
        Scanner scan = new Scanner(System.in);
        System.out.print("Baju yang akan anda beli bertipe : ");
        tokobaju.JenisBaju = scan.nextLine();
        System.out.print("Jumlah Baju yang akan anda beli adalah : ");
        tokobaju.jumlah = scan.nextInt();

        System.out.println("Jenis  yang anda beli : "+tokobaju.JenisBaju);
        tokobaju.harga();
        tokobaju.menghitung(tokobaju.jumlah);


    }
}