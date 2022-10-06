
package areasgrafico;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author ocervantes
 */
public class AreasGrafico extends JFrame implements ActionListener {
  private JLabel label1;
  private JLabel label2;
  private JLabel label3;
  private JLabel label4;
  
  
 private JTextField texto1;
 private JTextField texto2;


 
 private JButton boton1;
 private JButton boton2;
 private JButton boton3;

    
    public static void main(String[] args) {
     AreasGrafico marco = new AreasGrafico();
     marco.setSize(450,300);
     marco.createGUI();
     marco.setVisible(true);    
    }
    
    private void createGUI(){
         setLayout(null); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label2 = new JLabel("CONVERSOR de mm. a cm, m, pulgadas. ");
        label2.setBounds(10, 10, 300, 20);
        add(label2);
        
        label1 = new JLabel("Valor en mm :");
        label1.setBounds(10, 80, 100, 20);
        add(label1);
        
        label3 = new JLabel(" = ");
        label3.setBounds(165, 80, 100, 20);
        add(label3);
        label4 = new JLabel(" ¿? ");
        label4.setBounds(340, 80, 80, 20);
        add(label4);
        
        
        
        
        
        texto1= new JTextField();
        texto1.setBounds(90, 80, 70, 20);
        add(texto1);
        
        texto2= new JTextField();
        texto2.setBounds(180, 80, 150, 20);
        add(texto2);
        
   
               
    
         
        

        boton1 = new JButton("cm:");
        boton1.setBounds(170, 130, 200, 20);
        boton1.addActionListener(this);
        add(boton1);
    
        boton2 = new JButton("m:");
        boton2.setBounds(170, 160, 200, 20);
        boton2.addActionListener(this);
        add(boton2);      
        
        boton3 = new JButton("pulgadas:");
        boton3.setBounds(170, 190, 200, 20);
        boton3.addActionListener(this);
        add(boton3);
        
}
    public void actionPerformed(ActionEvent f){
         

            
                if(f.getSource()==boton1){
           
                    double a = Double.parseDouble(texto1.getText()); 
                   
                    texto2.setText(String.valueOf (a/10) );
                    texto2.setSize(150, 20); // cambia el tamaño del elemneto
                   
                    label4.setText(String.valueOf ("cm"));
                    label4.setSize(80, 20);
                } 
                if(f.getSource()==boton2){           
                    double a = Double.parseDouble(texto1.getText());
                    
                    texto2.setText(String.valueOf (a/1000));
                    texto2.setSize(150, 20); // cambia el tamaño del elemneto
                  
                    label4.setText(String.valueOf ("m"));
                    label4.setSize(80, 20);                    
                    }
                    
                if(f.getSource()==boton3){    
                    double a = Double.parseDouble(texto1.getText());
                    
                    texto2.setText(String.valueOf (a/25.4));
                    texto2.setSize(150, 20); // cambia el tamaño del elemneto
                  
                    label4.setText(String.valueOf ("puladas"));
                    label4.setSize(80, 20);                        
                    }                    
          
               
        }
    }
    

