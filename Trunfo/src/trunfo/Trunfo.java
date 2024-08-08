/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trunfo;

import jogo.*;
import cartas.*;

/**
 *
 * @author renan.mssouza
 */
public class Trunfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Carta carta1 = new Pikachu();
        Carta carta2 = new Bulbassauro();
         
        Jogo pokemon = new Jogo(carta1, carta2);
        
        System.out.print(("carta do j1 e " + pokemon.tipoCarta(1)));
        
        System.out.println(((Pikachu)carta1).nostalgia());
       
    }
    
}
