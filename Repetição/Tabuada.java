package Repetição;

import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        int cont, tab;

        System.out.print("Informe qual tabuada você deseja ver?: ");
        int num = leia.nextInt();
        leia.close();

        for (cont=0; cont<=10; cont++){
            tab = num * cont;
            System.out.println(num + "X" + cont + " = " + tab); 
        }
    }
}
