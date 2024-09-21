package Exoperadores;

import java.util.Scanner;

public class Comabem {
    public static void main(String[] args) {
        float total, total_conta;

        Scanner leia = new Scanner (System.in);
        System.out.println("Digite o valor da conta: ");
        float valor = leia.nextFloat();
        total = valor * 10/100;
        total_conta = valor + total;
        System.out.println("-----------------");
        System.out.println("O total da conta incluindo os 10% do garçom será: " + total_conta);

        leia.close();
       
    }
}
