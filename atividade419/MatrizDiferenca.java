package atividade419;
import javax.swing.JOptionPane;

public class MatrizDiferenca {
    public static void main(String[] args) {
        int[][] A = new int[5][5];
        int[][] B = new int[5][5];
        int[][] DIF = new int[5][5];

        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 5; c++) {
                A[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento de A[" + (l + 1) + "][" + (c + 1) + "]:"));
            }
        }
        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 5; c++) {
                B[l][c] = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento de B[" + (l + 1) + "][" + (c + 1) + "]:"));
                DIF[l][c] = A[l][c] - B[l][c]; 
            }
        }
        StringBuilder msg = new StringBuilder("MATRIZ DIFERENÇA:\n");
        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 5; c++) {
                msg.append(DIF[l][c]).append("\t");
            }
            msg.append("\n");
        }
        JOptionPane.showMessageDialog(null, msg.toString());
    }
}

