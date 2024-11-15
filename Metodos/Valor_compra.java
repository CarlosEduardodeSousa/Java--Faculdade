package Metodos;

import java.util.Scanner;

public class Valor_compra {

    public static double calcularValor(double valor_compra, int quant_parcelas){
       double juros = valor_compra * 5/100;
       double resultado = (valor_compra + juros) / quant_parcelas;
       return resultado;
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Informe o valor da compra: ");
        double valor_compra = leia.nextDouble();
        System.out.print("Informe a quantidade de parcelas: ");
        int quant_parcelas = leia.nextInt();
        double valor_parcelas = calcularValor(valor_compra, quant_parcelas);
        System.out.println("--------------------------------------");
        System.out.println("Valor de cada parcela: " + valor_parcelas);
        System.out.println("--------------------------------------");
        leia.close();
    }
}
