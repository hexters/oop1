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
public class Tumbuhan extends MahlukHidup{
 
    private String biji, aroma;
    
    public Tumbuhan (String nama, String biji, String aroma, String Bernapas, String mahluk) {
        super(Bernapas, mahluk, nama);
        this.biji = biji;
        this.aroma = aroma;
    }
    
    public void Rangkuman() {
        System.out.println("Jenis mahluk ini adalah " + this.mahluk);
        System.out.println("Tumbuhan ini bernama " + this.nama);
        System.out.println(this.biji);
        System.out.println(this.aroma);
    }
    
}
