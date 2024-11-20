package atividade346;
import javax.swing.JOptionPane;

public class MenuFrase {
    public static void main(String[] args) {
        int op;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                "\nMENU" +
                "\n1 - Comprimento da frase" +
                "\n2 - Dois primeiros e dois últimos caracteres" +
                "\n3 - Frase espelhada" +
                "\n4 - Terminar" +
                "\nEscolha a opção:"
            ));

            switch (op) {
                case 1:
                    String frase = JOptionPane.showInputDialog("Digite uma frase:");
                    JOptionPane.showMessageDialog(null, "Comprimento: " + frase.length());
                    break;
                case 2:
                    frase = JOptionPane.showInputDialog("Digite uma frase:");
                    JOptionPane.showMessageDialog(null, 
                        "Primeiros: " + (frase.length() >= 2 ? frase.substring(0, 2) : "") +
                        "\nÚltimos: " + (frase.length() >= 2 ? frase.substring(frase.length() - 2) : "")
                    );
                    break;
                case 3:
                    frase = JOptionPane.showInputDialog("Digite uma frase:");
                    String fraseInvertida = "";
                    for (int i = frase.length() - 1; i >= 0; i--) {
                        fraseInvertida += frase.charAt(i);
                    }
                    JOptionPane.showMessageDialog(null, fraseInvertida);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Fim do algoritmo.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        } while (op != 4);
    }
}
