package atividade358;
import javax.swing.JOptionPane;

public class MercadoriasLucro {
    public static void main(String[] args) {
        float[] precoCompra = new float[100];
        float[] precoVenda = new float[100];
        int totLucroMenor10 = 0, totLucroMenor20 = 0, totLucroMaior20 = 0;
        float lucro, percentualLucro;

        for (int A = 0; A < 100; A++) {
            precoCompra[A] = Float.parseFloat(JOptionPane.showInputDialog("Preço de compra da mercadoria " + (A + 1) + ":"));
            precoVenda[A] = Float.parseFloat(JOptionPane.showInputDialog("Preço de venda da mercadoria " + (A + 1) + ":"));
        }

        for (int A = 0; A < 100; A++) {
            lucro = precoVenda[A] - precoCompra[A];
            percentualLucro = (lucro / precoCompra[A]) * 100;

            if (percentualLucro < 10) {
                totLucroMenor10++;
            } else if (percentualLucro >= 10 && percentualLucro <= 20) {
                totLucroMenor20++;
            } else {
                totLucroMaior20++;
            }
        }
        JOptionPane.showMessageDialog(null, "\nTotal de mercadorias com lucro < 10%: " + totLucroMenor10 + "\nTotal de mercadorias com 10% <= lucro <= 20%: " + totLucroMenor20 + "\nTotal de mercadorias com lucro > 20%: " + totLucroMaior20
        );
    }
}
