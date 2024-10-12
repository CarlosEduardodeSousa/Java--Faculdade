package Exrepetição;

import java.util.Scanner;

public class Quantidade {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int cont;
        double media, soma;

        System.out.print("Digite a quantidade de valores que serão processados: ");
        int quant_valores = leia.nextInt();

        soma = 0;
        for (cont = 1; cont <=quant_valores; cont++){
            System.out.print("Digite o " + cont + ".valor: ");
            double valor = leia.nextDouble();
            soma = soma + valor;
        }

        media = soma / quant_valores;
        System.out.println("A média dos valores é: " + media);
        leia.close();
    }
}
