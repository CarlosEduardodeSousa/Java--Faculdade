package Exercicios;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = leia.nextInt();
        System.out.print("Digite sua profissão: ");
        String profissao = leia.next();
        System.out.println("Profissão: " + profissao);
        System.out.println("Idade: " + idade);

        leia.close();
    }
}
