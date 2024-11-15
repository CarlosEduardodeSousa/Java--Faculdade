package Metodos;

import java.util.Scanner;

public class Conversor_dolar {

    public static double calcularDolar(double reais, double valor_dolar){
        double resultado = reais * valor_dolar;
        return resultado;
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o valor em reais R$: ");
        double reais = leia.nextDouble();
        System.out.print("Infrome o valor do dolar: ");
        double valor_dolar = leia.nextDouble();
        double valor_em_dolar = calcularDolar(reais, valor_dolar);
        System.out.println("A conversão em dolar é: " + valor_em_dolar + "dolares");
        leia.close();

    }
}
