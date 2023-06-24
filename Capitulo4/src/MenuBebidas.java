/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ficdev
 */
import javax.swing.JOptionPane;

public class MenuBebidas {

    public static void main(String[] args) {
        int opcao;
        double preco = 0.0;
        String menu = """
                      Menu de bebidas:
                      1. Coca-Cola
                      2. Suco de Laranja
                      3. \u00c1gua Mineral
                      4. Ch\u00e1 Gelado
                      """;

        opcao = Integer.parseInt(JOptionPane.showInputDialog(menu
                + "Digite a opção desejada: "));

        switch (opcao) {
            case 1 -> preco = 5.50;
            case 2 -> preco = 4.00;
            case 3 -> preco = 2.50;
            case 4 -> preco = 3.50;
            default -> JOptionPane.showMessageDialog(null, "Opção inválida.");
        }

        if (preco != 0.0) {
            JOptionPane.showMessageDialog(null, String.format("O preço da bebida escolhida é R$ %.2f", preco));
        }
    }
}