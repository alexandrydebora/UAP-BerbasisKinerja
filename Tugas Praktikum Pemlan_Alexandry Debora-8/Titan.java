/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas8Debora;

/**
 *
 * @author ACER
 */
public class Titan extends Character {
    Titan(){
        setHP(200);
        setAttack(45);
        setDefense(0);
    }

    @Override
    public boolean attack() {
        double counter = Math.random() * 10;
        if (counter > 0 && counter <= 4.0)
            return true;
        else
            return false;
    }
}
