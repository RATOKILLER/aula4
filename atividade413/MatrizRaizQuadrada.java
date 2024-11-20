package atividade413;
import javax.swing.JOptionPane;

public class MatrizRaizQuadrada {
    public static void main(String[] args) {
        int[][] n = new int[5][5];
        int soma = 0;

        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 5; c++) {
                n[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento [" + (l + 1) + "][" + (c + 1) + "]:"));
            }
        }

        String msg = "\nToda a matriz:\n";
        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 5; c++) {
                msg += n[l][c] + "\t";
            }
            msg += "\n";
        }
        JOptionPane.showMessageDialog(null, msg);

        for (int l = 1; l < 5; l++) {
            for (int c = 5 - l; c < 5; c++) {
                if (n[l][c] % 2 != 0) {
                    soma += n[l][c] * n[l][c];
                }
            }
        }

        double raiz = Math.sqrt(soma);
        JOptionPane.showMessageDialog(null, "Raiz quadrada da soma dos quadrados dos números ímpares: " + raiz);
    }
}

