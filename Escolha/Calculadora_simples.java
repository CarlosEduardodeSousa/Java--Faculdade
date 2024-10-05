package Escolha;

import java.util.Scanner;
public class Calculadora_simples {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);

        System.out.println("Digite uma opção: ");
        System.out.println(" [1] - Soma \n [2] - Subtração \n [3] - multiplicação \n [4] - Divisão\n [5] - Sair");
        int opc = leia.nextInt();
        switch (opc){
            case 1:
                System.out.println("Você escolheu soma!");
                break;
            case 2:
                System.out.println("Você escolheu subtração!");
                break;
            case 3:
                System.out.println("Você escolheu multiplicação!");
                break;
            case 4:
                System.out.println("Você escolheu divisão!");
                break;
            case 5:
                System.out.println("Obrigado por utilizar o programa!");
                break;
        }

        leia.close();
    }
}
