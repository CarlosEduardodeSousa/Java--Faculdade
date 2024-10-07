import java.util.Scanner;

public class Rodizio {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);

        System.out.print("Informe os 4 digitos da placa do seu automavel: ");
        int placa = leia.nextInt();
        int digito = placa % 10;
        System.out.println("Digito da sua placa: " + digito);
        switch (digito){
            case 1:
            case 2:
                System.out.println("Rodízio na segunda-feira!");
                break;
            case 3:
            case 4:
                System.out.println("Rodízio na terça-feira!");
                break;
            case 5:
            case 6:
                System.out.println("Rodízio na Quarta-feira!");
                break;
            case 7:
            case 8:
                System.out.println("Rodízio na Quinta-feira!");
                break;
            case 9:
            case 0:
                System.out.println("Rodízio na Sexta-feira!");
                break;
        }
        leia.close();
    }
}
