/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas8Debora;

/**
 *
 * @author ACER
 */
public class Healer extends Character {
    Healer(){
        setHP(70);
        setAttack(10);
        setDefense(10);
    }

    void heal(){
        setHP(getHP() + 25);
    }

    @Override
    public boolean attack() {
        double counter = Math.random() * 10;
        if (counter > 0 && counter <= 8.5)
            return true;
        else
            return false;
    }
}
