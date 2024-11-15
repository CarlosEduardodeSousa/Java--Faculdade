package Metodos;

import java.util.Scanner;

public class Quilometragem {

    public static void calcularDados(double km_inicial, double km_final, double litros, double preco_litro){

        double distancia_percorrida = km_final - km_inicial;
        double comsumo_medio = distancia_percorrida / litros;
        double valor_gasto = litros * preco_litro;

        System.out.println("----------------------------------");
        System.out.println("Distância percorrida: " + distancia_percorrida);
        System.out.println("Consumo médio: " + comsumo_medio);
        System.out.println("Valor gasto R$: " + valor_gasto);
        System.out.println("----------------------------------");
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Valor da quilometragem inicial: ");
        double km_inicial = leia.nextDouble();
        System.out.print("Valor da quilometragem final: ");
        double km_final = leia.nextDouble();
        System.out.print("Quantidade de litros gasto: ");
        double litros = leia.nextDouble();
        System.out.print("Informe o preço do litro: ");
        double preco_litro = leia.nextDouble();
        calcularDados(km_inicial, km_final, litros, preco_litro);
        leia.close();
    }
    
}
