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
public class Baju {
    String JenisBaju;
    int Total;
    double HargaBaju;
    int jumlah;
    Scanner scan=new Scanner(System.in);

    final double bajua= 100000;
    final double bajub= 125000;
    final double bajuc= 175000;

    static void tampilan(){
        System.out.println("Baju yang tersedia:");
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");
        System.out.println("Baju C dengan harga 175000");
    }
    void harga(){
        if(JenisBaju.equalsIgnoreCase("A")|| JenisBaju.equalsIgnoreCase("a")){
            HargaBaju=bajua;
            if (jumlah<=100) {
                System.out.println("Harga per buah        : "+(int)(bajua));
            }else if(jumlah>100){
                double diskon=5000;
                System.out.println("Harga per buah        : "+(int)(bajua-diskon));
            }
        }if (JenisBaju.equalsIgnoreCase("B") || JenisBaju.equalsIgnoreCase("b") ) {
            HargaBaju=bajub;
            if (jumlah<=100) {
                System.out.println("Harga per buah        : "+(int)(bajub));
            }else if(jumlah>100){
                double diskon=5000;
                System.out.println("Harga per buah        : "+(int)(bajub-diskon));
            }
        }if (JenisBaju.equalsIgnoreCase("C") || JenisBaju.equalsIgnoreCase("c")) {
            HargaBaju=bajuc;
            if (jumlah<=100) {
                System.out.println("Harga per buah        : "+(int)(bajuc));
            }else if(jumlah>100){
                double diskon=15000;
                System.out.println("Harga per buah        : "+(int)(bajuc-diskon));
            }

        }
    }
    void menghitung(int jumlah){
        if(JenisBaju.equalsIgnoreCase("A") || JenisBaju.equalsIgnoreCase("a")){
            HargaBaju=bajua;
            if (jumlah<=100) {
                Total=(int)(HargaBaju*jumlah);


                System.out.println("Total harga           : " + Total);
            }else if(jumlah>100){
                double diskon=5000;
                Total=(int)((HargaBaju-diskon)*jumlah);
                System.out.println("Total harga           : " + Total);
            }
        }if (JenisBaju.equalsIgnoreCase("B") || JenisBaju.equalsIgnoreCase("b")) {
            HargaBaju=bajub;
            if (jumlah<=100) {
                Total=(int)(HargaBaju*jumlah);
                System.out.println("Total harga           : " + Total);
            }else if(jumlah>100){
                double diskon=5000;
                Total=(int)((HargaBaju-diskon)*jumlah);
                System.out.println("Total harga           : " + Total);
            }
        }if (JenisBaju.equalsIgnoreCase("C") || JenisBaju.equalsIgnoreCase("c")) {
            HargaBaju=bajuc;
            if (jumlah<=100) {
                Total=(int)(HargaBaju*jumlah);
                System.out.println("Total harga           : " + Total);
            }else if(jumlah>100){
                double diskon=15000;
                Total=(int)((HargaBaju-diskon)*jumlah);
                System.out.println("Total harga           : " + Total);
            }

        }
    }
    void hasil(){

    }
    void memilih_tipe(String Jenis_Baju){

        switch(JenisBaju.toLowerCase()){

            case "A":{
                jumlah=scan.nextInt();

                break;

            }
            case "B":{
                jumlah=scan.nextInt();
                System.out.println(Jenis_Baju);
                break;
            }
            case "C":{
                jumlah=scan.nextInt();
                System.out.println(Jenis_Baju);
                break;
            }
        }
        switch(Jenis_Baju.toUpperCase()){

            case "A" -> {
                jumlah=scan.nextInt();


            }
            case "B" -> {
                jumlah=scan.nextInt();
                System.out.println(Jenis_Baju);
            }
            case "C" -> {
                jumlah=scan.nextInt();
                System.out.println(Jenis_Baju);
            }
        }
    }


}