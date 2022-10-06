
package juegogato;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *LIBRO JAVA PARA ESTUDIANTES
 * 2 "A"
 * UPEM
 * @author oscarcervantes
 */
public class JuegoGato  extends JFrame
implements ActionListener{
    private JButton button;
    private JPanel panel;


    public static void main(String[] args) {
    JuegoGato marco = new JuegoGato();
    marco.setSize(400,300);
    marco.createGUI();
    marco.setVisible(true);
    }
        private void createGUI(){
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    Container window = getContentPane();
    window.setLayout(new FlowLayout());

    panel = new JPanel ();
    panel.setPreferredSize(new Dimension (300,200));
    panel.setBackground(Color.white);
    window.add(panel);

    button=new JButton("Haz click");
    window.add(button);
    button.addActionListener(this);        
    }
    public void actionPerformed(ActionEvent event){
    Graphics papel = panel.getGraphics();
    papel.drawLine(100, 0, 100, 300);
    papel.drawLine(200, 0,200, 300);
    papel.drawLine(0, 70,400, 70);
    papel.drawLine(0, 140,400, 140);
    
    }
}
