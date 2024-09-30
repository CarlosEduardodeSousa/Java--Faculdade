package Exoperadores;

import java.util.Scanner;
public class Area_triangulo {
    public static void main(String[] args) {
        float area;

        Scanner leia = new Scanner (System.in);
        System.out.print("Informe a altura do triangulo: ");
        float altura = leia.nextFloat();
        System.out.print("Informe a base do triangulo: ");
        float base = leia.nextFloat();
        area = (base * altura) / 2;
        System.out.println("-----------------");
        System.out.println("Área do triangulo: " + area);

        leia.close();
    }
}
