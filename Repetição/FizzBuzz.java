package Repetição;

import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);

        int cont;
        System.out.print("Digite um número inteiro: ");
        int num = leia.nextInt();

        cont = 0;
        while (cont <= num){
            cont = cont + 1;
            if (cont % 3 == 0 && cont % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if (cont % 3 == 0){
                System.out.println("Fizz");
            }
            else if (cont % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(cont);
            }
        }
        leia.close();
    }
    
}