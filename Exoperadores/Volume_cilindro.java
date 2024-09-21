package Exoperadores;

import java.util.Scanner;
public class Volume_cilindro {
    public static void main(String[] args) {
        double volume, area_da_base;
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite o valor da altura do cilindro: ");
        double h = leia.nextDouble();
        System.out.println("Digite o valor do raio do cilindro: ");
        double r = leia.nextDouble();
        area_da_base = Math.PI * (r*r);
        volume = area_da_base*h;
        System.out.println("----------------------");
        System.out.println("RESULTADO");
        System.out.println("----------------------");
        System.out.println("Volume do cilindro: " + volume);
        System.out.println("Área da base: " + Math.ceil(area_da_base));

        leia.close();
    }
}
