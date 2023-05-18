
package Ejercicios;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ejercicio4 {
     public Ejercicio4(){
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
        
        //----------------------------------------------------------

        //Contenedor central formulario
        //Contenedor RadioButtons
        JPanel panel5 = new JPanel();
        //Contenedor CheckBox
        JPanel panel6 = new JPanel();
        //Contenedor central Grid
        JPanel panelGridCentral = new JPanel();
        //-----------------------------------------------------------

        //Contenedor sur --------------------------------------------
        JPanel panel7 = new JPanel();

        //Componentes-------------------------------------------------
        JLabel etiqueta1 = new JLabel("Nombre");
        JLabel etiqueta2 = new JLabel("Apellidos");
        JLabel etiqueta3 = new JLabel("Password");
        JLabel etiqueta4 = new JLabel("Género");
        JLabel etiqueta5 = new JLabel("¿Estás de acuerdo?");
        JTextField nombre = new JTextField(20);
        JTextField apellidos = new JTextField(20);
        JPasswordField password = new JPasswordField(20);
        JRadioButton hombre = new JRadioButton("H");
        JRadioButton mujer = new JRadioButton("M");
        JCheckBox acuerdo = new JCheckBox();
        JButton button = new JButton("Enviar");
        //------------------------------------------------------------

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
        // --------------------------------------------------------------------

        //Panel Central -------------------------------------------------------
        panelGridCentral.setLayout(new GridLayout(2,1));
        panel5.add(etiqueta4);
        panel5.add(hombre);
        panel5.add(mujer);
        panel6.add(etiqueta5);
        panel6.add(acuerdo);

        panelGridCentral.add(panel5);
        panelGridCentral.add(panel6);
        panelPrincipal.add(panelGridCentral, BorderLayout.CENTER);
        //--------------------------------------------------------------------

        //Panel sur-----------------------------------------------------------
        panel7.add(button);
        panelPrincipal.add(panel7, BorderLayout.SOUTH);
        //--------------------------------------------------------------------

        contentPane.add(panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350,250);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(Ejercicio4::new);
    }
}
