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
public class MahlukHidup {
    
    protected String Bernapas, mahluk, nama;
    
    
    public MahlukHidup (String bernapas, String mahluk, String nama) {
        this.Bernapas = bernapas;
        this.mahluk = mahluk;
        this.nama = nama;
    }
    
    public MahlukHidup(){}
    
    public void Rangkuman () {
        System.out.println("Mahluk ini adalah " + this.mahluk);
        System.out.println("Nama sebutannya " + this.nama);
        System.out.println("Dia bernapas dengan " + this.Bernapas);
    }
}
