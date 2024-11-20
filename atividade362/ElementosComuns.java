package atividade362;
import javax.swing.JOptionPane;

public class ElementosComuns {
    public static void main(String[] args) {
        int[] vet1 = new int[10];
        int[] vet2 = new int[20];  
        int[] vetc = new int[10];  
        int L = 0;  

        for (int i = 0; i < 10; i++) {
            vet1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º elemento do vetor 1:"));
        }
        for (int i = 0; i < 20; i++) {
            vet2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º elemento do vetor 2:"));
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (vet1[i] == vet2[j]) {
                    boolean existe = false;
                    for (int k = 0; k < L; k++) {
                        if (vetc[k] == vet1[i]) {
                            existe = true;
                            break;
                        }
                    }
                    if (!existe) {
                        vetc[L] = vet1[i];
                        L++;
                    }
                    break;
                }
            }
        }
        if (L > 0) {
            String resultado = "Elementos comuns:\n";
            for (int i = 0; i < L; i++) {
                resultado += vetc[i] + "\n";
            }
            JOptionPane.showMessageDialog(null, resultado);
        } else {
            JOptionPane.showMessageDialog(null, "Não existem elementos comuns.");
        }
    }
}
