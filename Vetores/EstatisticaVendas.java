package Vetores;

import java.util.Scanner;

public class EstatisticaVendas {
    public static void main(String[] args) {
         Scanner leia = new Scanner(System.in);

        
            System.out.print("Digite o número de dias: ");
            int dias = leia.nextInt();

            
            int[] vendas = new int[dias];

            
            System.out.println("Digite a quantidade de vendas para cada dia:");
            for (int i = 0; i < dias; i++) {
                System.out.print("Dia " + (i + 1) + ": ");
                vendas[i] = leia.nextInt();
            }

            
            int menorVenda = vendas[0];
            int maiorVenda = vendas[0];
            int somaVendas = 0;

            for (int venda : vendas) {
                if (venda < menorVenda) {
                    menorVenda = venda;
                }
                if (venda > maiorVenda) {
                    maiorVenda = venda;
                }
                somaVendas += venda;
            }

       
            double mediaVendas = (double) somaVendas / dias;

       
            int diasAcimaMedia = 0;
            for (int venda : vendas) {
                if (venda > mediaVendas) {
                    diasAcimaMedia++;
                }
            }

        
            System.out.println("\nResultados:");
            System.out.println("Menor quantidade vendida: " + menorVenda);
            System.out.println("Maior quantidade vendida: " + maiorVenda);
            System.out.println("Média de vendas: " +  mediaVendas);
            System.out.println("Número de dias em que a média foi superada: " + diasAcimaMedia);

            leia.close();
    }
}
