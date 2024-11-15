package Metodos;

import java.util.Scanner;

public class Cofre_Moedas {
     public static double valorCofre(int vinteCinco, int dez, int cinco) {
        
        int totalCentavos = (vinteCinco * 25) + (dez * 10) + (cinco * 5);

       
        return totalCentavos / 100.0;
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("== Cofre de Moedas ==");

       
        System.out.print("Digite a quantidade de moedas de 25 centavos: ");
        int vinteCinco = leia.nextInt();

        System.out.print("Digite a quantidade de moedas de 10 centavos: ");
        int dez = leia.nextInt();

        System.out.print("Digite a quantidade de moedas de 5 centavos: ");
        int cinco = leia.nextInt();

        
        double valorTotal = valorCofre(vinteCinco, dez, cinco);

        
        System.out.println("O valor total no cofre é R$: " + valorTotal);

        leia.close();
    }
}

