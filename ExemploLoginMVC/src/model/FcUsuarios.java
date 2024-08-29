/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dados.Dados;

/**
 *
 * @author renan.mssouza
 */
public class FcUsuarios {

    public static boolean buscaNome(String nome) {
        return Dados.logins.contains(nome);
    }

    public static boolean validaUsuario(Usuario user) {
        if (!buscaNome(user.getNome())) {
            return false;
        }

        int i = 0;
        while ((Dados.logins.get(i).equals(user.getNome()))) {
            i++;
        }
        return (Dados.senhas.get(i).equals(user.getSenha()));

    }

    public static boolean isereUsuario(Usuario user) {
        Dados.logins.add(user.getNome());
        Dados.senhas.add(user.getNome());
        return true;
    }
}
