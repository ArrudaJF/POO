/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 11212640
 */
public class Adress {
    String rua, cidade;
    int num;

    
    @Override
    public String toString(){
        return this.rua + ", " + this.num + " - " + this.cidade;
    }
    
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Adress(String rua, String cidade, int num) {
        this.rua = rua;
        this.cidade = cidade;
        this.num = num;
    }

    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
}
