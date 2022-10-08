/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 11212640
 */


public class Usuario {
    String nome;
    Adress endereço;
    Data dataNasc;
    int nUsp;

    public Usuario(String nome, Adress endereço, Data dataNasc, int nUsp) {
        this.nome = nome;
        this.endereço = endereço;
        this.dataNasc = dataNasc;
        this.nUsp = nUsp;
    }
    
    
    public boolean isNull(String nome) {
     return nome.equalsIgnoreCase("");
    }
    
    @Override
    public String toString(){
        String date = this.dataNasc.toString();
        return this.nome + " | " + this.nUsp + " | " + this.dataNasc + " | " + this.endereço;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getnUsp() {
        return nUsp;
    }
    public void setnUsp(int nUsp) {
        this.nUsp = nUsp;
    }
    
    protected boolean ChecanUsp(int nUsp){
        String number = String.valueOf(nUsp);
        char[] digits1 = number.toCharArray();
        if (digits1.length == 7){
            return true;
        } else {
            return false;
        }
    }
}
