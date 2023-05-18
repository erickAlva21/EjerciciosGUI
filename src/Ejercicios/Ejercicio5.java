
package Ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejercicio5 {
    public Ejercicio5(){
        JFrame frame = new JFrame("Ejercicio 5");
        //Creamos un contenedor para colocar los elementos
        JPanel contentPane = (JPanel) frame.getContentPane();
        //Ahora creamos un panel que albergara un boton y una eqiqueta
        JPanel panel = new JPanel();
        JButton button = new JButton("Haz click aquí");
        //Agregamos un listener para que este pendiente a un evento
        button.addActionListener(new ActionListener() {
            //Sobrecargamos el metodo para agregar nuestro evento a el que este atento
            //y que haga
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton clickedButton = (JButton) e.getSource();
                clickedButton.setText("Boton Pulsado");
            }
        });
        panel.add(button);
        contentPane.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,100);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Ejercicio5 gui = new Ejercicio5();
            }
        });
    }
}
