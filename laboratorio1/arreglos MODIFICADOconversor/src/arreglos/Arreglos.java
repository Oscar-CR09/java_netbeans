
package Arreglos;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
//oscar cervantes Rosales 2 "A"
public class Arreglos extends JFrame implements ActionListener{
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
  
    public Arreglos(){
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
        
        label5 = new JLabel(" 1 Celcius ");
        label5.setBounds(50, 140, 300, 20);
        add(label5);
          label6 = new JLabel(" 2 Fahrenheit ");
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
        
        boton2 = new JButton("Celcius a Fahrenheit:");
        boton2.setBounds(150, 130, 200, 20);
        boton2.addActionListener(this);
        add(boton2);     
        
        boton4 = new JButton("Celcius a kelvin:");
        boton4.setBounds(150, 155, 200, 20);
        boton4.addActionListener(this);
        add(boton4);     
        
        boton1 = new JButton("Fahrenheit a celcius:");
        boton1.setBounds(160, 200, 200, 20);
        boton1.addActionListener(this);
        add(boton1);
    
        boton5 = new JButton("Fahrenheit a kelvin:");
        boton5.setBounds(160, 225, 200, 20);
        boton5.addActionListener(this);
        add(boton5);
        
        boton3 = new JButton("Kelvin a celcius:");
        boton3.setBounds(150, 260, 200, 20);
        boton3.addActionListener(this);
        add(boton3);
        
        boton6 = new JButton("Kelvin a Fahrenheit:");
        boton6.setBounds(150, 285, 200, 20);
        boton6.addActionListener(this);
        add(boton6);
        
        
    }
    
   
    
    public void actionPerformed(ActionEvent f){
        
        if (f.getSource()==boton1){
            double a = Double.parseDouble(texto1.getText());          
            
            
            texto2.setText(String.valueOf ((a-32)*5/9));
            texto2.setBackground(Color.red); //color de fondo
            texto2.setForeground(Color.blue); //color del texto
          texto2.setSize(200, 20); // cambia el tamaño del elemneto
            
        }
        
        if (f.getSource()==boton2){
            double a = Double.parseDouble(texto1.getText());
            
            
            texto2.setText(String.valueOf((a*9/5)+32));
            texto2.setBackground(Color.red); //color de fondo
            texto2.setForeground(Color.blue); //color del texto
          texto2.setSize(200, 20); // cambia el tamaño del elemneto
           
        }
        if (f.getSource()==boton3){
            double a = Double.parseDouble(texto1.getText());
            
            texto2.setText(String.valueOf(a-273));
            texto2.setBackground(Color.red); //color de fondo
            texto2.setForeground(Color.blue); //color del texto
          texto2.setSize(200, 20); // cambia el tamaño del elemneto
           
            
        }
        if (f.getSource()==boton4){
            double a = Double.parseDouble(texto1.getText());
            
            texto2.setText(String.valueOf(a+273.15));
            texto2.setBackground(Color.red); //color de fondo
            texto2.setForeground(Color.blue); //color del texto
          texto2.setSize(200, 20); // cambia el tamaño del elemneto
        }
        if (f.getSource()==boton5){
            double a = Double.parseDouble(texto1.getText());
            
            texto2.setText(String.valueOf((a-32)*5/9+273.15));
            texto2.setBackground(Color.red); //color de fondo
            texto2.setForeground(Color.blue); //color del texto
          texto2.setSize(200, 20); // cambia el tamaño del elemneto
        }
        if (f.getSource()==boton6){
            double a = Double.parseDouble(texto1.getText());
            
            texto2.setText(String.valueOf((a+273.15)*9/5+32));
            texto2.setBackground(Color.red); //color de fondo
            texto2.setForeground(Color.blue); //color del texto
          texto2.setSize(200, 20); // cambia el tamaño del elemneto
        }
        
        
        
    }
    

    
    public static void main(String[] args) {
         Arreglos formulario1=new Arreglos();
        formulario1.setBounds(200,200,500,350);
        formulario1.setVisible(true);
    }
    
}
