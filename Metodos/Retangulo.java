package Metodos;

import java.util.Scanner;

public class Retangulo {

    public static double calcularArea(double comprimento, double largura){
        double s = comprimento * largura;
        return s;
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o comprimento: ");
        double comprimento = leia.nextDouble();
        System.out.print("Informe a largura: ");
        double largura = leia.nextDouble();
        double area = calcularArea(comprimento, largura);
        System.out.println("--------------------------");
        System.out.println("Área do retangulo: " + area);
        System.out.println("--------------------------");
        leia.close();
    }
}
