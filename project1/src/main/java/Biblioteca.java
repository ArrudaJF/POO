/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 11212640
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Biblioteca {
    Usuario usuario;
    Midia midia;
    private Scanner input;
    String caminhoUsuario = "Cadastros.txt";
    String caminhoMidia = "Midias.txt";
    
    
    public Biblioteca(){
        Adress endereço = new Adress("Rua", "Cidade", 0);
        Data dataNasc = new Data(0, 0, 0);
        usuario = new Usuario("Nome", endereço, dataNasc, 0);
        midia = new Midia();
        input = new Scanner(System.in);
    }
    
    public void cadastroUsuario() throws IOException{
        FileWriter arq = new FileWriter(caminhoUsuario, true);
        PrintWriter gravarArq = new PrintWriter(arq);
        
        
        System.out.println("Insira seu nome: ");
        usuario.nome = input.nextLine();
        while (usuario.isNull(usuario.nome)){
            System.out.println("\nNome invalido, insira novamente: ");
            usuario.nome = input.nextLine();
        }
        

        System.out.println("\nInsira seu nUsp: ");
        int numb = input.nextInt();
        while (!usuario.ChecanUsp(numb)){
            System.out.println("\nnUsp invalido, insira novamente: ");
            numb = input.nextInt();
        }
        usuario.setnUsp(numb);

        System.out.println("\nInsira sua data de nascimento: ");
        do {
            int dia = input.nextInt();
            int mes = input.nextInt();
            int ano = input.nextInt();
            usuario.dataNasc.setDia(dia);
            usuario.dataNasc.setMes(mes);
            usuario.dataNasc.setAno(ano);


            if (!usuario.dataNasc.Check()){
                System.out.println("\nData invalida, insira novamente: ");
            } else {
                usuario.dataNasc.setDia(dia);
                usuario.dataNasc.setMes(mes);
                usuario.dataNasc.setAno(ano);
            }
        }
        while (!usuario.dataNasc.Check());

        
        System.out.println("\nInsira sua cidade: ");
        usuario.endereço.setCidade(input.nextLine());
        usuario.endereço.setCidade(input.nextLine());
       
        while (usuario.isNull(usuario.endereço.getCidade())){
            System.out.println("\nNome de cidade invalido, insira novamente: ");
            usuario.endereço.setCidade(input.nextLine());
        } 
       
        
        System.out.println("\nInsira seu logradouro: ");
        usuario.endereço.setRua(input.nextLine());
      
        while (usuario.isNull(usuario.endereço.getRua())){
            System.out.println("\nNome de logradouro invalido, insira novamente: ");
            usuario.endereço.setRua(input.nextLine());
        }
       
        System.out.println("\nInsira o numero de seu logradouro: ");
        usuario.endereço.setNum(input.nextInt());
        
        
        gravarArq.println(usuario.toString());
        String clear = input.nextLine();
        arq.close();
        
        
    }
    
    public void cadastroMídia() throws IOException{
        FileWriter arq2 = new FileWriter(caminhoMidia, true);
        PrintWriter gravarArq2 = new PrintWriter(arq2);
        
        System.out.println("Insira o titulo: ");
        midia.setTítulo(input.nextLine());
        while (midia.isNull(midia.getTítulo())){
            System.out.println("\nTitulo invalido, insira novamente: ");
            midia.setTítulo(input.nextLine());
        }
        
        System.out.println("Insira o nome do autor: ");
        midia.setAutor(input.nextLine());
        while (midia.isNull(midia.getAutor())){
            System.out.println("\nNome de autor invalido, insira novamente: ");
            midia.setAutor(input.nextLine());
        }
        
        System.out.println("Insira o ano de sua publicacao: ");
        midia.setAnoDePubli(input.nextInt());
        
        System.out.println("Insira o tipo da midia: ");
        midia.setTipoMidia(input.nextLine());
        midia.setTipoMidia(input.nextLine());
        while (midia.isNull(midia.getTipoMidia())){
            System.out.println("\nTitulo invalido, insira novamente: ");
            midia.setTipoMidia(input.nextLine());
        }
        
        System.out.println("Insira o nome da editora: ");
        midia.setEditora(input.nextLine());
        while (midia.isNull(midia.getEditora())){
            System.out.println("\nNome de editora invalida, insira novamente: ");
            midia.setEditora(input.nextLine());
        }
        
        
        System.out.println("Insira seu local na biblioteca: ");
        int andar = input.nextInt();
        String secao = input.next();
        
        while (secao.equals("")){
            System.out.println("\nSecao invalida, insira novamente: ");
            secao = input.nextLine();
        }
        
        midia.local.setAndar(andar);
        midia.local.setSecao(secao);
        
        gravarArq2.println(midia.toString());
        String clear = input.nextLine();
        arq2.close();
    }
    
    public static void main(String[] args) throws IOException {
        Biblioteca b = new Biblioteca();
        b.input = new Scanner(System.in);
        String a;
        do {
            System.out.println("Deseja fazer o cadastro de um Usuario ou de uma Midia? (Tecle 'sair' ao terminar)\n");
            
            a = b.input.nextLine();
            if (a.equalsIgnoreCase("Midia")){
                b.cadastroMídia();
            } else if (a.equalsIgnoreCase("Usuario")){
                b.cadastroUsuario();
            }
        }
        while(!a.equalsIgnoreCase("sair"));
        
    }
    
    
}
