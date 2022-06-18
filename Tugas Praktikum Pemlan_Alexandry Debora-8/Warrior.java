/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas8Debora;

/**
 *
 * @author ACER
 */
public class Warrior extends Character {

    Warrior(){
        setHP(80);
        setAttack(25);
        setDefense(30);
    }

    @Override
    public boolean attack() {
        double counter = Math.random() * 10;
        if (counter > 0 && counter <= 6.0)
            return true;
        else
            return false;
    }
}
