package Paneles;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.*;


public class Ventana extends JFrame {

    public JPanel panel;

    public Ventana() {
        setSize(500,500);
      setTitle("Biblioteca Airos");
      setBounds(100,200,500,500);
      setLocationRelativeTo(null); //Ponemos la ventana en el centro
        panel1();
    }

    private void panel1() {
        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();

    }

    private void colocarPaneles(){
        panel=new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    private void colocarEtiquetas(){
        JLabel etiqueta=new JLabel();
        etiqueta.setText("Titulo del libro: ");
        etiqueta.setBounds(10,10,150,30);
        etiqueta.setFont(new Font("arial",Font.PLAIN,20));
        panel.add(etiqueta);
        JLabel autor=new JLabel();
        autor.setText("Nombre del autor: ");
        autor.setBounds(25,25,170,70);
        autor.setFont(new Font("arial",Font.PLAIN,20));
        panel.add(autor);


//Etiqueta para el fondo del panel
        ImageIcon imagen=new ImageIcon("madera.jpg");
        JLabel fondo=new JLabel(imagen);
        fondo.setBounds(10,80,450,450);
        panel.add(fondo);
    }

    private void colocarBotones() {
        JButton boton1=new JButton("Añadir");
        JButton boton2=new JButton( "Eliminar");
        boton1.setBounds(50,100,100,30);
        boton2.setBounds(300,100,100,30);
        boton1.setEnabled(true);
        boton2.setEnabled(true);
        boton1.setFont(new Font("arial",Font.BOLD,15));
        boton1.setFont(new Font("arial",Font.BOLD,15));
        panel.add(boton1);
        panel.add(boton2);

    }

}


