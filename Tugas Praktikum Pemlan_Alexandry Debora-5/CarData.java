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
public class CarData {
    ArrayList<Car> carList;

    public CarData() {
        carList = new ArrayList<>();
    }

    public void addCar(String carType, String polNum, String merk) {
        carList.add(new Car(carType, polNum, merk));
    }

    public void listOfCar() {
        System.out.println("==============================");
        System.out.println("DAFTAR MOBIL");
        System.out.println("==============================");
        for (Car i : carList) {
            System.out.print("TIPE MOBIL : " + i.getCarType());
            System.out.println();
            System.out.print("NO. POLISI : " + i.getPolNum());
            System.out.println();
            System.out.print("MERK MOBIL : " + i.getMerk());
            System.out.println();
            System.out.println("==============================");
        }
    }

}
