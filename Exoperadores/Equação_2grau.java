package Exoperadores;

import java.util.Scanner;
public class Equação_2grau {
    public static void main(String[] args) {
      double delta, x1, x2;

        Scanner leia = new Scanner (System.in);
        System.out.println("Informe o coeficiente a: ");
        double a = leia.nextDouble();
        System.out.println("Informe o coeficiente b: ");
        double b = leia.nextDouble();
        System.out.println("Informe o coeficiente c: ");
        double c = leia.nextDouble();
        delta = (b*b) - 4 * a* c;

        x1 = (-(-b) + Math.sqrt(delta)) / (2*a);
        x2 = (-(-b) - Math.sqrt(delta)) / (2*a);

        System.out.println("--------------------------------");
        System.out.println("Resultado");
        System.out.println("--------------------------------");
        System.out.println("Valor de delta: " + delta);
        System.out.println("Valor da primeira raiz (x1): " + x1);
        System.out.println("Valor da segunda raiz (X2): " + x2);

        leia.close();

    }
}
