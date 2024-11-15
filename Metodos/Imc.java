package Metodos;

import java.util.Scanner;

public class Imc {

    public static double calcularIMC(double peso, double altura){
        double resultado = peso / (altura*altura);
        return resultado;
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe seu peso (em Kg): ");
        double peso = leia.nextInt();
        System.out.print("Informe sua altura (em m): ");
        double altura = leia.nextDouble();
        double imc = calcularIMC(peso, altura);
        System.out.println("IMC: " + imc);
        leia.close();
    }
}
