package atividade394;
import javax.swing.JOptionPane;

public class EscolaViva {
    public static void main(String[] args) {
        String[] nomes = new String[50];
        float[] nota1 = new float[50];
        float[] nota2 = new float[50];
        float[] media = new float[50];
        int totalAlunos = 0;
        String op;

        while (true) {
            op = JOptionPane.showInputDialog(
                    "MENU\n" +
                            "1 - Entrar nomes\n" +
                            "2 - Entrar 1ª nota\n" +
                            "3 - Entrar 2ª nota\n" +
                            "4 - Calcular média\n" +
                            "5 - Listar no display\n" +
                            "6 - Sair\n" +
                            "Escolha uma opção:");

            if (op.equals("1")) {
                for (int i = totalAlunos; i < 50; i++) {
                    nomes[i] = JOptionPane.showInputDialog("Digite o nome do " + (i + 1) + "º aluno:");
                    totalAlunos++;
                    if (totalAlunos == 50) break;
                }
            } else if (op.equals("2")) {
                for (int i = 0; i < totalAlunos; i++) {
                    nota1[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite a 1ª nota de " + nomes[i] + ":"));
                }
            } else if (op.equals("3")) {
                for (int i = 0; i < totalAlunos; i++) {
                    nota2[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite a 2ª nota de " + nomes[i] + ":"));
                }
            } else if (op.equals("4")) {
                for (int i = 0; i < totalAlunos; i++) {
                    media[i] = (nota1[i] * 3 + nota2[i] * 7) / 10;
                }
                JOptionPane.showMessageDialog(null, "Médias calculadas!");
            } else if (op.equals("5")) {
                StringBuilder sb = new StringBuilder();
                sb.append("Nome\t\tNota 1\tNota 2\tMédia\n");
                for (int i = 0; i < totalAlunos; i++) {
                    sb.append(nomes[i]).append("\t")
                            .append(nota1[i]).append("\t")
                            .append(nota2[i]).append("\t")
                            .append(media[i]).append("\n");
                }
                JOptionPane.showMessageDialog(null, sb.toString());
            } else if (op.equals("6")) {
                JOptionPane.showMessageDialog(null, "Saindo...");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }
}
