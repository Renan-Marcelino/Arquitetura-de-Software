/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package jogo;

import cartas.*;

/**
 *
 * @author renan.mssouza
 */

public class Jogo {
    
    private Carta jogador1;
    private Carta jogador2;
    
    public Jogo(Carta j1, Carta j2) {
       this.jogador1 = j1;
       this.jogador2 = j2;
       
       
    }

    public String tipoCarta(int j){
        if (j == 1){
            return jogador1.getClass().getCanonicalName();
        } else if (j == 2) {
            return jogador2.getClass().getCanonicalName();
        } else {
            return "";
        }
        
    }
    
    public String tipoCarta(Carta t){
            return t.getClass().getCanonicalName();
        } 

    public int batalhaATK() {
        if (jogador1.getATK() == jogador2.getATK()){
            return 0;
        }else if (jogador1.getATK() > jogador2.getATK()) {
            return 1;
        } else {
            return 2;
        }
    }
    
}

