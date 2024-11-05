/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaswing;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
/**
 *
 * @author 21263
 */
public class JavaSwing {

    public static void main(String[] args) {
        JPanel contenuFenetre = new JPanel();
        
        GridLayout disposition = new  GridLayout(4,2,5,5);
        
        contenuFenetre.setLayout(disposition);
        
        JLabel label1 = new JLabel("Nombre1 : ");
        JTextField entree1 = new JTextField(10);
        JLabel label2 = new JLabel("Nombre2 : ");
        JTextField entree2 = new JTextField(10);
        JLabel label3 = new JLabel("  somme : ");
        JTextField resultat = new JTextField(10);
        JButton lancer = new JButton("Ajouter");
        contenuFenetre.add(label1);
        contenuFenetre.add(entree1);
        contenuFenetre.add(label2);
        contenuFenetre.add(entree2);
        contenuFenetre.add(label3);
        contenuFenetre.add(resultat);
        contenuFenetre.add(lancer);
        
        JFrame cadre = new JFrame("Ma premiere calculatrice");
        
        cadre.setContentPane(contenuFenetre);
        
        cadre.setSize(400, 100);
        cadre.setVisible(true);
        
       
    }
}
