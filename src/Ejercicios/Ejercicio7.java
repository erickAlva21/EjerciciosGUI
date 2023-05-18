
package Ejercicios;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class Ejercicio7 {
    public Ejercicio7(){
        JFrame frame = new JFrame("Ejercicio 7");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowListener() {
            //Metodo que al abrir la ventana te muestra un mensaje
            @Override
            public void windowOpened(WindowEvent e) {

            }
            //Método que al cerrar la ventana te pide confirmacion para salir
            @Override
            public void windowClosing(WindowEvent e) {
                JFrame frame1 = new JFrame("Frame 2");
                frame1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                frame1.setSize(400,100);
                frame1.setVisible(true);
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
        frame.setSize(400,100);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Ejercicio7 gui = new Ejercicio7();
            }
        });
    }
}
