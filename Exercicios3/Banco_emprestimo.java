package Exercicios3;

import java.util.Scanner;
public class Banco_emprestimo {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        System.out.print("Digite o seu salário: ");
        double salario = leia.nextDouble();
        System.out.print("Digite o número de pendências: ");
        double pendencias = leia.nextDouble();
        if (salario > 2500 && pendencias <=2){
            System.out.println("Empréstimo aprovado!");
        }

        else{
            System.out.println("Empréstimo não aprovado!");
        }

        leia.close();
    }
}
