package Exercicios;

import java.util.Scanner;

public class Média {
    public static void main(String[] args) {
        float media;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o primeiro número:");
        float n1 = leia.nextFloat();
        System.out.print("Digite o segundo número:");
        float n2 = leia.nextFloat();
        media = (n1+n2)/2;
        System.out.println("Á média dos números é:" + media);

        leia.close();
    }
}
