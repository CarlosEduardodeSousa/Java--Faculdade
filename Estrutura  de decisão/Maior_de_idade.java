import java.util.Scanner;

public class Maior_de_idade {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);

        System.out.println("Digite sua idade: ");
        int idade = leia.nextInt();
        if (idade >= 18){
            System.err.println("Maior de Idade");
        }

        else{
            System.err.println("Menor de Idade");
        }
        leia.close();
    }
}
