package Exestruturadedecisão;

import java.util.Scanner;
public class Equação {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        double delta, x1 , x2;

        System.out.println("Digite o valor de a: ");
        int a = leia.nextInt();
        System.out.println("Digite o valor de b: ");
        int b = leia.nextInt();
        System.out.println("Digite o valor de c: ");
        int c = leia.nextInt();
        delta = (b*b) - 4 * a * c;
        if (delta >0){
            System.out.println("Delta: " + delta);
            x1 = (-(-b) + Math.sqrt(delta)) / (2*a);
            x2 = (-(-b) - Math.sqrt(delta)) / (2*a);
            System.out.println("Primeira Raiz: " + x1);
            System.out.println("Segunda Raiz: " + x2);
        }

        else{
            System.out.println("As raízes não seram calculadas");
        }
        leia.close();
    }
}
