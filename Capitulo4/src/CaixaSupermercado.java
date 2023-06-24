/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ficdev
 */

import java.util.Scanner;

public class CaixaSupermercado {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double totalCompra = 0.0;
            boolean continuar = true;
            
            System.out.println("Bem-vindo ao caixa do supermercado!");
            
            while (continuar) {
                System.out.print("Digite o valor do produto (ou 0 para finalizar a compra): ");
                double valorProduto = scanner.nextDouble();
                
                if (valorProduto == 0) {
                    continuar = false;
                } else if (valorProduto < 0) {
                    System.out.println("Valor inválido. O valor do produto deve ser maior que zero.");
                } else {
                    totalCompra += valorProduto;
                    System.out.println("Produto adicionado. Total da compra: R$" + totalCompra);
                }
            }
            
            System.out.println("Finalizando compra...");
            System.out.println("Total da compra: R$" + totalCompra);
            
            System.out.print("Digite o valor recebido pelo cliente: ");
            double valorRecebido = scanner.nextDouble();
            
            double troco = valorRecebido - totalCompra;
            
            if (troco >= 0) {
                System.out.println("Troco: R$" + troco);
            } else {
                System.out.println("Valor insuficiente. O cliente deve pagar mais R$" + (-troco));
            }
            
            System.out.println("Obrigado por utilizar o caixa do supermercado!");
        }
    }
}