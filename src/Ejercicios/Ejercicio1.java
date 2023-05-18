
package Ejercicios;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejercicio1 {
    public Ejercicio1(){
        JFrame frame = new JFrame("Ejercicio 1");
        //Creamos un contenedor para colocar los elementos
        JPanel contentPane = (JPanel) frame.getContentPane();
        //Creamos una etiqueta y la agregamos a el contenedor
        JLabel etiqueta = new JLabel("Botón");
        contentPane.add(etiqueta);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Ejercicio1 gui = new Ejercicio1();
            }
        });
    }
}
