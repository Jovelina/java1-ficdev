/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escola.Main;

/**
 *
 * @author ficdev
 */
import Escola.Aluno.Aluno;
import Escola.Professor.Professor;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Maria", 16);
        aluno.exibirDados();

        System.out.println();

        Professor professor = new Professor("João", "Matemática");
        professor.exibirDados();
    }
}
