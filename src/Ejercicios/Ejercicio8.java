package Ejercicios;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class Ejercicio8 {
    public Ejercicio8(){
        JFrame frame = new JFrame("Ejercicio 7");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JFrame frame1 = new JFrame("Frame 2");
                frame1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                frame1.setSize(400,100);
                frame1.setVisible(true);
            }
        });
        frame.setSize(400,100);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Ejercicio8 gui = new Ejercicio8();
            }
        });
    }
}
