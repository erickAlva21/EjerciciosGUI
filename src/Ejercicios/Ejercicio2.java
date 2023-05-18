
package Ejercicios;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejercicio2 {
    public Ejercicio2(){
        JFrame frame = new JFrame("Mi primer Layout");
        JPanel contentPane = (JPanel) frame.getContentPane();
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,5));
        for(int i=0; i<=24; i++){
            String numero = String.valueOf(i);
            panel.add(new JButton("Botón "+numero));
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
                Ejercicio2 gui = new Ejercicio2();
            }
        });
    }
}
