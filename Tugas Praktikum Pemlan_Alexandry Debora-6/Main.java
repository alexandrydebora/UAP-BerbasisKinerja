/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrak6Debora;

/**
 *
 * @author ACER
 */
import java.util.Arrays;
public class Main {
    static Manusia manusia[];
    static MhsFilkom mahasiswa[];
    static Pekerja pekerja[];
    static Manager manager[];

    public static void main(String[] args) {
        // Class Manusia
        manusia = new Manusia[3];
        System.out.println(" Class Manusia ");
        System.out.println("=================================================");
        manusia[0] = new Manusia("I Putu Yoga", "215150707111019", true, false);
        manusia[1] = new Manusia("Alexandry Debora", "215150707111018", false, true);
        manusia[2] = new Manusia("Iqbal Biondy", "215150707111020", true, true);
        System.out.println(manusia[0].toString());
        System.out.println(manusia[1].toString());
        System.out.println(manusia[2].toString());

        // Class MhsFilkom
        mahasiswa = new MhsFilkom[3];
        System.out.println(" Class Mahasiswa ");
        System.out.println("=================================================");
        mahasiswa[0] = new MhsFilkom("215150707111018", 3.9, "Alexandry Debora", "1211014603030002", false, true);
        mahasiswa[1] = new MhsFilkom("205150607111022", 3.8, "Efrata Hutauruk", "1211014603030004", false, false);
        mahasiswa[2] = new MhsFilkom("195150307111027", 4.0, "Christian Hutauruk", "1211014603030006", true, false);
        System.out.println(mahasiswa[0].toString());
        System.out.println(mahasiswa[1].toString());
        System.out.println(mahasiswa[2].toString());

        // Class Pekerja
        pekerja = new Pekerja[3];
        System.out.println(" Class Pekerja ");
        System.out.println("=================================================");
        pekerja[0] = new Pekerja(9, 25, "212150507111018", "Joko Pramono", "1211014603030002", true, true);
        pekerja[1] = new Pekerja(9, 23, "313150607111018", "Retno Indah", "1211014603030004", false, true);
        pekerja[2] = new Pekerja(7, 27, "124150707111018", "Hariz Farisi", "1211014603030006", true, false);
        System.out.println(pekerja[0].toString());
        System.out.println(pekerja[1].toString());
        System.out.println(pekerja[2].toString());

        // Class Manager
        manager = new Manager[3];
        System.out.println(" Class Manager ");
        System.out.println("=================================================");
        manager[0] = new Manager(1500, 9, 20, "216150707111018", "Raditya Dika", "1211014603030002", false, true);
        manager[1] = new Manager(1600, 9, 20, "317150807111018", "Maudy Ayunda", "1211014603030004", false, false);
        manager[2] = new Manager(1700, 9, 20, "418150907111018", "Deddy Corbuzier", "1211014603030006", true, false);
        System.out.println(manager[0].toString());
        System.out.println(manager[1].toString());
        System.out.println(manager[2].toString());

        // Jumlah
        System.out.println("                     Total                       ");
        System.out.println("=================================================");
        System.out.println("Jumlah Manusia : " + manusia.length);
        System.out.println("Jumlah Mahasiswa : " + mahasiswa.length);
        System.out.println("Jumlah Pekerja : " + pekerja.length);
        System.out.println("Jumlah Manager : " + manager.length);
    }
}
