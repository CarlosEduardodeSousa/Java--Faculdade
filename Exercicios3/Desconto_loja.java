package Exercicios3;

import java.util.Scanner;
public class Desconto_loja {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        double valor_desconto, desconto;

        System.out.print("Digite o valor do produto: ");
        double produto = leia.nextDouble();
        desconto = produto * 10/100;
        valor_desconto = produto - desconto;
        System.out.println("Valor do produto com desconto: R$ " + valor_desconto);
        leia.close();
    }
}
