package atividade370;
import javax.swing.JOptionPane;

public class ReservaPassagem {
    public static void main(String[] args) {
        int nv, i;  
        int[] voos = new int[1000];  
        String[] nome = new String[1000];  
        String nvd, id; 

        nv = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de voos:"));
        for (i = 0; i < nv; i++) {
            nome[i] = JOptionPane.showInputDialog("Digite o nome do " + (i + 1) + "º voo:");
            voos[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de lugares disponíveis no " + nome[i] + ":"));
        }

        while (true) {
            nvd = JOptionPane.showInputDialog("Digite o número do voo desejado ou '@' para terminar:");
            if (nvd.equals("@")) {
                break; 
            }

            int vooIndex = -1;
            for (i = 0; i < nv; i++) {
                if (nome[i].equalsIgnoreCase(nvd)) { 
                    vooIndex = i;
                    break;
                }
            }

            if (vooIndex != -1) {  
                if (voos[vooIndex] > 0) {
                    voos[vooIndex]--; 
                    id = JOptionPane.showInputDialog("Digite o número da identidade do cliente:");
                    JOptionPane.showMessageDialog(null, "Identidade: " + id + "\nVoo: " + nome[vooIndex]);
                } else {
                    JOptionPane.showMessageDialog(null, "Não existem mais lugares neste voo.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Não existe este voo.");
            }
        }
        JOptionPane.showMessageDialog(null, "Fim do processo.");
    }
}
