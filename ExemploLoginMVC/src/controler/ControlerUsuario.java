/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import model.*;
import views.*;

/**
 *
 * @author renan.mssouza
 */
public class ControlerUsuario {

    private FcUsuarios fcusuario;
    private Login viewusuario;

    public ControlerUsuario(FcUsuarios fcusuario, Login viewusuario) {
        this.fcusuario = fcusuario;
        this.viewusuario = viewusuario;
    }

    public Usuario login(){
        return viewusuario.login();
    }
    
    public boolean validaSenha(Usuario user){
        return FcUsuarios.validaUsuario(user);
    }
    
    
    
}
