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
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Gustansyah
 */
public class HalamanLogin extends JFrame {
    public HalamanLogin() {
        setTitle("Halaman Login");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 1));
        
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(6,1,10,10));
        add(loginPanel);
        
        loginPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        
        JLabel welcomeLabel = new JLabel("Selamat Datang, Silahkan Login !");
        
        loginPanel.add(welcomeLabel);
        
        

        JTextField usernameField = new JTextField();
        loginPanel.add(new JLabel("Username:"));
        loginPanel.add(usernameField);

        JPasswordField passwordField = new JPasswordField();
        loginPanel.add(new JLabel("Password:"));
        loginPanel.add(passwordField);

  
        
  
        
        

        // Login button
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            
            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Username dan password tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (!username.equals("123220210") || !password.equals("12345")) {
                JOptionPane.showMessageDialog(this, "Username atau password salah!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Login berhasil!", "Success", JOptionPane.INFORMATION_MESSAGE);
                // Jika login berhasil, arahkan ke HalamanUtama
                HalamanUtama halamanUtama = new HalamanUtama(username);
                halamanUtama.setVisible(true);
                dispose(); // Tutup halaman login
            }
        });
        loginPanel.add(loginButton);
        

        
    }

}
