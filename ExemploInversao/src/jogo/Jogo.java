/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogo;

import cartas.*;

/**
 *
 * @author alexandre.romao
 */
public class Jogo {

    private Cartas player1;

    public Jogo(Cartas carta) {
        this.player1 = carta;
    }
    
    public void especial(Cartas carta){
        Modelos.especial(carta);
    }
}
