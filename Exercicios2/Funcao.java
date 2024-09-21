package Exercicios2;

import java.util.Scanner;

public class Funcao {
    public static void main(String[] args) {
        float y;

        Scanner leia = new Scanner (System.in);
        System.out.println("Entre com o valor de x: ");
        float x = leia.nextFloat();
        y = 3 + (2*x);
        System.out.println("y= " + y);

        leia.close();
    }
}
