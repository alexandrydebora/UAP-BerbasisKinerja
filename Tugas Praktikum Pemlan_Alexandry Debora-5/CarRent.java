/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarRentDeb;

/**
 *
 * @author ACER
 */
public class CarRent {
    private final int rentDur;
    private final Car car;
    private final CarRider rider;

    public CarRent(CarRider rider, Car car, int rentDur) {
        this.rentDur = rentDur;
        this.car = car;
        this.rider = rider;
    }

    public int getRentDur() {
        return rentDur;
    }

    public Car getCar() {
        return car;
    }

    public CarRider getRider() {
        return rider;
    }

}
