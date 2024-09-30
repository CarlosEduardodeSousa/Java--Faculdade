package Exoperadores;


import java.util.Scanner;
public class Triangulo_cerca {
    public static void main(String[] args) {
        double c;
        Scanner leia = new Scanner (System.in);

        System.out.print("Digite o comprimento do lado a: ");
        double a = leia.nextDouble();
        System.out.print("Digite o comprimento do lado b: ");
        double b = leia.nextDouble();
        c = Math.sqrt((a*a) + (b*b));
        System.out.println("----------------");
        System.out.println("Para completar a cerca tera que comprar: " + c + " metros de cerca");

        leia.close();

    }
}
