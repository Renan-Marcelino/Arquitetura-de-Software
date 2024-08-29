/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplologinmvc;

import controler.*;
import dados.*;
import model.*;
import views.*;
/**
 *
 * @author renan.mssouza
 */
public class ExemploLoginMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dados dados = new Dados();

        //System.out.println(Dados.logins.get(0));
        //System.out.println(Dados.senhas.get(0));
//
        //System.out.println(FcUsuarios.buscaNome("lele"));

        Login lg = new Login();
        ControlerUsuario ct = new ControlerUsuario(lg, fc);
    }

}
