package atividade398;
import javax.swing.JOptionPane;

public class FabricaQueijo {
    public static void main(String[] args) {
        int[] cod = new int[50]; 
        int[] quant = new int[50];
        float[] preco = new float[50]; 
        int k = 0;
        float geral = 0; 
        int codi, codigo, quantidade, i;

        while (true) {
            codi = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto ou 0 para acabar:"));
            if (codi == 0) {
                break; 
            }

            if (k < 50) {
                cod[k] = codi;
                quant[k] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto:"));
                preco[k] = Float.parseFloat(JOptionPane.showInputDialog("Digite o preço do produto:"));
                k++;
            } else {
                JOptionPane.showMessageDialog(null, "Central completa. Não é possível cadastrar mais produtos.");
                break; 
            }
        }

        while (true) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto a ser vendido ou 0 para terminar:"));
            if (codigo == 0) {
                break; 
            }

            int index = -1;
            for (i = 0; i < k; i++) {
                if (cod[i] == codigo) {
                    index = i;
                    break;
                }
            }

            if (index == -1) {
                JOptionPane.showMessageDialog(null, "Produto Não-Cadastrado");
            } else {
                quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade a ser vendida:"));
                if (quantidade <= quant[index]) {
                    quant[index] -= quantidade;
                    geral += quantidade * preco[index];
                    JOptionPane.showMessageDialog(null, "Venda realizada com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Estoque Insuficiente");
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Total vendido no dia: R$ " + geral);
        JOptionPane.showMessageDialog(null, "Produtos em estoque:");

        for (i = 0; i < k - 1; i++) {
            for (int j = i + 1; j < k; j++) {
                if (quant[i] < quant[j]) {
                    // Troca os produtos
                    int tempCod = cod[i];
                    int tempQuant = quant[i];
                    float tempPreco = preco[i];
                    cod[i] = cod[j];
                    quant[i] = quant[j];
                    preco[i] = preco[j];
                    cod[j] = tempCod;
                    quant[j] = tempQuant;
                    preco[j] = tempPreco;
                }
            }
        }
        for (i = 0; i < k; i++) {
            JOptionPane.showMessageDialog(null, "Código: " + cod[i] + " | Quantidade: " + quant[i] + " | Preço: R$ " + preco[i]);
        }
    }
}
