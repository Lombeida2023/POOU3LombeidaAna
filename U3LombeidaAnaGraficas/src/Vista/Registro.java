/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

/**
 *

 * @author LOMBEIDA ANA
 */
public class Registro extends JFrame{
    //Creamos una ventana grafiaca con JFrame
    
    public JPanel panel;
    public Registro    (){
    this.setSize(500,500);
    setTitle("REGISTRO");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    ///Centrar la ventana
    //setBounds(500,200,500,500);
    setLocationRelativeTo(null);
    iniciarComponentes();
    
    }
    
    
    private void iniciarComponentes(){
    colocarPanel();
    colocarEtiquetas();
    ColocarBotones();
    ColocarCajaTexto();
    colocarAreaTexto();
    }
    
    private void colocarPanel(){
    panel=new JPanel();
    ///Damos color al panel
    
    panel.setBackground(Color.red);
    //poner el panel sobre la ventana de registro
    
    this.getContentPane().add(panel);
    
    
    }
    public void colocarEtiquetas(){
    
     JLabel label=new JLabel("REGISTRARSE",SwingConstants.CENTER);
     panel.add(label);
     panel.setLayout(null);
     label.setBounds(100, 10,350,50);
     label.setForeground(Color.red);
     label.setForeground(Color.GREEN);
     label.setOpaque(true);
     //CReamos objetos
     
     JLabel label1 =new JLabel();
     label.setText("LOMBEIDA ANA ");
     //AGREGAMOS LA ETIQUETA AL PANEL
     panel.add(label1);
     //UBICAR
     label1.setHorizontalAlignment(HEIGHT);
     //FUENTE
     label1.setFont(new Font("Arial",Font.PLAIN,40));
     label1.setBounds(30,70,350,50);
     
     JLabel labelimagen =new JLabel();
     ImageIcon imagen =new  ImageIcon("Registro.png");
     labelimagen.setBounds(30, 110, 100, 50);
     panel.add(labelimagen);
     labelimagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(labelimagen.getWidth(),labelimagen.getHeight(),Image.SCALE_SMOOTH)));
     
     
    }
   public void ColocarBotones(){
     JButton boton1 =new JButton("CLICK");
     boton1.setBounds(30, 310, 100, 50);
     panel.add(boton1);
     boton1.setEnabled(true);
     boton1.setMnemonic('a');
     
     
     JButton boton2 =new JButton("CLICK");
     boton2.setBounds(150, 310, 100, 50);
      ImageIcon imagen1 =new  ImageIcon("Boton.JPG");
     panel.add(boton2);
     boton2.setEnabled(true);
     boton2.setMnemonic('b');
     boton2.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(),Image.SCALE_SMOOTH)));
     
     
     
     
     }
   
   public void ColocarCajaTexto(){
   JTextField cajatexto1 =new  JTextField() ;
   cajatexto1.setBounds(150, 80, 200, 30);
   panel.add(cajatexto1);
   cajatexto1.setText("POO");
   System.out.println("EL TEXTO DE LA CAJA ES:"+cajatexto1.getText());
   
           
   
   }
    
   
   public void colocarAreaTexto(){
   
    JTextArea textArea=new JTextArea();
   textArea.setBounds(130, 130, 250, 150);
      panel.add(textArea);
      textArea.setText("POO ");
      textArea.append("/ESCRIBIR AQUI....");
  JScrollPane barra=new   JScrollPane(textArea);
  //vertical
  barra.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
  //HORIZONTAL
    barra.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
     barra.setBounds(130, 130, 250, 150);
  panel.add(barra);
   }
}
