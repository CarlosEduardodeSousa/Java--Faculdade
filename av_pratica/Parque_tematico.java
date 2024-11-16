import java.util.Scanner;

public class Parque_tematico {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        double valor_ingresso, valor_total;

        System.out.println("Informe o dia da semana");
        System.out.println(" [1] - Segunda\n [2] - Terça\n [3] - Quarta\n [5] - Quinta\n [6] - Sexta\n [7] - Sábado\n [8] - Domingo");
        int opc = leia.nextInt();
        System.out.print("Digite a quantidade de ingressos: ");
        int ingressos = leia.nextInt();

        switch (opc){
            case 1:
            case 5:
                System.out.println("O parque não abre no dia selecionado!");
                break;
            case 2:
            case 3:
            case 6:
                valor_ingresso = 30.00;
                valor_total = ingressos * valor_ingresso;
                System.out.println("Total a pagar: " + valor_total);
                break;
            case 7:
            case 8:
                valor_ingresso = 50.00;
                valor_total = ingressos * valor_ingresso;
                System.out.println("Total a pagar: " + valor_total);
                break;
        }
        leia.close();
    }
}
