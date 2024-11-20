package atividade351;
import javax.swing.JOptionPane;

public class ProcuraNome {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        int num;

        for (int l = 0; l < 5; l++) {
            nomes[l] = JOptionPane.showInputDialog("Digite o nome " + (l + 1) + ":");
        }
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da pessoa (1 a 5):"));
            if (num < 1 || num > 5) {
                JOptionPane.showMessageDialog(null, "Número fora do intervalo. Digite novamente.");
            }
        } while (num < 1 || num > 5);
        JOptionPane.showMessageDialog(null, "O nome correspondente é: " + nomes[num - 1]);
    }
}
