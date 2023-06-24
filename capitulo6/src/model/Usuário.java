/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ficdev
 */
public class Usuário {
    private int id;
    
    private String nome;
    private String email;
    private int telefone;
    private inte qtdLivrosEmprestados;
    private List<Livro> livroEmprestdos = new arrayList<>();
    
    public Usuario(String nome, String email, int telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.qtdLivrosEmprestados = 0;
    }
    
    // getters e setters vocês já sabem fazer :)
    
    public int getQtdLivrosEmprestados() {
        return qtdLivrosEmprestados;
    }
        
     public boolean  getPossuiVaga() {
         return qtdLivrosEmprestados < 3;
         
     }
     public List<Livro> getLivroEmprestados() {
         return livrosEmprestados;
     }
     
     public void adicionarLivro(Livro Livro) {
         livrosEmprestados.add(livro);
         qtdLivrosEmprestados++;         
     }
     
     public void remo0verLivro(livro livro) {
         livroEmprestados.remove(livro);
         qtdLivrosEmprestados--;
     }
     
     }
    
}
