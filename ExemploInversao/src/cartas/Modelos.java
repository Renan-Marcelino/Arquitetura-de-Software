/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartas;

import java.util.ArrayList;

/**
 *
 * @author alexandre.romao
 */
public class Modelos {
    
    public static void especial(Cartas carta){
        if(carta.getClass().getSimpleName().equals("Pikachu")){
            ((Pikachu)(carta)).choqueTrovao();
        }
        else if(carta.getClass().getSimpleName().equals("Bulbassauro")){
            ((Bulbassauro)(carta)).chicote();
        }else {
            System.out.println("QUEBROU");
        }
    }
    
    
}
