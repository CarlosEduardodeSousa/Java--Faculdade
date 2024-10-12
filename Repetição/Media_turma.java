package Repetição;

import java.util.Scanner;
public class Media_turma {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);

        int cont;
        double media_turma, soma_nota, maior_nota;

        cont = 0;
        media_turma = 0;
        soma_nota = 0;
        maior_nota = 0;
        while (cont<=10){
            cont = cont + 1;
            System.out.print("Nota do " + cont + ".aluno: ");
            double nota = leia.nextDouble();
            soma_nota = soma_nota + nota;
            media_turma = soma_nota / 10;
            if (nota > maior_nota){
                maior_nota = nota;
            }
        }
        System.out.println("A média da turma foi: " + media_turma);
        System.out.println("A maior nota obtida: " + maior_nota);
        leia.close();
    }
}
