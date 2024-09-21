package Exoperadores;

import java.util.Scanner;
public class Operações_Resultado {
    public static void main(String[] args) {
        int soma, subtracao, multiplicacao, divisao, rest_divisao;

        Scanner leia = new Scanner (System.in);
        System.out.println("Digite um número inteiro: ");
        int n1 = leia.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int n2 = leia.nextInt();
        soma = n1 + n2;
        subtracao = n1 - n2;
        multiplicacao = n1 * n2;
        divisao = n1 / n2;
        rest_divisao = n1 % n2;
        System.out.println("---------------------");
        System.out.println("Resultado");
        System.out.println("---------------------");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto da divisão: " + rest_divisao);

        leia.close();
    }
}
