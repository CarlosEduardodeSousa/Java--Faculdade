package Exercicios4;

import java.util.Scanner;

public class Conversao_temperatura {
    public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);
            double celsius, fahrenheit;
            int resp;

            do{
                System.out.println("Opções:");
                System.out.println(" [1]- Celsius para Fahrenheit\n [2]- Fahrenheit para Celsius\n [3]- sair");
                resp = leia.nextInt();
                switch (resp){
                    case 1:
                        System.out.println("-----------------------------------------");
                        System.out.print("Digite a temperatura em Celsius: ");
                        celsius = leia.nextDouble();
                        fahrenheit = (celsius * 1.8) + 32;
                        System.err.println("A temperatura em Fahrenheit: " + fahrenheit);
                        System.out.println("-----------------------------------------");
                        break;
                    case 2:
                        System.out.println("-----------------------------------------");
                        System.out.print("Digite a temperatura em Fahrenheit: ");
                        fahrenheit = leia.nextDouble();
                        celsius = (fahrenheit - 32) * 5/9;
                        System.err.println("A temperatura em Celsius: " + celsius);
                        System.out.println("-----------------------------------------");
                        break;
                    case 3:
                        System.out.println("Saindo do programa.....");
                        break;
                }
            }while (resp != 3);
    }
}
