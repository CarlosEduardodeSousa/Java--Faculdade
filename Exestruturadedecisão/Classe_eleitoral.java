package Exestruturadedecisão;

import java.util.Scanner;
public class Classe_eleitoral {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        System.out.print("Digite sua idade: ");
        int idade = leia.nextInt();
        if (idade <=16){
            System.out.println("Não-eleitor");
        }
        else if (idade >= 18 && idade<=65){
            System.out.println("Eleitor-obrigatório");
        }
        else{
            System.out.println("Eleitor-facultativo");
        }
        leia.close();
    }
}
