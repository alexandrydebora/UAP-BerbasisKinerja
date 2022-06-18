/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolimorDeb;

/**
 *
 * @author ACER
 */
public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;

    public Sales(String nama, String nomorKTP, int penjualan, double komisi) {
        super(nama, nomorKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;}

    public int getPenjualan() {
        return penjualan;}

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;}

    public double getKomisi() {
        return komisi;}

    public void setKomisi(double komisi) {
        this.komisi = komisi;}

    @Override
    public String toString() {
        String print = "";

        System.out.printf("%-20s: %s%n","Sales", getNama());
        print += String.format("%-20s: %d%n", "Total Penjualan", getPenjualan());
        print += String.format("%-20s: %.1f%n", "Besaran Komisi", getKomisi());
        print += String.format("%-20s: Rp %d%n", "Pendapatan", (int) (getPenjualan() * getKomisi()));

        return super.toString() + print;
    }
}
