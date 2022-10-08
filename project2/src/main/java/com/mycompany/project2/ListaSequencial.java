/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project2;

/**
 *
 * @author 11212640
 */
public class ListaSequencial extends Lista{
    IElemento[] data;
    
    
    public ListaSequencial(){
        this.data = new IElemento[0];
    }
    @Override
    public void inserir(IElemento elem) {
        int tam = data.length;
        IElemento[] novaLista = new IElemento[tam + 1];
        System.arraycopy(data, 0, novaLista, 0, tam);
        novaLista[tam] = elem;
        data = novaLista;
    }

    @Override
    public void remover(IElemento elem){
        int i = 0;
        for (IElemento data1 : data){
            Usuario user = (Usuario) data1;
            if (user.equals(elem)){
                break;
            }
            i++;
        }
        IElemento[] copyArray = new IElemento[data.length - 1];
        System.arraycopy(data, 0, copyArray, 0, i);
        System.arraycopy(data, i + 1, copyArray, i, data.length - i - 1);
        data = copyArray;
        
    }
    
    @Override
    public void imprimir() {
        for (IElemento data1 : data) {
            Usuario contatos = (Usuario) data1;
            System.out.printf(contatos.nome + " ");
        } 
        System.out.printf("\n");
    }
}
