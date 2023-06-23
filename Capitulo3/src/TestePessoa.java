/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ficdev
 */
public class TestePessoa {

    public static void main(String[] args) {
        
// instanciação da classe Pessoa
        Pessoa p1 = new Pessoa();
        
// atribuição de valores aos atributos
        p1.setNome("Luna");
        p1.setIdade(25);
        
// exibição dos valores atribuídos
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
    }

}
