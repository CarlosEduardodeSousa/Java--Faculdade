package Exercicios3;

import java.util.Scanner;
public class Fast_food {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        String lanche;
        double valor_lanche;
        System.out.println("MENU");
        System.out.println(" [1]- Hambúrguer (R$ 10)\n [2]- Cachorro-quente (R$ 7)\n [3]- Batata Frita (R$ 5)");
        System.out.print("Escolha seu lanche: ");
        int opc = leia.nextInt();
        switch (opc){
            case 1:
                lanche = "Hambúrguer";
                valor_lanche = 10.00;
                System.out.println("Você escolheu: " + lanche);
                System.out.println("Valor a pagar: R$" + valor_lanche);
                break;
            case 2:
                 lanche = "Cachorro-quente";
                 valor_lanche = 7.00;
                 System.out.println("Você escolheu: " + lanche);
                 System.out.println("Valor a pagar: R$" + valor_lanche);
                 break;
            case 3:
                lanche = "Batata-Frita";
                valor_lanche = 5.00;
                System.out.println("Cocê escolheu: " + lanche);
                System.out.println("Valor a pagar: R$" + valor_lanche);
        }
            leia.close();
    }
}
