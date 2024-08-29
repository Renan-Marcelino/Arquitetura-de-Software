/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import java.util.Scanner;
import model.Usuario;

/**
 *
 * @author renan.mssouza
 */
public class Login {

    public Usuario login() {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o nome do usuario");
        String nome = sc.nextLine();
        System.out.println("digite a senha do usuario");
        String senha = sc.nextLine();

        return new Usuario(nome, senha);
    }
}
