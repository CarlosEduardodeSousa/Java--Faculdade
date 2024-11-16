import java.util.Scanner;

public class Imposto_Renda {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        
        System.out.print("Digite a sua renda anual: R$ ");
        double rendaAnual = leia.nextDouble();

        double imposto = 0;

        
        if (rendaAnual <= 22847.76) {
            imposto = 0; 
        } else if (rendaAnual <= 33919.80) {
            imposto = (rendaAnual - 22847.76) * 0.075;
        } else if (rendaAnual <= 45012.60) {
            imposto = (33919.80 - 22847.76) * 0.075 +
                      (rendaAnual - 33919.80) * 0.15;
        } else if (rendaAnual <= 55976.16) {
            imposto = (33919.80 - 22847.76) * 0.075 +
                      (45012.60 - 33919.80) * 0.15 +
                      (rendaAnual - 45012.60) * 0.225;
        } else {
            imposto = (33919.80 - 22847.76) * 0.075 +
                      (45012.60 - 33919.80) * 0.15 +
                      (55976.16 - 45012.60) * 0.225 +
                      (rendaAnual - 55976.16) * 0.275;
        }

        
        System.out.println("O valor do imposto a ser pago é: R$ " + imposto);

        leia.close();
    }
}
