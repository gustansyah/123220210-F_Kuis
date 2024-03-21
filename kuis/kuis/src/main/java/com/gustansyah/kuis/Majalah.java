/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gustansyah.kuis;

/**
 *
 * @author Gustansyah
 */
public class Majalah {
    // Atribut
    String kategori;
    int harga;

    // Constructor
    public Majalah(String kategori, int harga) {
        this.kategori = kategori;
        this.harga = harga;
    }

    // Method untuk mengakses dan mengubah nilai atribut
    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    // Method lain jika diperlukan
}

