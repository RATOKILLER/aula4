package atividade360;
import javax.swing.JOptionPane;

public class Horoscopo {
    public static void main(String[] args) {
        String[] signos = {"Capricórnio", "Aquário", "Peixes", "Áries", "Touro", "Gêmeos", 
                            "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário"};
        int[] ultDia = {20, 19, 20, 20, 20, 20, 21, 22, 22, 22, 21, 21};

        int data = Integer.parseInt(JOptionPane.showInputDialog("Digite a data no formato ddmm ou 9999 para terminar:"));

        while (data != 9999) {
            int dia = data / 100; 
            int mes = data % 100 - 1; 

            if (dia > ultDia[mes]) {
                mes = (mes + 1) % 12;
            }
            JOptionPane.showMessageDialog(null, "Signo: " + signos[mes]);
            data = Integer.parseInt(JOptionPane.showInputDialog("Digite a data no formato ddmm ou 9999 para terminar:"));
        }
        JOptionPane.showMessageDialog(null, "Fim do programa!");
    }
}

