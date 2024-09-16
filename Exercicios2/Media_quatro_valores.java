package Exercicios2;

import java.util.Scanner;

public class Media_quatro_valores {
    public static void main(String[] args) {
        double media;

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o primeior valor: ");
        double n1 = leia.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double n2 = leia.nextDouble();
        System.out.println("Digite o terceiro valor: ");
        double n3 = leia.nextDouble();
        System.out.println("Digite o quarto valor: ");
        double n4 = leia.nextDouble();
        media = (n1+n2+n3+n4)/4;
        System.out.println("----------------------------------");
        System.out.println("A média dos valores é: " + media);
        System.out.println("----------------------------------");
    }
}
