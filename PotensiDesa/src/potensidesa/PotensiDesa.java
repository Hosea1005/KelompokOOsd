/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potensidesa;

import java.util.Scanner;

/**
 *
 * @author Hosea
 */
public class PotensiDesa {

    /**
     * @param args the command line arguments
     */
    static String namaDesa,lokasi, kades,wakades,sekdes,berdes;
    public static void main(String[] args) {
        
        PotensiDesa desa = new PotensiDesa();
        Autentikasi auten = new Autentikasi();
        Scanner scan = new Scanner(System.in);
        Desa profil = new Desa();
        Desa Desa[] = new Desa[100];
        for(int i =0; i<Desa.length; i++){
            Desa[i] = new Desa(namaDesa, lokasi, kades, wakades, sekdes, berdes);
        }
        Desa[0].setDesa("Desa Bahagia", "Medan", "Hosea Felix Hutahuruk", "Juan Siallagan", "Melisa", "Christine");
        int awal,utama,sub;
        do{
            desa.menuLogin();
            System.out.print("Login sebagai : ");
            awal = scan.nextInt();
            if(awal == 1){
                
                auten.loginPetugas();
                do{
                desa.menuUtamaPetugas();
                System.out.print("Pilih : ");
                utama = scan.nextInt();
                if(utama == 1){
                    do{
                        for(int i=0 ; i<Desa.length;i++){
                            if(Desa[i].getNamaDesa()!=null){
                                System.out.println("\n\t =======Profil Desa========");
                              Desa[i].display();
                            }
                        }
                            System.out.println("1. Edit ");
                            System.out.println("0. Back");
                            System.out.print("Pilih : ");
                            sub = scan.nextInt();
                            if(sub == 1){
                                desa.editProfil();
                                Desa[0].setDesa(namaDesa, lokasi, kades, wakades, sekdes, berdes);
                            }
                        
                    }while(sub !=0);
                }
                if(utama == 2){
                    
                }
                if(utama == 3){
                    
                }   
                if(utama == 4){
                    
                }
                if(utama == 5){
                    
                }
                if(utama == 6){
                    
                }
                if(utama == 7){
                    
                }
                }while(utama!=0);
            
            }
            if(awal == 2){
                auten.loginMasyarakat();
                do{
                desa.menuUtamaMasyarakat();
                System.out.print("Pilih : ");
                utama = scan.nextInt();
                if(utama == 1){
                    for(int i=0 ; i<Desa.length;i++){
                   if(Desa[i].getNamaDesa()!=null){
                      System.out.printf(i+1+".");
                      Desa[i].display();
                    }
                }
                }
                if(utama == 2){
                    
                }
                if(utama == 3){
                    
                }
                if(utama == 4){
                    
                }
                if(utama == 5){
                    
                }
                if(utama == 6){
                    
                }
                if(utama == 7){
                    
                }
            }while(utama!=0);
                }
        }
        while(awal != 0);
        }
    
    
    public void menuLogin(){
        System.out.println("\t======= Login =======");
        System.out.println("1. Login Petugas");
        System.out.println("2. Login Masyarakat");
        System.out.println("0. Keluar");
    }
    public void menuUtamaPetugas(){
        System.out.println("\t========= Selamat Datang ==========");
        System.out.println("\t   ====== Perangkat Desa =======");
        System.out.println("1. Kelola Profil Desa");
        System.out.println("2. Kelola Peraturan Desa");
        System.out.println("3. Kelola HomeStay");
        System.out.println("4. Kelola Penjualan");
        System.out.println("5. Kelola Event");
        System.out.println("6. Kelola Laporan Keuangan");
        System.out.println("7. Laporan");
        System.out.println("0. Back");
    }
    public void menuUtamaMasyarakat(){
        System.out.println("\t========= Selamat Datang ==========");
        System.out.println("\t   ======   Masyarakat   =======");
        System.out.println("1. Profil Desa");
        System.out.println("2. Peraturan Desa");
        System.out.println("3. Informasi Event");
        System.out.println("4. Pemesanan HomeStay");
        System.out.println("5. Request Surat Permohonan");
        System.out.println("6. Kelola Penjualan");
        System.out.println("7. Laporan Keuangan");
        System.out.println("0. Back");
    }
    public void editProfil(){
        System.out.println("\t========Edit Profil Desa=======");
        Scanner scan =  new Scanner(System.in);
        System.out.print("Nama Desa : ");
        namaDesa = scan.next();
        System.out.print("Lokasi : ");
        lokasi = scan.next();
        System.out.print("Kepala Desa : ");
        kades = scan.next();
        System.out.print("Wakil Kepala Desa : ");
        wakades = scan.next();
        System.out.print("Sekertaris Desa : ");
        sekdes = scan.next();
        System.out.print("Bendahara Desa : ");
        berdes = scan.next();
    }
        
   
}
