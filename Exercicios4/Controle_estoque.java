package Exercicios4;

import java.util.Scanner;

public class Controle_estoque {
    private static int estoque = 100;

    
    public static boolean verificarDisponibilidade(int quantidadeDesejada) {
        return quantidadeDesejada <= estoque;
    }

    
    public static void atualizarEstoque(int quantidadeComprada) {
        estoque -= quantidadeComprada;
    }

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        System.out.println("Quantidade inicial no estoque: " + estoque);

        do {
            System.out.print("Digite a quantidade desejada pelo cliente: ");
            int quantidadeDesejada = scanner.nextInt();

            if (verificarDisponibilidade(quantidadeDesejada)) {
                atualizarEstoque(quantidadeDesejada);
                System.out.println("Compra realizada com sucesso.");
                System.out.println("Estoque atualizado. Quantidade restante: " + estoque);
            } else {
                System.out.println("Produto esgotado.");
            }

            System.out.print("Deseja realizar outra compra? (S/N): ");
            continuar = scanner.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        System.out.println("Sistema de controle de estoque encerrado.");
        scanner.close();
    }
}

