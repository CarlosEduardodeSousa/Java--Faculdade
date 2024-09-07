package Exercicios;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        double resultado, triplo;

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        double v1 = leia.nextDouble();
        System.out.println("Digite o outro valor maior que o primeiro: ");
        double v2 = leia.nextDouble();
        resultado = v1 / v2;
        triplo = resultado * 3;
        System.out.println("------------------------");
        System.out.println("Resultado: " + resultado);
        System.out.println("O seu triplo: " + triplo);
    }
}
