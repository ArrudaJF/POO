/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project2;

/**
 *
 * @author 11212640
 */
public class Principal {
    
    public static void main(String[] args) {
    Lista lista;
    // mudar o comando abaixo para lista = new ListaSequencial();
    // deverá gerar o mesmo efeito!
    lista = new ListaEncadeada();
    lista.inserir(new Usuario("Marcelo"));
    lista.inserir(new Usuario("Joao"));
    lista.inserir(new Usuario("Pedro"));
    lista.inserir(new Usuario("Gustavo"));
    lista.inserir(new Usuario("Larissa"));
    lista.inserir(new Usuario("Flavia"));
    lista.imprimir();
    lista.remover(new Usuario("Gustavo"));
    lista.imprimir();
    }
    
    /*Saída esperada:
    Marcelo Joao Pedro Gustavo Larissa Flavia
    Marcelo Joao Pedro Larissa Flavia */
}
