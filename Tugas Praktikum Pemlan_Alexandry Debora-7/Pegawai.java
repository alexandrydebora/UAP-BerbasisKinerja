/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolimorDeb;

/**
 *
 * @author ACER
 */
public class Pegawai {
    private String nama;
    private String nomorKTP;

    public Pegawai(){}

    public Pegawai(String nama, String nomorKTP) {
        this.nama = nama;
        this.nomorKTP = nomorKTP;}

    public String getNama() {
        return nama;}

    public String getNomorKTP() {
        return nomorKTP;}

    public double gaji(){
        return 0.0;}

    public String toString(){
        String returnString = "";
        returnString += String.format("%-20s: %s%n", "No.KTP", getNomorKTP());
        return returnString;}
}