
package Ejercicios;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ejercicio10 {
    public Ejercicio10(){
        JFrame frame = new JFrame("Formulario");
        JPanel contentPane = (JPanel) frame.getContentPane();
        //Panel pricipal con border layout
        JPanel panelPrincipal = new JPanel();

        //Contenedor superior formulario
        //Panel contenedor nombre
        JPanel panel2 = new JPanel();
        //Panel contenedor apellidos
        JPanel panel3 = new JPanel();
        //Panel contenedor Password
        JPanel panel4 = new JPanel();
        //Panel superior GridJPanel 
        JPanel panelGridSuperior = new JPanel();
        
        //Contenedor sur --------------------------------------------
        JPanel panel5 = new JPanel();
        
        //Componentes-------------------------------------------------
        JLabel etiqueta1 = new JLabel("Nombre");
        JLabel etiqueta2 = new JLabel("Apellidos");
        JLabel etiqueta3 = new JLabel("Password");
        JTextField nombre = new JTextField(20);
        JTextField apellidos = new JTextField(20);
        JPasswordField password = new JPasswordField(20);
        JButton button = new JButton("Enviar");
        
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource() == button){
                    String nombre1 = nombre.getText();
                    String apellidos1 = apellidos.getText();
                    String password1 = new String(password.getPassword());
                    
                    String mensaje = "Nombre: " + nombre1 + "\n" +
                                     "Apellido: " + apellidos1 + "\n" +
                                     "Contraseña: " + password1;
                    
                    JOptionPane.showMessageDialog(null,mensaje);
                            
                }
            }
        });
        
        //Definicion Layout panel principal
        panelPrincipal.setLayout(new BorderLayout());
        
        //Panel Superior ----------------------------------------------
        panelGridSuperior.setLayout(new GridLayout(3,1));
        //Agregamos los componentes a cada contenedor creado
        panel2.add(etiqueta1);
        panel2.add(nombre);
        panel3.add(etiqueta2);
        panel3.add(apellidos);
        panel4.add(etiqueta3);
        panel4.add(password);
        
        //A el panel definido para grid agregamos los tres contendores
        panelGridSuperior.add(panel2);
        panelGridSuperior.add(panel3);
        panelGridSuperior.add(panel4);
        //Definimos el panel con los tres contenedores en grid en el border norte
        panelPrincipal.add(panelGridSuperior, BorderLayout.NORTH);
        
        //Panel sur-----------------------------------------------------------
        panel5.add(button);
        panelPrincipal.add(panel5, BorderLayout.SOUTH);
        
        contentPane.add(panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350,250);
        frame.setVisible(true);
    }
    

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                Ejercicio10 gui = new Ejercicio10();
            }
        });
    }
}
