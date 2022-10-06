package calculodeárea;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * 
 *LIBRO PARA ESTUDIANTES
 * 2 "A"
 * @author oscarcervantes
 * 
 */
public class CalculoDeÁrea extends JFrame implements ActionListener{
private JButton botón;
   
    public static void main(String[] args) {
    CalculoDeÁrea marco = new CalculoDeÁrea();
    marco.setSize(400,300);
    marco.crearGUI();
    marco.setVisible(true);
    
    private void crearGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());
        
        botón= new JButton("Hagaclick");
        window.add(botón);
        botón.addActionListener(this);

    }
    public void actionPerformed(ActionEvent event){
        int área;
        int longitud;
        int anchura;
        longitud=20;
        anchura=10;
        área=longitud*anchura;
        JOptionPane.showMessageDialog(null,"El área es: " +área);
    }        
        
    }
    

