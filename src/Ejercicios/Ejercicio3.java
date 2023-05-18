
package Ejercicios;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejercicio3 {
    public Ejercicio3(){
        JFrame frame = new JFrame("Mi segundo Layout");
        JPanel contentPane = (JPanel) frame.getContentPane();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());
        panel1.setLayout(new GridLayout(2,2));
        panel1.add(new JButton("Botón 0"));
        panel1.add(new JButton("Botón 1"));
        panel1.add(new JButton("Botón 2"));
        panel1.add(new JButton("Botón 3"));
        panel2.add(panel1, BorderLayout.CENTER);
        panel2.add(new JButton("Botón 5"), BorderLayout.NORTH);
        panel2.add(new JButton("Botón 6"), BorderLayout.WEST);
        panel2.add(new JButton("Botón 7"), BorderLayout.SOUTH);
        panel2.add(new JButton("Botón 8"), BorderLayout.EAST);
        contentPane.add(panel2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Ejercicio3 gui = new Ejercicio3();
            }
        });
    }
}
