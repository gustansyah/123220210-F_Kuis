/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.gustansyah.kuis;

import javax.swing.SwingUtilities;

/**
 *
 * @author Gustansyah
 */
public class Kuis {

    
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> {
            HalamanLogin halamanLogin = new HalamanLogin();
            halamanLogin.setVisible(true); // Tampilkan frame LoginPage
        });
       
    }
}
