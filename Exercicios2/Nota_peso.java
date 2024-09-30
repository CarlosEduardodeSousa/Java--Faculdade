package Exercicios2;

import java.util.Scanner;

public class Nota_peso {
    public static void main(String[] args) {
        double media_ponderada, media;

        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double n1 = leia.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = leia.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double n3 = leia.nextDouble();
        media = (n1*1) + (n2*2) + (n3*4);
        media_ponderada = media / (1+2+4);
        System.out.println("-----------------------------------------");
        System.out.println("A media ponderada é: " + media_ponderada);
        System.out.println("-----------------------------------------");

        leia.close();
    }
}
