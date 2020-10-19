/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119067.latihan2.deklarasivariabel;

/**
 *
 *
 * NAMA     : Andreas Danhago
 * KELAS    : IF2
 * NIM      : 10119067
 * Deskripsi Program : Deklarasi & Pengaksesan
 */
public class PBOIF210119067 {

 public void tambahKambing() {
        // Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PBOIF210119082Latihan4Kambing kambingJantan = new PBOIF210119082Latihan4Kambing();
        kambingJantan.tambahKambing();
    }
    
}
