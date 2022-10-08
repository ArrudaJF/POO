/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 11212640
 */
public class Data {
    int dia, mes, ano;


    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    @Override
    public String toString(){
        return this.dia + "/" + this.mes + "/" + this.ano; 
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public boolean Check(){
        if (this.dia <= 0 || this.dia >= 32) { 
            return false;
        } else if (this.mes <= 0 || this.mes >= 13){
            return false;
        } else if (this.ano < 1905 || this.ano >= 2007){
            return false;
            // seria improvável alguém nascer antes de 1905
            // ou ser mais novo do que 16 anos, o que tornam as datas inválidas
        } else if (((this.mes%2 != 0 && this.mes > 8) || (this.mes%2 == 0 && this.mes < 7)) && this.dia == 31){
            return false; //dia 31 é invalido para certos meses
        } else if (this.mes == 2 && this.dia >= 29){
            if (this.ano%4 != 0 || this.dia == 30){
            return false; 
            } else {
                return true; //pois somente existem dias 29/02 em anos bissextos
            }
        } else {
            return true;
        }
    }
}
