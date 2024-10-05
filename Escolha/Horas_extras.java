package Escolha;

import java.util.Scanner;
public class Horas_extras {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        double valor_hora_extra, valor_total, acrescimo;

        valor_hora_extra = 30.00;
        System.out.print("Digite a quantidade de horas extras trabalhadas: ");
        double hora_extra = leia.nextFloat();
        System.out.println("Digite o dia trabalhado: ");
        System.err.println(" [1] - Domingo\n [2] - Segunda\n [3] - Terça\n [4] - Quarta\n [5] - Quinta\n [6] - Sexta\n [7] - Sábado");
        int dia = leia.nextInt();
        switch (dia){
            case 1:
                acrescimo = valor_hora_extra * 50/100;
                valor_hora_extra = valor_hora_extra + acrescimo;
                valor_total = valor_hora_extra * hora_extra;
                System.out.println("Valor a receber: " + valor_total);
                break;
            case 2:
                valor_total = valor_hora_extra * hora_extra;
                System.out.println("valor a receber: " + valor_total);
                break;
            case 3:
                valor_total = valor_hora_extra * hora_extra;
                System.out.println("valor a receber: " + valor_total);
                break;
            case 4:
                valor_total = valor_hora_extra * hora_extra;
                System.out.println("valor a receber: " + valor_total);
                break;    
            case 5:
                valor_total = valor_hora_extra * hora_extra;
                System.out.println("valor a receber: " + valor_total);
                break;
            case 6:
                valor_total = valor_hora_extra * hora_extra;
                System.out.println("valor a receber: " + valor_total);
                break;  
            case 7:
                acrescimo = valor_hora_extra * 50/100;
                valor_hora_extra = valor_hora_extra + acrescimo;
                valor_total = valor_hora_extra * hora_extra;
                System.out.println("Valor a receber: " + valor_total);
                break;  
        }
        leia.close();
    }
}
