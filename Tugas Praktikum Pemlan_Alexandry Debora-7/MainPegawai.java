/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolimorDeb;

/**
 *
 * @author ACER
 */
 import java.util.ArrayList;

public class MainPegawai {
    public static void main(String[] args) {
        ArrayList<Pegawai> pegawai = new ArrayList<>();

        pegawai.add(new PegawaiTetap("Bayu", "350728490327424892342", 200000));
        pegawai.add(new PegawaiHarian("Edo", "350728490327424892343", 8500, 40));
        pegawai.add(new Sales("Tika", "350728490327424892344", 50, 50000));
        
        for (int i = 0; i < pegawai.size(); i++){
            System.out.println(pegawai.get(i).toString());
        }
    }
}
