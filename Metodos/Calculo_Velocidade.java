package Metodos;

import java.util.Scanner;

public class Calculo_Velocidade {
    public static double calcularVelocidade(double distancia, double tempo) {
        return distancia / tempo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Cálculo de Velocidade de Três Objetos");

        
        for (int i = 1; i <= 3; i++) {
            System.out.println("---------------");
            System.out.println("Objeto:" + i);

            
            System.out.print("Digite a distância percorrida (em km ou m): ");
            double distancia = scanner.nextDouble();

           
            System.out.print("Digite o tempo gasto (em horas ou segundos): ");
            double tempo = scanner.nextDouble();

            
            double velocidade = calcularVelocidade(distancia, tempo);

            
            System.out.println("A velocidade do objeto " + i + " é: " + velocidade);
            
        }

        scanner.close();
    }
}

