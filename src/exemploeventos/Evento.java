/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploeventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author mfrancomartinez
 */
public class Evento implements ActionListener{
JFrame marco;
JPanel panel;
JButton botonazul, botonrojo, botonamarillo;
   

    public Evento(JFrame marco, JPanel panel, JButton botonazul, JButton botonamarillo, JButton botonrojo) {
        this.marco = marco;
        this.panel = panel;
        this.botonazul = botonazul;
        this.botonamarillo = botonamarillo;
        this.botonrojo = botonrojo;
    }

    public Evento(){
        marco = new JFrame("Ventana eventos");
        panel = new JPanel();
        botonazul = new JButton("azul");
        botonrojo = new JButton ("rojo");
        botonamarillo = new JButton ("amarillo");
        
        marco.setSize(400,200);
        panel.add(botonazul);
        panel.add(botonrojo);
        panel.add(botonamarillo);
        marco.add(panel);
        botonazul.addActionListener(this);
        botonrojo.addActionListener(this);
        botonamarillo.addActionListener(this);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
                
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
       Object boton = e.getSource();
       if (boton == botonazul){
           panel.setBackground(Color.BLUE);
       }else if (boton == botonrojo){
           panel.setBackground(Color.red);
       }else{
           panel.setBackground(Color.yellow);           
       }
       
    }
    
    

}
