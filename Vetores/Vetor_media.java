package Vetores;

import java.util.Scanner;

public class Vetor_media {
    public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);
            double soma_total, media;
            int acima_media;
    
            System.out.print("Informe quantos números você quer digitar: ");
            int total_num = leia.nextInt();
    
            double num [] = new double[total_num];
    
            soma_total = 0;
            media = 0;
            acima_media = 0;
            for(int c = 0; c< num.length; c++){
                System.out.print("Digite o " + (c + 1) + " número: ");
                num[c] = leia.nextDouble();
                soma_total = soma_total + num[c];
                media = soma_total / total_num;
                if(num[c] > media){
                    acima_media = acima_media + 1;
                }
            }
    
            System.out.println("----------------------------------------------");
            System.out.println("Soma dos valores: " + soma_total);
            System.out.println("Média dos valores: " + media);
            System.out.println("Total de números acima da média: " + acima_media);
            System.out.println("----------------------------------------------");
            leia.close();
    }
}
