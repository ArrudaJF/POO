/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project2;

/**
 *
 * @author 11212640
 */
public class ListaEncadeada extends Lista {
    No topo;
    
    
    @Override
    public void imprimir(){
        No iterador = this.topo;
        Usuario user = (Usuario) iterador.elemento;
        for (int i = 1; i < this.tamanho(); i++){
            System.out.printf(user.nome + " ");
            if (iterador.next == null){
                break;
            }
            iterador = iterador.next;
            user = (Usuario) iterador.elemento;
        }
        System.out.printf("\n");
    }
    
    @Override
    public int tamanho(){
        No pilha = this.topo;
        while(pilha != null){
            tamanho++;
            pilha = pilha.next;
        }
        return tamanho;
    }
    
    @Override
    public void inserir(IElemento elem){
        if (this.topo == null){
            this.topo = new No();
            this.topo.setElemento(elem);
            return;
        }
        
        No buscador = this.topo;
        while(buscador.next != null){
            buscador = buscador.next;
        }
        buscador.next = new No();
        buscador.next.setElemento(elem);
    }
     
    @Override
    public void remover(IElemento elem){
        int size = this.tamanho();
        No search = this.topo;
        if (search.elemento.equals(elem)){
               this.topo = search.next;
        } else {
           for (int i =1; i != size; i++){
                No buscador = search;
                search = search.next;
                if (search.elemento.equals(elem)){
                    buscador.next = search.next;
                    break;
                }
            }
        }
     }
}
