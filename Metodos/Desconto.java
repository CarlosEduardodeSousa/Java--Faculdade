package Metodos;

import java.util.Scanner;

public class Desconto {

    public static double calcularDesconto(double valor_produto){
        double resultado;
        resultado = valor_produto - (valor_produto*9/100);
        return resultado;
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);

        System.out.print("Informe o valor do produto: ");
        double valor_produto = leia.nextDouble();
        double valor_desconto = calcularDesconto(valor_produto);
        System.out.println("Valor com o desconto de 9%: " + valor_desconto);
        leia.close();
    }
}
