/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartas;

/**
 *
 * @author renan.mssouza
 */
public class Pikachu implements Carta{
    
    private int atk = 80;
    private int hp = 100;

    @Override
    public void setATK(int atk) {
        
    }

    @Override
    public void setHP(int hp) {
    }

    @Override
    public int getATK() {
        return this.atk;
    }

    @Override
    public int getHP() {
        return this.hp;
    }
    
    public String nostalgia(){
        return "sim";
    }
    
}
