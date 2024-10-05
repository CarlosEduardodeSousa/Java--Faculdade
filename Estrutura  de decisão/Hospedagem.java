import java.util.Scanner;

public class Hospedagem {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        double valor_diaria, valor_total;

        System.out.println("Digite o código da diaria: ");
        System.out.println("S - Simples");
        System.out.println("D - Duplo");
        System.out.println("T - Triplo");
        String codigo = leia.next();
        System.out.print("Digite a quantidade de diárias: ");
        int diarias = leia.nextInt();

        if (codigo.equals("S")){
            valor_diaria = 255.50;
            valor_total = valor_diaria * diarias;
            System.out.println("Valor total a pagar: " + valor_total);
        }
        else if (codigo.equals("D")){
            valor_diaria = 305.50;
            valor_total = valor_diaria * diarias;
            System.out.println("Valor total a pagar: " + valor_total);
        }

        else if (codigo.equals("T")){
            valor_diaria = 360.50;
            valor_total = valor_diaria * diarias;
            System.out.println("valor total a pagar: " + valor_total);
        }

        else{
            System.out.println("Tipo de diária inválido");
        }

        leia.close();
    }
}
