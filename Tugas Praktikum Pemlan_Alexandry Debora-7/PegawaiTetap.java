/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolimorDeb;

/**
 *
 * @author ACER
 */
public class PegawaiTetap extends Pegawai {
    private double upah;

    public PegawaiTetap(String nama, String nomorKTP, double upah) {
        super(nama, nomorKTP);
        this.upah = upah;}

    public void setUpah(double upah) {
        this.upah = upah;}

    public double getUpah() {
        return upah;}

    @Override
    public String toString() {
        String print = "";

        System.out.printf("%-20s: %s%n", "Pegawai Tetap", getNama());
        print += String.format("%-20s: %.1f%n", "Upah", getUpah());
        print += String.format("%-20s: Rp %d%n", "Pendapatan", (int)(getUpah()));

        return super.toString() + print;
    }
}