import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        float media;

        System.out.println("Digite a primeira nota: ");
        float n1 = leia.nextFloat();
        System.out.println("Digite sua segunda nota: ");
        float n2 = leia.nextFloat();
        media = (n1+n2)/2;
        System.err.println("Média: " + media);
        if (media>=6){
            System.out.println("Aprovado");
        }

        else if(media>=4 && media<6){
            System.out.println("Recuperação");
        }

        else{
            System.err.println("Reprovado");
        }

        leia.close();
    }
}
