package Exercicios3;

import java.util.Scanner;
public class Consumo_combustivel {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
         double consumo_medio;

         System.out.print("Digite a distância percorrida (em Km): ");
         double distancia = leia.nextDouble();
         System.out.print("Digite a quantidade de combustível consumido (em litros): ");
         double consumo_combustivel = leia.nextDouble();
         consumo_medio = distancia / consumo_combustivel;
         System.out.println("Consumo médio do veículo: " + consumo_medio + " Km/L");
         leia.close();
    }
}
