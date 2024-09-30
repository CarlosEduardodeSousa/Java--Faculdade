package Exestruturadedecisão;

import java.util.Scanner;
public class Treinamento_especial {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        System.out.print("Digite o valor da sua bolsa: ");
        double bolsa = leia.nextDouble();
        System.out.print("Digite o tempo de estagio: ");
        double tempo = leia.nextDouble();
        if (bolsa >=750.00 && bolsa <=950.00 && tempo <=2){
            System.out.println("Participará do treinamento");
        }

        else{
            System.out.println("Não participará");
        }

        leia.close();
    }
}
