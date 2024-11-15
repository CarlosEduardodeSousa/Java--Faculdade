package Metodos;

import java.util.Scanner;

public class Pregos {

    public static double calcularArrecadacao(int quant_telheiro, int quant_quadrado){
        double resultado = (quant_telheiro * 1.05) + (quant_quadrado * 0.51);
        return resultado;
    }

    public static double calcularComissao(double total_vendas){
        double resultado = total_vendas * 0.10;
        return resultado;
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantidade de pregos telheiro vendidos: ");
        int quant_telheiro = leia.nextInt();
        System.out.print("Quantidade de pregos quadrado vendidos: ");
        int quant_quadrado = leia.nextInt();
        double total_vendas = calcularArrecadacao(quant_telheiro, quant_quadrado);
        double comissao = calcularComissao(total_vendas);
        System.out.println("---------------------------------");
        System.out.println("Valor arrecadado: " + total_vendas);
        System.out.println("Valor comissão: " + comissao);
        leia.close();
    }
}
