import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = leia.next();
        System.out.println("Digite a quantidade de dependentes: ");
        int quantdep = leia.nextInt();
        System.out.println("Digite o seu cargo: ");
        String cargo = leia.next();
        System.err.println("------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade de dependentes: " + quantdep);
        System.out.println("Cargo: " + cargo);
        System.err.println("--------------------------");

    }
}
