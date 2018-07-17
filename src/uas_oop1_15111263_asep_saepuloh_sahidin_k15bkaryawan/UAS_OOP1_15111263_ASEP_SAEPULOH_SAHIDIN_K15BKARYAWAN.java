/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_oop1_15111263_asep_saepuloh_sahidin_k15bkaryawan;

import java.util.Scanner;

/**
 *
 * @author Hexters
 */
public class UAS_OOP1_15111263_ASEP_SAEPULOH_SAHIDIN_K15BKARYAWAN {
    
    public enum Jenis {
        Manusia,
        Hewan,
        Tumbuhan
    }
    
    public enum JenisKelamin {
        Pria,
        Wanita
    }
    
    public enum JenisHewan {
        vertebrata,
        invertebrata
    }
    
    public enum jenisVertebrata {
        Katak,
        Ular
    }
    
    public enum jenisInVertebrata {
        Protozoa,
        Porifera 
    }
    
    public enum jenisTumbuhan {
        Monokotil,
        Dikotil
    }
    
    public enum jenisDikotil {
        Kapas,
        Karet
    }
    public enum jenisMonokotil {
        Jagung,
        Kelapa
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int pilih, tipe;
       
       Scanner input = new Scanner(System.in);
       
       int num = 1;
       for(Jenis item : Jenis.values()) {
           System.out.println(num + ". " + item);
           num++;
       }
       System.out.print("Silakan tentukan jenis mahluk hidup di atas : ");
       pilih = input.nextInt();
       System.out.println();
       
       Manusia manusiaPria = new Manusia("Asep Saepuloh Sahidin", 28, 165, "Sawo Matang", "Paru-paru", "Manusia");
       Manusia manusiaWanita = new Manusia ("Eka Meirani Agustina", 25, 165, "Putih", "Paru-paru", "Manusia");
       
       switch (pilih) {
           case 1:
               int no = 1;
                for(JenisKelamin item : JenisKelamin.values()) {
                    System.out.println(no + ". " + item);
                    no++;
                }
               System.out.print("Silakan tentukan jenis kelamin dari manusia ini : ");
               tipe = input.nextInt();
               
               Pria pria = new Pria();
               Wanita wanita = new Wanita();
               
               switch (tipe) {
                   case 1:
                       manusiaPria.showMahluk();
                       pria.info();
                       break;
                    case 2:
                       manusiaWanita.showMahluk();
                       wanita.info();
                       break;
               }
               
               
               break;
           case 2:
               
               int no2 = 1;
                for(JenisHewan item : JenisHewan.values()) {
                    System.out.println(no2 + ". " + item);
                    no2++;
                }
               System.out.print("Silakan tentukan jenis hewan ini : ");
               tipe = input.nextInt();
               // Vetebrata
               Hewan HewanIkan = new Hewan("Ikan", "Pisces", "Air", "Insang", "Hewan");
                Hewan HewanUlar = new Hewan("Ular", "Reptil", "Darat", "Par-paru", "Hewan");               
                
                
                // Invertebrata
                Hewan HewanProtozoa = new Hewan("Protozoa", "Hewan Uniseluler Pertama", "Air", "ostium", "Hewan");
                Hewan HewanPorifera = new Hewan("Porifera", "Hewan berpori", "air", "ostium", "Hewan");               
                
                Vertebrata vertebrata = new Vertebrata();
                InVertebrata Invertebrata = new InVertebrata();
               switch (tipe) {
                   case 1:
                       int no3 = 1;
                        for(jenisVertebrata item : jenisVertebrata.values()) {
                            System.out.println(no3 + ". " + item);
                            no3++;
                        }
                        System.out.print("Silakan tentukan jenis hewan ini : ");
                        tipe = input.nextInt();
                        switch (tipe) {
                            case 1:
                                HewanIkan.Rangkuman();
                                break;
                            case 2:
                                HewanUlar.Rangkuman();
                                break;
                        }
                       
                        vertebrata.info();
                       
                       break;
                   case 2:
                       int no4 = 1;
                        for(jenisInVertebrata item : jenisInVertebrata.values()) {
                            System.out.println(no4 + ". " + item);
                            no4++;
                        }
                        System.out.print("Silakan tentukan jenis hewan ini : ");
                        tipe = input.nextInt();
                        
                        switch (tipe) {
                            case 1:
                                HewanProtozoa.Rangkuman();
                                break;
                            case 2:
                                HewanPorifera.Rangkuman();
                                break;
                        }
                        
                        Invertebrata.info();
                       break;
               }
               
               break;
               
           case 3:
               int nomor = 1;
                for(jenisTumbuhan item : jenisTumbuhan.values()) {
                    System.out.println(nomor + ". " + item);
                    nomor++;
                }
                
                System.out.print("Silakan tentukan jenis tumbuhan ini : ");
                tipe = input.nextInt();
                
                Dikotil dikotil = new Dikotil();
                Monokotil monokotil = new Monokotil();
                
                switch (tipe) {
                    case 1:
                        
                        int nomor1 = 1;
                        for(jenisMonokotil item : jenisMonokotil.values()) {
                            System.out.println(nomor1 + ". " + item);
                            nomor1++;
                        }

                        System.out.print("Silakan tentukan nama tumbuhan ini : ");
                        tipe = input.nextInt();
                        
                        Tumbuhan Jagung = new Tumbuhan("Jagung", "Berbiji", "Beraroma jagung", "", "Tumbuhan");
                        Tumbuhan Kelapa = new Tumbuhan("Kelapa", "Tidak Berbiji", "Beraroma kelapa", "", "Tumbuhan");
                        
                        switch (tipe) {
                            case 1:
                                Jagung.Rangkuman();
                                break;
                            case 2:
                                Kelapa.Rangkuman();
                                break;
                        }
                        
                        monokotil.info();
                        
                        break;
                        
                    case 2:
                        int nomor2 = 1;
                        for(jenisDikotil item : jenisDikotil.values()) {
                            System.out.println(nomor2 + ". " + item);
                            nomor2++;
                        }

                        System.out.print("Silakan tentukan nama tumbuhan ini : ");
                        tipe = input.nextInt();
                        
                        Tumbuhan Karet = new Tumbuhan("Karet", "Tidak berbiji", "Beraroma karet", "", "Tumbuhan");
                        Tumbuhan Kapas = new Tumbuhan("Kapas", "Berbiji", "tidak beraroma", "", "Tumbuhan");
                        
                        switch (tipe) {
                            case 1:
                                Karet.Rangkuman();
                                break;
                            case 2:
                                Kapas.Rangkuman();
                                break;
                        }
                        
                        dikotil.info();
                        break;
                }
                
               break;
       }
       
    }
    
}
