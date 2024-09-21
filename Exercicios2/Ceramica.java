package Exercicios2;

import java.util.Scanner;
public class Ceramica {
    public static void main(String[] args) {
        float area_total, custo_total;
        int n_caixa;

        Scanner leia = new Scanner (System.in);
        System.out.println("Digite a largura da área (em metros): ");
        float largura = leia.nextFloat();
        System.out.println("Digite o comprimento da área (em metros): ");
        float comprimento = leia.nextFloat();
        System.out.println("Digite o valor unitario da caixa de piso (em reais): ");
        int v_caixa = leia.nextInt();
        area_total = largura*comprimento;
        Double area_caixa = 2.5;
        n_caixa = (int) Math.ceil(area_total/area_caixa);
        custo_total = n_caixa * v_caixa;
        System.out.println("-----------------------------------------------");
        System.out.println("Quantidade de caixas necessárias: " + n_caixa);
        System.out.println("Custo total: " + custo_total);
        System.out.println("-----------------------------------------------");

        leia.close();
    }
}
