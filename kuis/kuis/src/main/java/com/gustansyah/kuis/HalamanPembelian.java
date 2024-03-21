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
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Gustanyah
 */
public class HalamanPembelian extends JFrame{
    
    private Majalah majalah;
    private JTextField jumlahField;
    private JLabel satuanText, pcsText, totalText;
    
    public HalamanPembelian(Majalah majalah){
        this.majalah = majalah;
        
        setTitle("Halaman Pembelian");
        setSize(400,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 1));
        
        JPanel pembelianPanel = new JPanel();
        pembelianPanel.setLayout(new GridLayout(9,1,10,10));
        pembelianPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        add(pembelianPanel);
        
        JLabel welcomeLabel = new JLabel("Halaman Pembelian");
        pembelianPanel.add(welcomeLabel);
        
        
        JPanel kategoriPanel = new JPanel();
        kategoriPanel.setLayout(new GridLayout(1,2));
        JLabel kategoriLabel = new JLabel("Kategori");
        JLabel kategoriText = new JLabel(""+this.majalah.kategori);
        kategoriPanel.add(kategoriLabel);
        kategoriPanel.add(kategoriText);
        pembelianPanel.add(kategoriPanel);
        
        JPanel hargaPanel = new JPanel();
        hargaPanel.setLayout(new GridLayout(1,2));
        JLabel hargaLabel = new JLabel("Harga");
        JLabel hargaText = new JLabel("Rp. "+this.majalah.harga);
        hargaPanel.add(hargaLabel);
        hargaPanel.add(hargaText); 
        pembelianPanel.add(hargaPanel);
        
        JPanel jumlahPanel = new JPanel();
        jumlahPanel.setLayout(new GridLayout(1,2));
        JLabel jumlahLabel = new JLabel("Jumlah");
        jumlahField = new JTextField("");
        jumlahPanel.add(jumlahLabel);
        jumlahPanel.add(jumlahField); 
        pembelianPanel.add(jumlahPanel);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1,2));
        JButton buttonKembali = new JButton("Kembali");
        JButton buttonBeli = new JButton("Beli");
        
        
        buttonKembali.addActionListener(e -> {
           
           HalamanUtama halamanUtama = new HalamanUtama("123220210");
           halamanUtama.setVisible(true);
           dispose(); // Tutup halaman login
                
        });
        
        buttonBeli.addActionListener(e -> {
            String inputJumlah = jumlahField.getText();
            if (inputJumlah.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Masukkan jumlah barang terlebih dahulu!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            } else {
                try {
                    int jmlBeli = Integer.parseInt(inputJumlah);
                    int hargaSatuan = this.majalah.getHarga();
                    int totalHarga = jmlBeli * hargaSatuan;

                    satuanText.setText("Rp. " + this.majalah.getHarga() + " / pcs");
                    pcsText.setText(jmlBeli + " pcs");
                    totalText.setText("Rp. " + totalHarga);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Masukkan hanya angka untuk jumlah barang!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                    ex.printStackTrace();
                    // Tangani jika input jumlah tidak valid
                }
            }
        });

        
        buttonPanel.add(buttonKembali);
        buttonPanel.add(buttonBeli); 
        pembelianPanel.add(buttonPanel);
        
        // Hasil
        
        JLabel hasilLabel = new JLabel("Total Pembelian");
        pembelianPanel.add(hasilLabel);
        
        JPanel satuanPanel = new JPanel();
        satuanPanel.setLayout(new GridLayout(1,2));
        JLabel satuanLabel = new JLabel("Harga Satuan");
        satuanText = new JLabel("");
        satuanPanel.add(satuanLabel);
        satuanPanel.add(satuanText);
        pembelianPanel.add(satuanPanel);
        
        JPanel pcsPanel = new JPanel();
        pcsPanel.setLayout(new GridLayout(1,2));
        JLabel pcsLabel = new JLabel("Kategori");
        pcsText = new JLabel("-");
        pcsPanel.add(pcsLabel);
        pcsPanel.add(pcsText); 
        pembelianPanel.add(pcsPanel);
        
        JPanel totalPanel = new JPanel();
        totalPanel.setLayout(new GridLayout(1,2));
        JLabel totalLabel = new JLabel("Total Harga");
        totalText = new JLabel("-");
        totalPanel.add(totalLabel);
        totalPanel.add(totalText); 
        pembelianPanel.add(totalPanel);
        
        
    }
    
}
