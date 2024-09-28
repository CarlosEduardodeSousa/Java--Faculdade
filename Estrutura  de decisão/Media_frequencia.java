import java.util.Scanner;

public class Media_frequencia {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite sua média: ");
        double media = leia.nextDouble();
        System.out.println("Digite o percentual de frequência: ");
        int freq = leia.nextInt();
        if (freq < 75){
            System.out.println("Reprovado por falta");
        }

        else if(media < 6){
            System.out.println("Reprovado por nota");
        }

        else{
            System.out.println("Aprovado");
        }

        leia.close();
    }
}
