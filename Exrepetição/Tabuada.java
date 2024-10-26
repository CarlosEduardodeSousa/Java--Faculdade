package Exrepetição;

public class Tabuada {
    public static void main(String[] args) {
        for (int num = 1; num <= 10; num++) { 
            System.out.println("Tabuada do " + num + ":");
            for (int i = 0; i <= 10; i++) { 
                int resultado = num * i;
                System.out.println(num + " x " + i + " = " + resultado);
            }
            System.out.println(); 
        }
    }
}
