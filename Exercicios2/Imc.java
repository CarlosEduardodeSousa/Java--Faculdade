package Exercicios2;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        float imc;

        Scanner leia = new Scanner (System.in);
        System.out.println("Digite o peso da pessoa (em Kg): ");
        float peso = leia.nextFloat();
        System.out.println("Digite a altura da pessoa (em m): ");
        float altura = leia.nextFloat();
        imc = peso / (altura*altura);
        System.out.println("-------------------------------");
        System.out.println("O IMC da pessoa é: " + imc + "Kg/m");
        System.out.println("-------------------------------");
        leia.close();

    }
}
