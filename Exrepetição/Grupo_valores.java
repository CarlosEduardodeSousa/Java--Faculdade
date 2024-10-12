package Exrepetição;

import java.util.Scanner;
public class Grupo_valores {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int cont;
        double soma, media, maior_valor;

        System.out.print("Digite quantos valores estão no grupo: ");
        int grupo_valores = leia.nextInt();

        soma = 0;
        maior_valor = 0;
        media = 0;
        for (cont = 1; cont <=grupo_valores; cont++){
            System.out.print("Digite o " + cont + ".valor do grupo: ");
            double valor = leia.nextDouble();
            soma = soma + valor;
            media = soma / grupo_valores;
            if (valor > maior_valor){
                maior_valor = valor;
            }
        }
        System.out.println("Média dos valores: " + media);
        System.out.println("Maior valor do grupo: " + maior_valor);
    }
}
