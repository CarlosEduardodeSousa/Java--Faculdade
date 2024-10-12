package Exrepetição;

import java.util.Scanner;
public class Soma_Serie {
    public static void main(String[] args) {
       Scanner leia = new Scanner(System.in);

       System.out.print("Digite um valor inteiro positivo: ");
       int num = leia.nextInt();

       if (num <= 0) {
           System.out.println("Insira um valor inteiro positivo.");
       } else {
           double soma = 0.0;

           for (int i = 1; i <= num; i++) {
               soma += 1.0 / i;
           }

           System.out.println("A soma da série é: " + soma);
       }

       leia.close();
    }
}
