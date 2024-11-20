package atividade354;
import javax.swing.JOptionPane;

public class ParImpar {
    public static void main(String[] args) {
        int[] num = new int[15];
        String relacao = "RELAÇÃO DOS NÚMEROS:\n";

        for (int l = 0; l < 15; l++) {
            num[l] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (l + 1) + "º número:"));
        }

        for (int l = 0; l < 15; l++) {
            relacao += (l + 1) + " - " + num[l];
            if (num[l] % 2 == 0) {
                relacao += " é PAR\n";
            } else {
                relacao += " é ÍMPAR\n";
            }
        }
        JOptionPane.showMessageDialog(null, relacao);
    }
}

