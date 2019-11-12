/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ARVINA
 */
public class merk extends data{
    
    int harga;

    public merk(String merk, int size, String warna, String jenis, String kategori, double harga) {
        super(merk, size, warna, jenis, kategori, harga);
        this.merk = merk;
        this.size = size;
        this.warna = warna;
        this.jenis = jenis;
        this.kategori = kategori;
        this.harga = (int) harga;
    }
    
    public void info(){
        System.out.println("Merk: "+this.merk);
        System.out.println("Size: "+this.size);
        System.out.println("Warna: "+this.warna);
        System.out.println("Jenis: "+this.jenis);
        System.out.println("Kategori: "+this.kategori);
        System.out.println("Harga: "+this.harga);
    
    }
}
