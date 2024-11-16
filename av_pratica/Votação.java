import java.util.Scanner;

public class Votação {
    public static void main(String[] args) {
        Scanner leia  = new Scanner (System.in);

        System.out.print("Digite o número de alunos que vão votar: ");
        int numero_alunos = leia.nextInt();

        int votosA = 0;
        int votosB = 0;
        int votosC = 0;

        for (int c = 1; c <= numero_alunos; c++){
            System.out.print("Aluno " + c + " vote no candidato (A,B OU C): ");
            char voto = leia.next().toUpperCase().charAt(0);

            switch (voto){
                case 'A':
                    votosA = votosA + 1;
                    break;
                case 'B':
                    votosB = votosB + 1;
                    break;
                case 'C':
                    votosC = votosC + 1;
                    break;
                default:
                    System.out.println("Voto invalido! Tente novamente.");
            }
        }

        System.out.println("Candidato A: " + votosA + " votos");
        System.out.println("Candidato B: " + votosB + " votos");
        System.out.println("Candidato C: " + votosC + " votos");

        if (votosA > votosB && votosA > votosC) {
            System.out.println("O vencedor é o Candidato A!");
        } else if (votosB > votosA && votosB > votosC) {
            System.out.println("O vencedor é o Candidato B!");
        } else if (votosC > votosA && votosC > votosB) {
            System.out.println("O vencedor é o Candidato C!");
        } else {
            System.out.println("Houve um empate!");
        }

        leia.close();
    }
}
