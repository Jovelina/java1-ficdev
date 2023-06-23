/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escola.Professor;

/**
 *
 * @author ficdev
 */
public class Professor {

    private String nome;
    private String disciplina;

    // Construtor
    public Professor(String nome, String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    // Método para exibir os dados do professor
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Disciplina: " + disciplina);
    }
}
