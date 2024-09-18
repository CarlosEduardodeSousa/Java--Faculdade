package Exercicios2;

import java.util.Scanner;

public class AnguloTrigonometrico {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um ângulo (em graus): ");
        double graus = leia.nextDouble();
        double radiano = Math.toRadians(graus);
        double cosseno = Math.cos(radiano);
        double seno = Math.sin(radiano);
        double tangente = Math.tan(radiano);

        System.out.println("--------------------------");
        System.out.println("Resultado");
        System.out.println("--------------------------");
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("--------------------------");
    }
}
