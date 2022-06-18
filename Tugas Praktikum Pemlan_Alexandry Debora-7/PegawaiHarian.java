/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolimorDeb;

/**
 *
 * @author ACER
 */
public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String nomorKTP, double upahPerJam, int totalJam) {
        super(nama, nomorKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;}

    public double getUpahPerJam() {
        return upahPerJam;}
    
    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;}

    public int getTotalJam() {
        return totalJam;}

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;}

    @Override
    public String toString() {
        String print = "";
        System.out.printf("%-20s: %s%n", "Pegawai Harian", getNama());
        print += String.format("%-20s: Rp %.1f%n", "Upah/Jam", getUpahPerJam());
        print += String.format("%-20s: %d%n", "Total Jam Kerja", getTotalJam());

        if ((int) getTotalJam() <= 40)
            print += String.format("%-20s: Rp %d%n", "Pendapatan", (int) (getUpahPerJam() * getTotalJam()));
        else
        print += String.format("%-20s: Rp %d%n", "Pendapatan", (int) ((40 * getUpahPerJam()) + ((getTotalJam() - 40) * getUpahPerJam() * 1.5)));

        return super.toString() + print;
    }
}
