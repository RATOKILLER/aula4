package atividade400;
import javax.swing.JOptionPane;

public class HotelFazenda {
    public static void main(String[] args) {
        int[] leitos = new int[50];
        float[] precos = new float[50];
        String[] situacao = new String[50];
        String[] nome = new String[50];
        String[] telefone = new String[50];
        String[] dataEntrada = new String[50];
        String[] dataSaida = new String[50];
        int[] numDiarias = new int[50];
        float[] despesas = new float[50];
        boolean cadastroFeito = false;

        while (true) {
            String opStr = JOptionPane.showInputDialog(null,
                "Hotel Fazenda Sucesso\n\n" +
                "1. Cadastrar quartos\n" +
                "2. Listar todos os quartos\n" +
                "3. Listar quartos livres\n" +
                "4. Aluguel/reserva de quarto\n" +
                "5. Registrar despesas extras\n" +
                "6. Calcular despesa do quarto\n" +
                "7. Sair\n" +
                "Escolha uma opção:");

            int op = Integer.parseInt(opStr);

            switch (op) {
                case 1:
                    if (cadastroFeito) {
                        JOptionPane.showMessageDialog(null, "Dados já cadastrados.");
                    } else {
                        for (int i = 0; i < 50; i++) {
                            leitos[i] = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de leitos para o quarto " + (i + 1)));
                            precos[i] = Float.parseFloat(JOptionPane.showInputDialog("Preço do quarto " + (i + 1)));
                            situacao[i] = "L";
                            nome[i] = "";
                            telefone[i] = "";
                            dataEntrada[i] = "XXXX";
                            dataSaida[i] = "XXXX";
                            numDiarias[i] = 0;
                            despesas[i] = 0;
                        }
                        cadastroFeito = true;
                    }
                    break;

                case 2:
                    if (!cadastroFeito) {
                        JOptionPane.showMessageDialog(null, "Escolha a opção 1 primeiro.");
                    } else {
                        for (int i = 0; i < 50; i++) {
                            JOptionPane.showMessageDialog(null, "Quarto: " + (i + 1) +
                                "\nSituação: " + situacao[i] +
                                "\nLeitos: " + leitos[i] +
                                "\nPreço: R$ " + precos[i] +
                                "\nNome: " + nome[i] +
                                "\nTelefone: " + telefone[i] +
                                "\nData de entrada: " + dataEntrada[i] +
                                "\nData de saída: " + dataSaida[i] +
                                "\nNúmero de diárias: " + numDiarias[i] +
                                "\nDespesas: R$ " + despesas[i]);
                        }
                    }
                    break;

                case 3:
                    if (!cadastroFeito) {
                        JOptionPane.showMessageDialog(null, "Escolha a opção 1 primeiro.");
                    } else {
                        for (int i = 0; i < 50; i++) {
                            if (situacao[i].equals("L")) {
                                JOptionPane.showMessageDialog(null, "Quarto " + (i + 1) + " está livre.");
                            }
                        }
                    }
                    break;

                case 4:
                    if (!cadastroFeito) {
                        JOptionPane.showMessageDialog(null, "Escolha a opção 1 primeiro.");
                    } else {
                        String tipo = JOptionPane.showInputDialog("Digite A (aluguel) ou R (reserva):").toUpperCase();
                        if (tipo.equals("A") || tipo.equals("R")) {
                            int quarto = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do quarto:")) - 1;
                            if (quarto >= 0 && quarto < 50) {
                                if (situacao[quarto].equals("L")) {
                                    situacao[quarto] = tipo.equals("A") ? "A" : "R";
                                    nome[quarto] = JOptionPane.showInputDialog("Digite o nome do cliente:");
                                    telefone[quarto] = JOptionPane.showInputDialog("Digite o telefone do cliente:");
                                    dataEntrada[quarto] = JOptionPane.showInputDialog("Digite a data de entrada:");
                                    dataSaida[quarto] = JOptionPane.showInputDialog("Digite a data de saída:");
                                    numDiarias[quarto] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de diárias:"));
                                } else {
                                    JOptionPane.showMessageDialog(null, "Quarto já ocupado.");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Quarto inválido.");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Resposta inválida.");
                        }
                    }
                    break;

                case 5:
                    if (!cadastroFeito) {
                        JOptionPane.showMessageDialog(null, "Escolha a opção 1 primeiro.");
                    } else {
                        int quarto = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do quarto:")) - 1;
                        if (quarto >= 0 && quarto < 50) {
                            float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor das despesas extras:"));
                            despesas[quarto] += valor;
                        } else {
                            JOptionPane.showMessageDialog(null, "Quarto inválido.");
                        }
                    }
                    break;

                case 6:
                    if (!cadastroFeito) {
                        JOptionPane.showMessageDialog(null, "Escolha a opção 1 primeiro.");
                    } else {
                        int quarto = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do quarto:")) - 1;
                        if (quarto >= 0 && quarto < 50) {
                            float total = despesas[quarto] + precos[quarto];
                            JOptionPane.showMessageDialog(null, "Total a pagar: R$ " + total);
                            situacao[quarto] = "L";
                            despesas[quarto] = 0;
                            dataEntrada[quarto] = "XXXX";
                            dataSaida[quarto] = "XXXX";
                            numDiarias[quarto] = 0;
                        } else {
                            JOptionPane.showMessageDialog(null, "Quarto inválido.");
                        }
                    }
                    break;

                case 7:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    System.exit(0);

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }
}

