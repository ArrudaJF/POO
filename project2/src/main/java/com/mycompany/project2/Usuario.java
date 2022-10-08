/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project2;

/**
 *
 * @author 11212640
 */
public class Usuario implements IElemento {
    String nome;
    
    public Usuario(String nome){
        this.nome = nome;
    }
    
    @Override
    public boolean equals(IElemento e) {
        Usuario user = (Usuario) e;
        return  this.nome.equalsIgnoreCase(user.nome);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String s) {
        this.nome = s;
    }
    
    
}
