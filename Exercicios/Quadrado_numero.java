package Exercicios;

import java.util.Scanner;

public class Quadrado_numero {
    public static void main(String[] args) {
        int q;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um número inteiro:");
        int n = leia.nextInt();
        q = n*n;
        System.out.println("O resultado do número: " + n + " ao quadrado é: " + q);

        leia.close();
    }
}
