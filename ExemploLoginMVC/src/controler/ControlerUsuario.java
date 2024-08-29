/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import model.*;

/**
 *
 * @author renan.mssouza
 */
public class ControlerUsuario {

    private FcUsuarios fcusuario;
    private ViewUsuario viewusuario;

    public ControlerUsuario(FcUsuarios fcusuario, ViewUsuario viewusuario) {
        this.fcusuario = fcusuario;
        this.viewusuario = viewusuario;
    }

    public boolean validaSenha(Usuario user){
        return FcUsuarios.validaUsuario(user);
    }
    
    
    
}
