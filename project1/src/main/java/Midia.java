/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 11212640
 */

public class Midia {
    
    String título, autor, tipoMidia, editora;
    int anoDePubli;
    Local local;
    boolean disponivel;
    
    public class Local {
        int andar;
        String secao;

        public void setAndar(int andar) {
            this.andar = andar;
        }
        public void setSecao(String secao) {
            this.secao = secao;
        } 
        
        @Override
        public String toString(){
            return this.andar + " - " + this.secao;
        }
    } 

    public Midia() {
        local = new Local();
        disponivel = true;
    }
    
    public boolean isNull(String nome) {
     return nome.equalsIgnoreCase("");
    }
    
    @Override
    public String toString(){
        String d = this.local.toString();
        return this.título + " | " + this.autor + " | " + this.anoDePubli + " | " + this.tipoMidia + " | " + this.editora + " | " + d;
    }
    
    public String getTítulo() {
        return título;
    }
    public void setTítulo(String título) {
        this.título = título;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipoMidia() {
        return tipoMidia;
    }
    public void setTipoMidia(String tipoMidia) {
        this.tipoMidia = tipoMidia;
    }

    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoDePubli() {
        return anoDePubli;
    }
    public void setAnoDePubli(int anoDePubli) {
        this.anoDePubli = anoDePubli;
    }

    
    
}
