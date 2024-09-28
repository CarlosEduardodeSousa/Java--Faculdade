
import java.util.Scanner;
public class Par {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);

        System.out.println("Digite um número inteiro: ");
        int num = leia.nextInt();
        if (num % 2==0){
            System.out.println("O número: " + num + " é par!");
        }
        leia.close();
    }   
}
