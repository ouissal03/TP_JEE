/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaswing;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
/**
 *
 * @author 21263
 */
public class calculatrice {
    public static void main(String[] args) {
        JPanel contenuFenetre = new JPanel();
        BorderLayout dispositionl = new BorderLayout();    
        
        GridLayout disposition = new  GridLayout(4,3);
        
        contenuFenetre.setLayout(disposition);
        JTextField entree1 = new JTextField(30);
           
        JButton lancer1 = new JButton("1");
        JButton lancer2 = new JButton("2");
        JButton lancer3 = new JButton("3");
        JButton lancer4 = new JButton("4");
        JButton lancer5 = new JButton("5");
        JButton lancer6 = new JButton("6");
        JButton lancer7 = new JButton("7");
        JButton lancer8 = new JButton("8");
        JButton lancer9 = new JButton("9");
        JButton lancer0 = new JButton("0");
        JButton lancerop = new JButton(",");
        JButton lancereg = new JButton("=");
        
         contenuFenetre.add("North", entree1);  
        contenuFenetre.add(lancer1);
        contenuFenetre.add(lancer2);
        contenuFenetre.add(lancer3);
        contenuFenetre.add(lancer4);
        contenuFenetre.add(lancer5);
        contenuFenetre.add(lancer6);
        contenuFenetre.add(lancer7);
        contenuFenetre.add(lancer8);
        contenuFenetre.add(lancer9);
        contenuFenetre.add(lancer0);
        contenuFenetre.add(lancerop);
        contenuFenetre.add(lancereg);
        JFrame cadre = new JFrame("calculatrice");
        cadre.setContentPane(contenuFenetre);
        cadre.setSize(400, 100);
        cadre.setVisible(true);
        entree1.setLayout(disposition);  
    }
    
}
