package Exrepetição;

import java.util.Scanner;

public class Grupo_pessoas {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int cont, totfeminino, totmasculino;
        double altura_feminino, altura_masculino, media_alturaF, media_alturaM;

        System.out.println("Digite a quantidade de pessoas no grupo: ");
        int grupo_pessoas = leia.nextInt();
        altura_feminino = 0;
        altura_masculino =  0;
        totfeminino = 0;
        totmasculino = 0;
        for (cont = 1; cont<=grupo_pessoas; cont++){
            System.out.println("Digite o seu sexo [F/M]: ");
            char sexo = leia.next().charAt(0);
            System.out.println("Digite sua altura: ");
            double altura = leia.nextDouble();
            if (sexo == 'F' || sexo == 'f'){
                altura_feminino += altura;
                totfeminino = totfeminino + 1;
            }
            else{
                altura_masculino += altura;
                totmasculino = totmasculino + 1;
            }
        }
        media_alturaF = altura_feminino / totfeminino;
        media_alturaM = altura_masculino / totmasculino;
        System.out.println("Altura média dos homens: " + media_alturaM);
        System.out.println("Altura média das mulheres: " + media_alturaF);
    }
}
