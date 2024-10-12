package Repetição;

import java.util.Scanner;

public class Somatorio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int cont;
        double soma;

        soma = 0;
        for (cont = 0 ; cont<=10; cont ++){
            System.out.print("Digite um número: ");
            double num = leia.nextFloat();
            soma = soma + num;
        }
        
        System.out.println("A somatória é: " + soma);
        leia.close();
    }
}
