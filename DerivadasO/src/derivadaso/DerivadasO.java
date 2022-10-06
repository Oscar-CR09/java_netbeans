
package derivadaso;

import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author ocervantes
 */
public class DerivadasO extends JFrame implements ActionListener {
private JLabel label1;
  private JLabel label2;
  private JLabel label3;
  private JLabel label4;
  private JLabel label5;
  private JLabel label6;
  private JLabel label7;
  private JLabel label8;
  private JLabel label9;
  private JLabel label10;
  private JLabel label11;
  private JLabel label12;
  private JLabel label13;
  private JLabel label14;
  
  private JLabel label15;
  private JLabel label16;
  private JLabel label17;
  private JLabel label18;
  private JLabel label19;
  private JLabel label20;
  private JLabel label21;
  
 private JTextField texto1;
 private JTextField texto2;
 private JTextField texto3;
 private JTextField texto4;
 private JTextField texto5;
 private JTextField texto6;
 
 private JButton boton1;
 private JButton boton2;


    
    public static void main(String[] args) {
    DerivadasO marco = new DerivadasO();
    marco.setSize(500,300);
    marco.createGUI();
    marco.setVisible(true);
    }

        private void createGUI(){
        setLayout(null); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label2 = new JLabel("Derivadas");
        label2.setBounds(10, 10, 250, 20);
        add(label2);
        
        label4 = new JLabel(" Ingrese Opción ");
        label4.setBounds(50, 40, 300, 20);
        add(label4);
        
        label10 = new JLabel("() ");
        label10.setBounds(210, 40, 150, 20);
        add(label10);
        
        label9 = new JLabel("1:ax^b ");
        label9.setBounds(230, 20, 150, 20);
        add(label9);
        
        
        label5 = new JLabel("2:(ax^b)(cx^d)");
        label5.setBounds(230,40, 300, 20);
        add(label5);
        
        label6 = new JLabel("");
        label6.setBounds(230, 60, 300, 20);
        add(label6);
      
        
        label1 = new JLabel("1 Coeficiente");
        label1.setBounds(10, 100, 100, 20);
        add(label1);
        
        label15 = new JLabel("2 Coeficiente");
        label15.setBounds(10, 130, 100, 20);
        add(label15);
        
        label3 = new JLabel(" = ");
        label3.setBounds(280, 100, 100, 20);
        add(label3);
        
        label7 = new JLabel(" = ");
        label7.setBounds(280, 130, 100, 20);
        add(label7);
        
        label8 = new JLabel("OPCIONES A ESCOGER ");
        label8.setBounds(20, 190, 300, 20);
        add(label8);
        
        label11 = new JLabel("1 Exponente");
        label11.setBounds(150, 100, 100, 20);
        add(label11);
        
        label16 = new JLabel("2 Exponente");
        label16.setBounds(150, 130, 100, 20);
        add(label16);

        label12 = new JLabel("x");
        label12.setBounds(340, 90, 40, 20);
        add(label12);
        
        label21 = new JLabel("x");
        label21.setBounds(380, 100, 40, 20);
        add(label21);
        
        label18 = new JLabel("x");
        label18.setBounds(340, 120, 40, 20);
        add(label18);
        
        label13 = new JLabel("X");
        label13.setBounds(330, 100, 40, 20);
        add(label13);
        
        label19 = new JLabel("x");
        label19.setBounds(330, 130, 40, 20);
        add(label19);
        
        label14 = new JLabel("X");
        label14.setBounds(300, 100, 40, 20);
        add(label14);
        
        label20 = new JLabel("X");
        label20.setBounds(300, 130, 40, 20);
        add(label20);
        
        texto1= new JTextField();
        texto1.setBounds(90, 100, 40, 20);
        add(texto1);
        
        texto2= new JTextField();
        texto2.setBounds(240, 100, 40, 20);
        add(texto2);
        
        texto3= new JTextField();
        texto3.setBounds(150, 40, 30, 20);
        add(texto3);
         
        texto4= new JTextField();
        texto4.setBounds(90, 130, 40, 20);
        add(texto4);
        
        texto5= new JTextField();
        texto5.setBounds(240, 130, 40, 20);
        add(texto5);
        
        boton1 = new JButton("Primer derivada:");
        boton1.setBounds(170, 190, 200, 20);
        boton1.addActionListener(this);
        add(boton1);
    
        boton2 = new JButton("Segunda derivada:");
        boton2.setBounds(170, 220, 200, 20);
        boton2.addActionListener(this);
        add(boton2);      
        

        }
        public void actionPerformed(ActionEvent f){
         
        int valor = Integer.parseInt(texto3.getText());
                 
        switch(valor){
            case 1:
            
                if(f.getSource()==boton1){
           
                    double a = Double.parseDouble(texto1.getText()); 
                    double b = Double.parseDouble(texto2.getText());
                    label14.setText(String.valueOf (a*b));
                    label12.setText(String.valueOf (b-1));
                    texto2.setSize(30, 20); // cambia el tamaño del elemneto
                    label10.setText(String.valueOf ("1"));
                    label10.setSize(40, 20);
                  
                } 

                    else if(f.getSource()==boton2){    
                    texto5.setText(String.valueOf ("0"));     
                    texto2.setText(String.valueOf ("0"));    
                    label10.setText(String.valueOf ("1"));
                    label10.setSize(40, 20);                    
                    }                    
                   break;
            case 2:
                if(f.getSource()==boton2){
           
                    double a = Double.parseDouble(texto1.getText()); 
                    double b = Double.parseDouble(texto2.getText());
                    label14.setText(String.valueOf (a*b));
                    label12.setText(String.valueOf (b-1));
                    texto2.setSize(30, 20); // cambia el tamaño del elemneto
                    label10.setText(String.valueOf ("2"));
                    label10.setSize(40, 20);
                    
                    double c = Double.parseDouble(texto4.getText()); 
                    double d = Double.parseDouble(texto5.getText());
                    label20.setText(String.valueOf (c*d));
                    label18.setText(String.valueOf (d-1));
                    texto2.setSize(30, 20); // cambia el tamaño del elemneto
                    
                    
                } 
 
                    
                    else if(f.getSource()==boton1){    
                    texto5.setText(String.valueOf ("0"));   
                    texto2.setText(String.valueOf ("0"));    
                    label10.setText(String.valueOf ("2"));
                    label10.setSize(40, 20);                    
                    }                    
                break;
                

            default:                  
                    texto3.setText(String.valueOf ("¡Error! "));
                    texto3.setSize(50, 20);
                    texto1.setText(String.valueOf ("  "));
                    texto2.setText(String.valueOf ("  "));    
                    texto4.setText(String.valueOf ("  "));
                    texto4.setSize(40, 20);
                    label10.setText(String.valueOf ("  "));
                    label10.setSize(40, 20);
                
            break;
        }
    }
 }
    

