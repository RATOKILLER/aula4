package atividade348;
import javax.swing.JOptionPane;

public class Media {
    public static void main(String[] args) {
        String[] nomes = new String[5];
        float[] pr1 = new float[5];
        float[] pr2 = new float[5];
        float[] media = new float[5];

        for (int l = 0; l < 5; l++) {
            nomes[l] = JOptionPane.showInputDialog("Digite o nome do aluno " + (l + 1) + ":");
            pr1[l] = Float.parseFloat(JOptionPane.showInputDialog("Digite a 1ª nota de " + nomes[l] + ":"));
            pr2[l] = Float.parseFloat(JOptionPane.showInputDialog("Digite a 2ª nota de " + nomes[l] + ":"));
            media[l] = (pr1[l] + pr2[l]) / 2;
        }

        JOptionPane.showMessageDialog(null, "RELAÇÃO FINAL");
        for (int l = 0; l < 5; l++) {
            JOptionPane.showMessageDialog(null,"nome: " + nomes[l] + "\n nota1: " + pr1[l] + "\n nota2: " + pr2[l] + "\n media: " + media[l]);
        }
    }
}
