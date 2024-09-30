import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        double imc;

        System.out.print("Digite seu peso (em Kg): ");
        double peso = leia.nextDouble();
        System.err.print("Digite sua altura (em metros): ");
        double altura = leia.nextDouble();
        imc = peso / (altura*altura);
        System.out.println("IMC: " + imc);
        if (imc <20){
            System.out.println("Muito abaixo do peso");
        }

        else{
            if(imc >=20 && imc <25){
                System.out.println("Peso normal");
            }
            else{
                if (imc >=25 && imc <30){
                    System.out.println("Sobre Peso");
                }
                else {
                    if (imc >= 30 && imc <40){
                        System.out.println("Obeso");
                    }
                    else {
                        System.out.println("Obeso Mórbido");
                    }
                }
            }
        }
        leia.close();
    }
}
