package M_CAP.inface_grafica;

import javax.swing.*;

public class tipo_triangulo {
    private JPanel panel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton limparButton;
    private JButton enviarButton;
    private JTextPane textPane1;

    public tipo_triangulo() {
        enviarButton.addActionListener(e -> {
            Double lado1 = Double.parseDouble(textField1.getText());
            Double lado2 = Double.parseDouble(textField2.getText());
            Double lado3 = Double.parseDouble(textField3.getText());

            if ((lado1 + lado2) > lado3 || (lado1 + lado3) > lado2 || (lado2 + lado3) > lado1){
                textPane1.setText("Não é possivel criar o triângulo");

            }else if(lado1.equals(lado2) && lado2.equals(lado3)){
                textPane1.setText("É um Triângulo Equilátero");

            }else if(lado1.equals(lado2) || lado2.equals(lado3) || lado1.equals(lado3)){
                textPane1.setText("É um Triângulo Isósceles");

            }else {
                textPane1.setText("É um triângulo");
            }
        });
        limparButton.addActionListener(e -> {
            textField1.setText("");
            textField2.setText("");
            textField3.setText("");
        });
    }

    public static void main(String[] args) {
        JFrame janela = new JFrame("Tipos de triângulo");
        janela.setContentPane(new tipo_triangulo().panel);
        janela.setVisible(true);
        janela.setSize(500, 500);
    }
}