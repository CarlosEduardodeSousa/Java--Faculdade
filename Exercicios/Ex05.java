package Exercicios;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        int conversor;

        Scanner leia = new Scanner(System.in);
        System.out.print("Valor de horas: ");
        int horas = leia.nextInt();
        System.out.print("Valor de minutos ");
        int minutos = leia.nextInt();
        conversor = horas*60;
        conversor = conversor + minutos;
        System.out.println("--------------------------------");
        System.out.println("valores lidos: " + horas + " e " + minutos);
        System.out.println("Impressão: " + conversor + " minutos");
        System.out.println("--------------------------------");

        leia.close();
    }
}
