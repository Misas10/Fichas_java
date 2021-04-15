package M_CAP.inface_grafica;

import javax.swing.*;

public class calculadora {
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JTextArea textArea1;
    private JPanel panel;
    private JButton enviarButton;

    public calculadora() {
        enviarButton.addActionListener(event -> {
            double bVal1 = Double.parseDouble(textField1.getText());
            double bVal2 = Double.parseDouble(textField2.getText());

            try {
                switch (comboBox1.getSelectedIndex()){
                    case 0:
                        textArea1.setText("" + (bVal1+bVal2));
                        break;
                    case 1:
                        textArea1.setText("" + (bVal1-bVal2));
                        break;
                    case 2:
                        textArea1.setText("" + (bVal1*bVal2));
                        break;
                    case 3:
                        textArea1.setText("" + (bVal1/bVal2));
                        break;
                    default:
                        textArea1.setText("Erro");
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        });
    }

    public static void main(String[] args) {
        // calculadora calculadora = new calculadora();
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new calculadora().panel);
        frame.setVisible(true);
        frame.setSize(500, 500);

    }
}
