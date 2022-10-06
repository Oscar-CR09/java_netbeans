
package ahorcado.juego;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.awt.Font.*;
/**
 *Oscar Cervantes Cervantes
 * @author Lab1-4
 */
public class AhorcadoJuego extends JFrame implements ActionListener {
private JLabel label1, label3;
     
private JLabel label2;
private JButton ba,bc,bd,bg, br,bo,bt,bs,bl,bk,bu;
private JTextField l1,l2,l3,l4;
int G,O,K,U,F;
    
    public AhorcadoJuego(){
    
    setLayout(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
ImageIcon   imagen = new ImageIcon("ahorcadoimag/goku.jpg");
ImageIcon   imagen2 =new ImageIcon("ahorcadoimag/winner.gif");
ImageIcon   over = new   ImageIcon("ahorcadoimag/over.gif");

label1=new JLabel(imagen);
label1.setBounds(110,100,368,360);
        
 add(label1);
 Font fuente = new Font("Calibri", 3, 20);
        
        l1 =new JTextField();
        l1.setBounds(140, 500, 50, 50);
       l1.setFont(fuente);
        add(l1);
         l2 =new JTextField();
        l2.setBounds(200, 500, 50, 50);
        l2.setFont(fuente);
        add(l2);
         l3 =new JTextField();
        l3.setBounds(260, 500, 50, 50);
        l3.setFont(fuente);
        add(l3);
         l4 =new JTextField();
        l4.setBounds(320, 500, 50, 50);
        l4.setFont(fuente);
        add(l4);
        
       
       
        ba = new JButton("A");
        ba.setBounds(20, 600, 50, 50);
        ba.addActionListener(this);
        add(ba);
        
        bc = new JButton("C");
        bc.setBounds(80, 600, 50, 50);
        bc.addActionListener(this);
        add(bc);
        
        bd = new JButton("D");
        bd.setBounds(140, 600, 50, 50);
        bd.addActionListener(this);
        add(bd);
        
        bg = new JButton("G");
        bg.setBounds(200, 600, 50, 50);
        bg.addActionListener(this);
        add(bg);
        
        br = new JButton("R");
        br.setBounds(260, 600, 50, 50);
        br.addActionListener(this);
        add(br);
        
        bo = new JButton("O");
        bo.setBounds(320, 600, 50, 50);
        bo.addActionListener(this);
        add(bo);
        
        bt = new JButton("T");
        bt.setBounds(80, 700, 50, 50);
        bt.addActionListener(this);
        add(bt);
        
        bs = new JButton("S");
        bs.setBounds(440, 600, 50, 50);
        bs.addActionListener(this);
        add(bs);
        
        bl = new JButton("L");
        bl.setBounds(500, 600, 50, 50);
        bl.addActionListener(this);
        add(bl);
        
        
        bk = new JButton("K");
        bk.setBounds(20, 700, 50, 50);
        bk.addActionListener(this);
        add(bk);
        
        bu = new JButton("U");
        bu.setBounds(380, 600, 50, 50);
        bu.addActionListener(this);
        add(bu);
        
        label2=new JLabel ();
        label2.setIcon(imagen2);
        label2.setBounds(180, 550, 300, 300);
        label2.setVisible(false);
        add(label2);
        
        label3=new JLabel ();
        label3.setIcon(over);
        label3.setBounds(120, 550, 550, 400);
        label3.setVisible(false);
        add(label3);

    }

    public void actionPerformed(ActionEvent f){
   if (f.getSource()==bg){
       l1.setText("G");
       bg.setVisible(false);
        G=1;
       
   }
   if (f.getSource()==bo){
       l2.setText("O");
       bo.setVisible(false);
       O=1;
   }
   if (f.getSource()==bk){
       l3.setText("K");
       bk.setVisible(false);
        K=1;
   }
   if(f.getSource()==bu){
       l4.setText("U");
       bu.setVisible(false);
        U=1;
   }
   else{ 
   if (f.getSource()==ba){
       ba.setVisible(false);
       F=F+1;
   }
   if(f.getSource()==bd){
       bd.setVisible(false);
       F=F+1;
   }
    if(f.getSource()==bl){
       bl.setVisible(false);
       F=F+1;
   }
     if(f.getSource()==bc){
       bc.setVisible(false);
       F=F+1;
   }
     if(f.getSource()==bs){
       bs.setVisible(false);
       F=F+1;
   }
   if(f.getSource()==br){
       br.setVisible(false);
       F=F+1;
   }
   if(f.getSource()==bt){
       bt.setVisible(false);
       F=F+1;
   } 
   
   }
        
    
     if (G==1&&O==1&&K==1&&U==1){
        label2.setVisible(true);
             ba.setVisible(false);
             bc.setVisible(false);
             bd.setVisible(false);
             bg.setVisible(false);
             br.setVisible(false);
             bo.setVisible(false);
             bt.setVisible(false);
             bs.setVisible(false);
             bl.setVisible(false);
             bk.setVisible(false);
             bu.setVisible(false);
        }else{
         if(F==3){
             ba.setVisible(false);
             bc.setVisible(false);
             bd.setVisible(false);
             bg.setVisible(false);
             br.setVisible(false);
             bo.setVisible(false);
             bt.setVisible(false);
             bs.setVisible(false);
             bl.setVisible(false);
             bk.setVisible(false);
             bu.setVisible(false);
             label3.setVisible(true);
             
         }
     }
       
    
}
 

    public static void main(String[] args) {
AhorcadoJuego formulario1=new AhorcadoJuego();
formulario1.setBounds(400,100,800,1000);
formulario1.setVisible(true);
        
    }
    
}
