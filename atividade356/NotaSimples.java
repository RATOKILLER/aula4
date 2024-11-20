package atividade356;
import javax.swing.JOptionPane;

public class NotaSimples {
    public static void main(String[] args) {
        String relacao = "RELAÇÃO FINAL DOS ALUNOS:\n";
        
        for (int l = 0; l < 15; l++) {
            String nome = JOptionPane.showInputDialog("Digite o " + (l + 1) + "º nome:");
            while (nome.length() > 30) {
                nome = JOptionPane.showInputDialog("Nome com mais de 30 caracteres. Digite novamente:");
            }
            float pr1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 1ª nota de " + nome + ":"));
            float pr2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a 2ª nota de " + nome + ":"));
            float media = (pr1 + pr2) / 2;
            
            String situacao = media >= 5 ? "AP" : "RP";
            nome = String.format("%-30s", nome);
            relacao += (l + 1) + " - " + nome + pr1 + "\t" + pr2 + "\t" + media + "\t" + situacao + "\n";
        }
        JOptionPane.showMessageDialog(null, relacao);
    }
}
