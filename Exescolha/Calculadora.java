import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double soma, subtracao, multiplicacao, divisao;

        System.out.print("Digite o primeiro número: ");
        double n1 = leia.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = leia.nextDouble();
        System.out.println("Qual operação você deseja fazer: ");
        System.out.println(" [1] - Soma (+)\n [2] - Subtração(-)\n [3] - Multiplicação(X)\n [4] - Divisão(/)");
        int opc = leia.nextInt();
        switch (opc){
            case 1:
                soma = n1 + n2;
                System.out.println("A soma dos números é: " + soma);
                break;
            case 2:
                subtracao = n1 - n2;
                System.out.println("A subtração dos números é: " + subtracao);
                break;
            case 3:
                multiplicacao = n1 * n2;
                System.out.println("A multiplicação dos números é: " + multiplicacao);
                break;
            case 4:
                divisao = n1 / n2;
                System.out.println("A divisão dos números é: " + divisao);
                break;
        }
        leia.close();
    }
}
