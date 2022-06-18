/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarRentDeb;

/**
 *
 * @author ACER
 */
class Car {
    private String carType;
    private String polNum;
    private String merk;
    private boolean status;

    public Car(String carType, String polNum, String merk) {
        this.carType = carType;
        this.polNum = polNum;
        this.status = true;
        this.merk = merk;
        
    }
    
    public String getCarType() {
        return carType;
    }
    public void setCarType(String carType) {
        this.carType = carType;
    }
    public String getPolNum() {
        return polNum;
    }
    public void setPolNum(String polNum) {
        this.polNum = polNum;
    }
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    void setStatus(String xtrue) {
         
    }

    void setstatus(String afalse) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
