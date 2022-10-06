
package calculodearealibro;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author oscarcervantes
 */
public class CalculoDeAreaLibro extends JFrame implements ActionListener {

    private JButton buton;
    
    public static void main(String[] args) {
    CalculoDeAreaLibro marco= new CalculoDeAreaLibro();
    marco.setSize(400,300);
    marco.createGUI();
    marco.setVisible(true);
    }
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Container windows = getContentPane();
        windows.setLayout(new FlowLayout());
        
        buton=new JButton("Haga Click");
        windows.add(buton);
        buton.addActionListener(this);
    }        
    public void actionPerformed (ActionEvent event){
            int area;
            int longitud;
            int anchura;
            String longitudString;
            String anchuraString;
            longitudString=JOptionPane.showInputDialog("Longitud:");
            longitud=Integer.parseInt(longitudString);
            anchuraString=JOptionPane.showInputDialog("anchura");
            anchura=Integer.parseInt(anchuraString);
            area=longitud * anchura;
            JOptionPane.showMessageDialog(null,"el area es:" + area + "m");                      
            
        }
        
    }

