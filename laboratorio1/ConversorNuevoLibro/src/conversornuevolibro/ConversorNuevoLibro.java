
package conversornuevolibro;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * 2 "A"
 * UPEM
 * @author oscarcervantes
 */
public class ConversorNuevoLibro extends JFrame
implements ActionListener{
private JLabel label1;
   private JLabel label2;
  private JLabel label3;
  private JLabel label4;
  private JLabel label5;
  private JLabel label6;
  private JLabel label7;
  private JTextField texto1;
 
 private JTextField texto2;
 private JTextField texto3;
 private JButton boton1;
 private JButton boton2;
 private JButton boton3;
 private JButton boton4;
 private JButton boton5;
 private JButton boton6;
  
    public static void main(String[] args) {
 ConversorNuevoLibro marco = new ConversorNuevoLibro();
 marco.setSize(450,400);
 marco.createGUI();
 marco.setVisible(true);
    }
    private void createGUI(){
         setLayout(null); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label1 = new JLabel("CONVERSOR DE GRADOS");
        label1.setBounds(10, 10, 300, 20);
        add(label1);
        
        label1 = new JLabel("Primer valor");
        label1.setBounds(10, 80, 100, 20);
        add(label1);
        
        label3 = new JLabel(" = ");
        label3.setBounds(180, 80, 100, 20);
        add(label3);
        label4 = new JLabel(" Ingrese Opción ");
        label4.setBounds(50, 40, 300, 20);
        add(label4);
        
        label5 = new JLabel(" 1 Fahrenheit ");
        label5.setBounds(50, 140, 300, 20);
        add(label5);
          label6 = new JLabel(" 2 Celcius ");
        label6.setBounds(50, 200, 300, 20);
        add(label6);
        label7 = new JLabel(" 3 Kelvin ");
        label7.setBounds(50, 270, 300, 20);
        add(label7);
        
        texto1= new JTextField();
        texto1.setBounds(90, 80, 80, 20);
        add(texto1);
        
        texto2= new JTextField();
        texto2.setBounds(200, 80, 200, 20);
        add(texto2);
        
        texto3= new JTextField();
        texto3.setBounds(150, 40, 200, 20);
        add(texto3);
        
        boton2 = new JButton("Fahrenheit:");
        boton2.setBounds(150, 130, 200, 20);
        boton2.addActionListener(this);
        add(boton2);     
        
       
        
        boton1 = new JButton("Celcius:");
        boton1.setBounds(160, 200, 200, 20);
        boton1.addActionListener(this);
        add(boton1);
    
        
        
        boton3 = new JButton("Kelvin:");
        boton3.setBounds(150, 260, 200, 20);
        boton3.addActionListener(this);
        add(boton3);
        
        
}
    
    public void actionPerformed(ActionEvent f){
         
        int valor = Integer.parseInt(texto3.getText());
                 
        switch(valor){
            case 1:
            
                if(f.getSource()==boton1){
           
                    double a = Double.parseDouble(texto1.getText());     
            
                    texto2.setText(String.valueOf ((a-32)*5/9));
                    texto2.setSize(200, 20); // cambia el tamaño del elemneto
       
                   break;
                   
            }
        } 
        
    }
}
