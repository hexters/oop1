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
public class Hewan extends MahlukHidup{
    
    private String JenisHewan, Habitat;
    
    public Hewan (String nama, String JenisHewan, String Habitat, String Bernapas, String mahluk) {
        super(Bernapas, mahluk, nama);
        this.JenisHewan = JenisHewan;
        this.Habitat = Habitat;
    }
    
    public void Rangkuman () {
        System.out.println("Jenis Mahluk ini adalah " + this.mahluk);
        System.out.println("Nama hewan ini adalah " + this.nama);
        System.out.println("Jenis hewan ini adalah " + this.JenisHewan);
        System.out.println("Habitat hewan ini di " + this.Habitat);
        System.out.println("Hewan ini bernapas dengan " + this.Bernapas);
        
        
        
    }
    
}
