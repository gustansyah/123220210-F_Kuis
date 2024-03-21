/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gustansyah.kuis;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Gustansyah
 */
public class HalamanUtama extends JFrame {
    
    private String username; 
 
    public HalamanUtama(String username){
        this.username = username;
        setTitle("Halaman Login");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 1));
        
        JPanel utamaPanel = new JPanel();
        utamaPanel.setLayout(new GridLayout(5,1,10,10));
        add(utamaPanel);
        
        utamaPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        
        JLabel welcomeLabel = new JLabel("Selamat Datang, " + this.username);
        welcomeLabel.setFont(welcomeLabel.getFont().deriveFont(24.0f));
        utamaPanel.add(welcomeLabel);
        JLabel instruksiLabel = new JLabel("Silahkan pilih menu di bawah untuk membeli majalah !");
        utamaPanel.add(instruksiLabel);
        
        JButton anakButton = new JButton("Majalah Anak");
        JButton remajaButton = new JButton("Majalah Remaja");
        JButton dewasaButton = new JButton("Majalah Dewasa");
        
        anakButton.addActionListener(e -> {
           Majalah majalah = new Majalah("Majalah Anak", 12700);
           
           HalamanPembelian halamanPembelian = new HalamanPembelian(majalah);
           halamanPembelian.setVisible(true);
           dispose(); // Tutup halaman login
                
        });
        
        remajaButton.addActionListener(e -> {
           Majalah majalah = new Majalah("Majalah Remaja", 15200);
           
           HalamanPembelian halamanUtama = new HalamanPembelian(majalah);
           halamanUtama.setVisible(true);
           dispose(); // Tutup halaman login
                
        });
         
        dewasaButton.addActionListener(e -> {
           Majalah majalah = new Majalah("Majalah Dewasa", 26900);
           
           HalamanPembelian halamanUtama = new HalamanPembelian(majalah);
           halamanUtama.setVisible(true);
           dispose(); // Tutup halaman login
                
        });
         
        utamaPanel.add(anakButton); 
        utamaPanel.add(remajaButton); 
        utamaPanel.add(dewasaButton); 
    }
}
