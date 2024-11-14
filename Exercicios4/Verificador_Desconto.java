package Exercicios4;

import java.util.Scanner;

public class Verificador_Desconto {
    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
     public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Digite o número do pedido: ");
            int numeroPedido = leia.nextInt();

            if (ehPrimo(numeroPedido)) {
                System.out.println("Pedido premiado! Você tem direito a um desconto.");
            } else {
                System.out.println("Pedido normal.");
            }

            System.out.print("Deseja verificar outro pedido? (S/N): ");
            continuar = leia.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        System.out.println("Obrigado por usar o sistema de verificação de desconto!");
        leia.close();
    }
}

