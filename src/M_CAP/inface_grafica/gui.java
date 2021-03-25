package M_CAP.inface_grafica;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class gui {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton enviarButton;
    private JTextPane textPane1;

    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setContentPane(new gui().panel1);
        janela.setTitle("Tipos de Triângulo");
        janela.setVisible(true);
        janela.setLocationRelativeTo(null);
        janela.setSize(500, 500);
    }
    public void actionPerformed(ActionEvent e){

    }
}
