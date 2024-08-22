/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploinversao;
import cartas.*;
import jogo.*;

/**
 *
 * @author alexandre.romao
 */
public class ExemploInversao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       Cartas teste = new Pikachu();
       
       Jogo jogoTeste = new Jogo(teste);
       
       jogoTeste.especial(teste);

    }
    
}
