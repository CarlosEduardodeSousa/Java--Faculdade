package Exrepetição;

import java.util.Scanner;

public class Grupo_valores_reais {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int cont, totpositivo, totnegativo;
        double menor_valor;

        System.out.print("Digite quantos valores estão no grupo: ");
        int grupo_valores = leia.nextInt();

        totpositivo = 0;
        totnegativo = 0;
        menor_valor = 0;
        for (cont= 1; cont <= grupo_valores; cont++){
            System.out.print("Digite o " + cont + " valor real: ");
            double valor_real = leia.nextDouble();
            if (valor_real > 0){
                totpositivo += 1;
            }
            else{
                totnegativo += 1;
            }

           if (valor_real < menor_valor){
                menor_valor = valor_real;
           }
        }
        System.out.println("-------------------------------------------");
        System.out.println("Valores positivos digitados: " + totpositivo);
        System.out.println("Valores negativos digitados: " + totnegativo);
        System.out.println("Menor valor digitado: " + menor_valor);
        System.out.println("-------------------------------------------");
    }
}
