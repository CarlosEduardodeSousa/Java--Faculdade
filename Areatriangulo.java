import javax.swing.JOptionPane;

public class Areatriangulo {

    public static void main(String[] args) {
        double ladoA, ladoB, perimetro, area;
        ladoA = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de um lado em cm: "));
        ladoB = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor de outro lado em cm:"));

        perimetro = 2*ladoA + 2*ladoB;
        JOptionPane.showMessageDialog(null, "O perímetro do triângulo é: " + perimetro + "cm");

        area = ladoA + ladoB;
        JOptionPane.showMessageDialog(null, "A área do triângulo é: " + area + "cm");

    }
}