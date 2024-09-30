package Exercicios;
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        int soma;

        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = leia.nextInt();
        System.err.print("Digite o segundo número: ");
        int n2 = leia.nextInt();
        soma = n1 + n2;
        System.out.println("Á soma de " + n1 + "+" + n2 + " é " + soma);

        leia.close();
    }
}
