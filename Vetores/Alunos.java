package Vetores;

import java.util.Scanner;

public class Alunos {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int n = leia.nextInt();

       
        String[] nomes = new String[n];
        double[] notas = new double[n];
        String[] cursos = new String[n];

        
        System.out.println("Digite os dados dos alunos:");
        for (int i = 0; i < n; i++) {
            leia.nextLine(); 
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = leia.nextLine();
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = leia.nextDouble();
            leia.nextLine(); 
            System.out.print("Curso do aluno " + (i + 1) + " (ccp/tads): ");
            cursos[i] = leia.nextLine();
        }

      
        int quantidadeTADS = 0;
        for (String curso : cursos) {
            if (curso.equalsIgnoreCase("tads")) {
                quantidadeTADS++;
            }
        }

       
        double somaNotas = 0;
        for (double nota : notas) {
            somaNotas += nota;
        }
        double mediaNotas = somaNotas / n;

       
        int acimaMedia = 0;
        for (double nota : notas) {
            if (nota > mediaNotas) {
                acimaMedia++;
            }
        }

       
        System.out.println("-------------------------------------------------------------");
        System.out.println("Quantidade de alunos no curso de TADS: " + quantidadeTADS);
        System.out.printf("Média das notas dos alunos: %.2f\n", mediaNotas);
        System.out.println("Quantidade de alunos com nota acima da média: " + acimaMedia);
        System.out.println("-------------------------------------------------------------");
        leia.close();
    }
}
