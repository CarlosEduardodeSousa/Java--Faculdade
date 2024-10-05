package Escolha;

import java.util.Scanner;
public class Parcelas {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        int juros;
        double valor_final, valor_parcelado;

        System.out.print("Digite o valor da compra: ");
        double valor_compra = leia.nextDouble();
        System.out.print("Digite a quantidade de parcelas: ");
        int qtde_Parcelas = leia.nextInt();
        switch (qtde_Parcelas){
            case 2:
                juros = 3;
                valor_final = valor_compra + valor_compra * juros/100;
                valor_parcelado = valor_final / qtde_Parcelas;
                System.out.println("Valor de cada parcela é: " + valor_parcelado);
                break;
            case 4:
                juros = 7;
                valor_final = valor_compra + valor_compra * juros/100;
                valor_parcelado = valor_final / qtde_Parcelas;
                System.out.println("Valor de cada parcela é: " + valor_parcelado); 
                break;
            case 6:
                juros = 9;
                valor_final = valor_compra + valor_compra * juros/100;
                valor_parcelado = valor_final / qtde_Parcelas;
                System.out.println("Valor de cada parcela é: " + valor_parcelado);
                break;
            case 8:
                juros = 12;
                valor_final = valor_compra + valor_compra * juros/100;
                valor_parcelado = valor_final / qtde_Parcelas;
                System.out.println("Valor de cada parcela é: " + valor_parcelado);
                break;
            default:
            juros = -1;
                System.out.println("Número de Parcelas Incorreto");

        }

        leia.close();
    }
}
