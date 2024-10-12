package Repetição;

import java.util.Scanner;
public class Supermercado {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        double total_compra, preco;

        preco = 1;
        total_compra = 0;
        System.out.print("Digite o CPF do cliente: ");
        String cpf = leia.next();

        while (preco != 0){
            System.out.println("Digite o preco do produto (0 para sair): ");
            preco = leia.nextDouble();
            total_compra = total_compra + preco;
        }

        System.out.println("Cliente: " + cpf);
        System.out.println("Total a pagar: " + total_compra);
        leia.close();
    }
}
