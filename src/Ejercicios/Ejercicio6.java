
package Ejercicios;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
    class MiEscuchador implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        clickedButton.setEnabled(false);
        clickedButton.setText("Clicked");
    }
}

public class Ejercicio6 {
    public Ejercicio6(){
        JFrame frame = new JFrame("Mi primer Layout");
        JPanel contentPane = (JPanel) frame.getContentPane();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,5));
        for(int i=0; i<=24; i++){
            String numero = String.valueOf(i);
            JButton button= new JButton("Botón"+numero);
            button.addActionListener(new MiEscuchador());
            panel.add(button);
        }
        contentPane.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Ejercicio6 gui = new Ejercicio6();
            }
        });
    }
}
