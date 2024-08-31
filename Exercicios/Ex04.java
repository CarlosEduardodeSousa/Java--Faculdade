package Exercicios;

import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        float conversor;

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor em dólares:");
        float dol = leia.nextFloat();
        conversor = dol * 5;
        System.out.println("O valor em Reais: " + conversor);

    }
}
