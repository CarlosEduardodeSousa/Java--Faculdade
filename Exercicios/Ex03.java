package Exercicios;

import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        double area_total, area_superior, area_inferior;

        Scanner leia = new Scanner(System.in);
        System.out.print("Altura do retângulo superior: ");
        double a1 = leia.nextDouble();
        System.out.print("Base do retângulo superior; ");
        double b1 = leia.nextDouble();
        System.out.print("Altura do retângulo inferior: ");
        double a2 = leia.nextDouble();
        System.out.print("Base do retângulo inferior: ");
        double b2 = leia.nextDouble();
        area_total = (a1*b1) + (a2*b2);
        area_superior = a1*b1;
        area_inferior = a2*b2;
        System.out.println("-------------------------------------------------");
        System.out.println("Área total dos dois retângulo: " + area_total);
        System.out.println("Área do retângulo superior: " + area_superior); 
        System.out.println("Área do retângulo inferior: " + area_inferior);
        System.err.println("--------------------------------------------------");
        
        leia.close();
    }
}
