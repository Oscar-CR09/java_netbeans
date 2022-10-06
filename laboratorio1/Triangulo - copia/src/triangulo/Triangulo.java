
package triangulo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * LIBRO JAVA PARA ESTUDIANTE
 * 2 "A"
 * UPEM
 * @author oscarcervantes
 */
public class Triangulo extends JFrame
implements ActionListener{
private JButton button;
    private JPanel panel;
    
    public static void main(String[] args) {
    Triangulo marco = new Triangulo();
    marco.setSize(400,300);
    marco.createGUI();
    marco.setVisible(true);
    }
     // Instruccion para crear el cuadro grafico 
    private void createGUI(){
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Container window = getContentPane();
    window.setLayout(new FlowLayout());

    panel = new JPanel ();
    panel.setPreferredSize(new Dimension (300,200));
    panel.setBackground(Color.white);
    window.add(panel);
//Se crea un boton para ejecutar
    button=new JButton("Haz click");
    window.add(button);
    button.addActionListener(this);    
        
    }
    //dibuja una trinagulo 
    public void actionPerformed(ActionEvent event){
    Graphics papel = panel.getGraphics();
    papel.drawLine(20,80,70,10);
    papel.drawLine(70,10,120,80);
    papel.drawLine(20,80,120,80);//dibuja la base
    }
}
