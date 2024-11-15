package Metodos;

import java.util.Scanner;

public class Equação {

    public static double calcularDelta(int a, int b, int c){
        double resultado = (b*b) - 4 * a * c;
        return resultado;
    }

    public static double calcularX1(double delta, int a, int b){
        double resultado = (-(-b) + Math.sqrt(delta)) / (2*a);
        return resultado;
    }

    public static double calcularX2(double delta, int a, int b){
        double resultado = (-(-b) - Math.sqrt(delta)) / (2*a);
        return resultado;
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        int a = leia.nextInt();
        System.out.print("Digite o valor de b: ");
        int b = leia.nextInt();
        System.out.print("Digite o valor de c: ");
        int c = leia.nextInt();
        double delta = calcularDelta(a, b, c);
        double x1 = calcularX1(delta, a, b);
        double x2 = calcularX2(delta, a, b);
        System.out.println("---------------------------------");
        System.out.println("Delta: " + delta);
        System.out.println("Primeira Raiz: " + x1);
        System.out.println("Segunda Raiz: " + x2);
        System.out.println("---------------------------------");
        leia.close();
    }
}
