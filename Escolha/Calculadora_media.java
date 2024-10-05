package Escolha;

import java.util.Scanner;
public class Calculadora_media {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double media, media_ponderada;

        System.out.print("Digite a primeira nota: ");
        double n1 = leia.nextDouble();
        System.out.print("Digite sua segunda nota: ");
        double n2 = leia.nextDouble();
        System.out.println("Digite o tipo de média: ");
        System.out.println(" [A] - Aritmética\n [P] - Ponderada");
       char tipo_media = leia.next().charAt(0);
        switch (tipo_media) {
           case 'A':
                media = (n1 + n2) / 2;
                System.out.println("A média artimética é: " + media);
                break;
            case 'P':
                media_ponderada = (n1*3 + n2*7) / (3+7);
                System.out.println("A média ponderada é: " + media_ponderada);
                break;
            default:
                System.out.println("Tipo de média inválido");
        }
        leia.close();
    }
}
