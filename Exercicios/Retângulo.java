package Exercicios;

import java.util.Scanner;

public class Retângulo {
    public static void main(String[] args) {
        double perim, area;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor de um lado (em cm): ");
        double ladoA = leia.nextDouble();
        System.out.println("Digite o valor do outro lado (em cm): ");
        double ladoB = leia.nextDouble();
        perim = 2*ladoA + 2*ladoB;
        System.out.println("Perimetro: " + perim + "cm");
        area = ladoA * ladoB;
        System.out.println("Área do retângulo: " + area + "cm");

    }
}
