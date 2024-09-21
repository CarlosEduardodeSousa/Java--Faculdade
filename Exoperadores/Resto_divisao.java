package Exoperadores;

import java.util.Scanner;
public class Resto_divisao {
    public static void main(String[] args) {
        int resultado;

        Scanner leia = new Scanner (System.in);
        System.out.println("Digite um número inteiro: ");
        int n1 = leia.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int n2 = leia.nextInt();
        resultado = n1 % n2;
        System.out.println("------------------------------");
        System.out.println("Resto da divisão: " + resultado);

        leia.close();
    }
}
