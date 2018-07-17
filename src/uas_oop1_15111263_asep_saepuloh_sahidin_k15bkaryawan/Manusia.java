/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_oop1_15111263_asep_saepuloh_sahidin_k15bkaryawan;

/**
 *
 * @author Billy
 */
public class Manusia extends MahlukHidup {
   
    private int usia, tinggi; 
    private String warnaKulit;
    
    public Manusia (String nama, int usia, int tinggi, String warnaKulit, String Bernapas, String mahluk) {
        super(Bernapas, mahluk, nama);
        this.usia = usia;
        this.tinggi = tinggi;
        this.warnaKulit = warnaKulit;
    }
    
    public void showMahluk () {
        super.Rangkuman();
        System.out.println("Usia nya adalah " + this.usia + " tahun");
        System.out.println("Tinggi badannya " + this.tinggi + " cm");
        System.out.println("Warna kulitnya " + this.warnaKulit);
    }
}
