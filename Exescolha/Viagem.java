import java.util.Scanner;

public class Viagem {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        double valor_ida, valor_idavolta;


        System.out.println("Digite a viagem que deseja fazer: ");
        System.out.println(" [1] - Região Norte\n [2] - Região Nordeste\n [3] - Região Centro-Oeste\n [4] - Região Sul");
        int opc = leia.nextInt();
        System.out.println("A viagem inclui retorno? (S/N): ");
        char retorno = leia.next().charAt(0);

        switch (opc){
            case 1:
                if (retorno == 'S' || retorno == 's'){
                    valor_idavolta = 900.00;
                    System.out.println("Valor da viagem: " + valor_idavolta);
                }
                else {
                    valor_ida = 500.00;
                    System.out.println("Valor da viagem: " + valor_ida);
                }
                break;
            case 2:
                if (retorno == 'S' || retorno == 's'){
                    valor_idavolta = 650.00;
                    System.out.println("Valor da viagem: " + valor_idavolta);
                }
                else{
                    valor_ida = 350.00;
                    System.out.println("Valor da viagem: " + valor_ida);
                }
                break;
            case 3:
                if (retorno == 'S' || retorno == 's'){
                    valor_idavolta = 600.00;
                    System.out.println("Valor da viagem: " + valor_idavolta);
                }
                else{
                    valor_ida = 350.00;
                    System.out.println("Valor da viagem: " + valor_ida);
                }
                break;
            case 4:
                if (retorno == 'S' || retorno == 's'){
                    valor_idavolta = 5504.00;
                    System.out.println("Valor da viagem: " + valor_idavolta);
                }
                else{
                    valor_ida = 600.00;
                    System.out.println("Valor da viagem: " + valor_ida);
                }
                break;
        }
        leia.close();
    }
}
