package Exestruturadedecisão;

import java.util.Scanner;
public class Número_usuario {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);

        System.out.print("Digite um número inteiro: ");
        int num = leia.nextInt();
        if (num >= 0 && num <=9){
            System.out.println("Valor correto");
        }
        else{
            System.out.println("Valor incorreto");
        }
        leia.close();
    }
}
