package Exercicios3;

import java.util.Scanner;

public class Banco_emprestimo2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        double juros, valor_total, valor_parcela;
        System.out.print("Digite o seu salário: ");
        double salario = leia.nextDouble();
        System.out.print("Digite o número de pendências: ");
        double pendencias = leia.nextDouble();
        if (salario > 2500 && pendencias <=2){
            System.out.println("Empréstimo aprovado!");
            System.out.println("----------------------------------");
            System.out.print("Digite o valor do empréstimo: ");
            double valor_emprestimo = leia.nextDouble();
            System.out.print("Digite o número de parcelas: ");
            int parcelas = leia.nextInt();
            juros = valor_emprestimo * 0.9 * parcelas/100;
            valor_total = valor_emprestimo + juros;
            valor_parcela = valor_total / parcelas;
            System.out.println("------------------------------------");
            System.out.println("Valor de cada parcela: R$" + valor_parcela);
            System.err.println("Valor total do financiamento: R$" + valor_total);
            System.out.println("------------------------------------");
        }

        else{
            System.out.println("Empréstimo não aprovado!");
        }

        leia.close();
    }
}
