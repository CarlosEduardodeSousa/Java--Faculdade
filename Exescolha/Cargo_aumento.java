import java.util.Scanner;

public class Cargo_aumento {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        double acrescimo, novo_salario;

        System.out.print("Informe o seu salário: ");
        double salario_atual = leia.nextDouble();
        System.err.println("Digite o seu cargo: ");
        System.out.println(" [1] - Escriturário\n [2] - Secretário\n [3] - Caixa\n [4] - Gerente\n [5] - Diretor ");
        int opc = leia.nextInt();

        switch (opc){
            case 1:
                acrescimo = salario_atual * 50/100;
                novo_salario = salario_atual + acrescimo;
                System.out.println("Valor do aumento: " + acrescimo);
                System.out.println("Novo Salário: " + novo_salario);
                break;
            case 2:
                acrescimo = salario_atual * 35/100;
                novo_salario = salario_atual + acrescimo;
                System.out.println("Valor do aumento: " + acrescimo);
                System.out.println("Novo Salário: " + novo_salario);
                break;
            case 3:
                acrescimo = salario_atual * 20/100;
                novo_salario = salario_atual + acrescimo;
                System.out.println("Valor do aumento: " + acrescimo);
                System.out.println("Novo Salário: " + novo_salario);
                break;
            case 4:
                acrescimo = salario_atual * 10/100;
                novo_salario = salario_atual + acrescimo;
                System.out.println("Valor do aumento: " + acrescimo);
                System.out.println("Novo Salário: " + novo_salario);
                break;
            case 5:
                System.out.println("Não possui aumento!");
                break;
        }
            leia.close();
    }
}
