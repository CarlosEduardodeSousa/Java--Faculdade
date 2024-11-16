package Vetores;

import java.util.Scanner;

public class Vetor_Inteiro {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int maior, soma_vetor;
        double resultado;

        int num [] = new int [10];

        maior = num [0];
        soma_vetor = 0;
        resultado = 0;
        for(int c = 0; c< num.length; c++){
            System.out.print("Digite a " + (c + 1) + " número: ");
            num[c] = leia.nextInt();
            soma_vetor = soma_vetor + num[c];
            if (num[c] > maior){
                maior = num[c];
            }
        }
        resultado = soma_vetor / maior;
        
        System.out.println("----------------------------");
        System.out.println("Á soma de todos os vetores é: " + soma_vetor);
        System.out.println("Maior valor digitado: " + maior);
        System.out.println("Á divisão pelo maior valor foi: " + resultado);
        System.out.println("----------------------------");
        leia.close();
    }
}
