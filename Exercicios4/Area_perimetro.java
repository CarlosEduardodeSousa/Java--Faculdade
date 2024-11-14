package Exercicios4;

import java.util.Scanner;



public class Area_perimetro {

    public static double calcularArea ( double largura, double comprimento){
        return largura * comprimento;
    }

    public static double calcularPerimetro (double largura, double comprimento){
        return 2 * (largura+comprimento);
    }


    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        char continuar;

        do{
            System.out.print("Informe a largura do terreno (em m): ");
            double largura = leia.nextDouble();
            System.out.print("Informe o comprimento do terreno (em m): ");
            double comprimento = leia.nextDouble();
            double area = calcularArea(largura, comprimento);
            double perimetro = calcularPerimetro (largura, comprimento);
            System.out.println("------------------------------------");
            System.out.println("Área do terreno: " + area);
            System.out.println("Perímetro do terreno: " + perimetro);
            System.out.println("------------------------------------");
            System.out.print("Deseja calcular outro terreno? [S/N]: ");
            continuar = leia.next().charAt(0);
        }while(continuar == 'S' || continuar == 's');
        leia.close();
    }
}
