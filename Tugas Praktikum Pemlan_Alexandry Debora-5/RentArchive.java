/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarRentDeb;

/**
 *
 * @author ACER
 */
import java.util.ArrayList;
public class RentArchive {
ArrayList<CarRent> rentData;

    public RentArchive() {
        rentData = new ArrayList<>();
    }
    public void Rent(CarRider rider, Car car, int rentDur) {

        if (car.isStatus() == true) {
            System.out.println("MOBIL BERHASIL DISEWA");
            car.setStatus(false);
            rentData.add(new CarRent(rider, car, rentDur));
        } 
        else {
            System.out.println("MAAF, MOBIL SUDAH DISEWA");
        }
    }

    public void info() {
        System.out.println("==============================");
        System.out.println("INFORMASI PELANGGAN");
        System.out.println("==============================");
        for (CarRent i : rentData) {
            System.out.println("NAMA PEMINJAM : " + i.getRider().getName());
            System.out.println("TIPE MOBIL    : " + i.getCar().getCarType());
            System.out.println("NO. POLISI    : " + i.getCar().getPolNum());
            System.out.println("LAMA RENTAL   : " + i.getRentDur());

        }

    }

}
