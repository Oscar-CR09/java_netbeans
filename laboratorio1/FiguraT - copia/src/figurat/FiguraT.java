
package figurat;
//Importaciones de la libreria 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * LIBRO JAVA PARA ESTUDIANTE 
 * UPEM
 * @author oscarcervantes
 */
public class FiguraT extends JFrame
implements ActionListener {
    private JButton button;
    private JPanel panel;

    
    public static void main(String[] args) {
    FiguraT marco = new FiguraT();
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
    //dibuja una T 
    public void actionPerformed(ActionEvent event){
    Graphics papel = panel.getGraphics();
    papel.drawLine(100,50,200,50);
    papel.drawLine(150,50,150,150);
    }
}
