package Exestruturadedecisão;

import java.util.Scanner;
public class Turno_salario {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double valor_hora, valor_salario; 

        System.out.print("Digite seu turno de trabalho (N para noturno e assim por diante): ");
        char turno = leia.next().charAt(0);
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        float horas = leia.nextFloat();
        if (turno == 'N' || turno == 'n'){
            valor_hora = 45.00;
            valor_salario = valor_hora * horas;
            System.out.println("Salário: " + valor_salario);
        }

        else{
            valor_hora = 37.50;
            valor_salario = valor_hora * horas;
            System.out.println("Salário: " + valor_salario);
        }

        leia.close();
    }
}
