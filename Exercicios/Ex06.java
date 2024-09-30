package Exercicios;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        int soma, subtracao, multiplicacao;
        
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int v1 = leia.nextInt();
        System.out.print("Digite o segundo valor: ");
        int v2 = leia.nextInt();
        soma = v1 + v2;
        subtracao = v1 - v2;
        multiplicacao = v1 * v2;
        System.out.println("-----------------------");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("-----------------------");

        leia.close();
    }
}
