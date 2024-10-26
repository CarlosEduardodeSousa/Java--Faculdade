package Exrepetição;

import java.util.Scanner;

public class Pesquisa_regiao {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int cont, totidade, totpessoas, tothomem, totmulher;
        double totsalario, media_idade, media_salario;

        System.out.print("Digite a quantidade de pessoas entrevistadas: ");
        int quant_pessoas = leia.nextInt();


        totidade = 0;
        totpessoas = 0;
        totsalario = 0;
        tothomem = 0;
        totmulher = 0;
        
        for (cont = 1; cont <= quant_pessoas; cont++){
            System.err.print("Digite o sexo da pessoa [M/F]: ");
            char sexo = leia.next().charAt(0);
            System.out.print("Digite a idade da pessoa: ");
            int idade = leia.nextInt();
            if (idade<0){
                System.out.println("dados da idade negativa não podem entrar nos cálculos.");
            }
            else{
                totidade = totidade + idade;
                totpessoas = totpessoas + 1;
            }
            System.out.print("Digite o seu salário: ");
            double salario = leia.nextDouble();

            if (sexo == 'M'){
                totsalario = totsalario + salario;
                tothomem = tothomem + 1;
            }

            if(sexo == 'F' && salario < 600.00){
                totmulher = totmulher + 1;
            }
        }
        media_idade = totidade / quant_pessoas;
        media_salario = totsalario / tothomem;
        System.out.println("------------------------------------------------------");
        System.out.println("A média da idade do grupo: " + media_idade);
        System.out.println("A média de salarios dos homens: " + media_salario);
        System.out.println("Quantidade de mulheres com o salário abaixo de R$600,00: " + totmulher);
        System.out.println("------------------------------------------------------");
    }
}
