/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meuPrograma;

import Geometria.Retangulo;

/**
 *
 * @author ficdev
 */
public class Main {

    // Método principal do programa
    public static void main(String[] args) {

// Criando um objeto da classe Retangulo com base 5 e altura 10
        Retangulo retangulo = new Retangulo(5, 10);
       
// Calculando a área e o perímetro do retângulo
    double area = retangulo.calcularArea();
    double perimetro = retangulo.calcularPerimetro();

// Imprimindo os resultados na tela
    System.out.println ("Area do retangulo: " + area);
    System.out.println ("Perímetro do retângulo: " + perimetro);
}
}
