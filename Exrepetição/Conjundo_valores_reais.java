package Exrepetição;

import java.util.Scanner;
public class Conjundo_valores_reais {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        int cont, totaprovados;
        double soma_nota, media_turma;

        System.out.println("Digite a quantidade de alunos da sala: ");
        int quant_aluno = leia.nextInt();

        soma_nota = 0;
        totaprovados = 0;
        for(cont = 1; cont<=quant_aluno; cont++){
            System.out.println("Digite a nota do " + cont + " o.aluno: ");
            double nota = leia.nextDouble();
            soma_nota = soma_nota + nota;
            if (nota > 6){
                totaprovados = totaprovados + 1;
            }
        }
        media_turma = soma_nota /quant_aluno;
        System.out.println("---------------------------");
        System.out.println("Total de alunos aprovados: " + totaprovados);
        System.out.println("A média da turma foi: " + media_turma);
        System.out.println("---------------------------");
    }
}
