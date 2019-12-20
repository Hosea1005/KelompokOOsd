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
public class Desa implements Display{
    String namaDesa,lokasi, kades,wakades,sekdes,berdes;

    public Desa() {
    }
    
    public Desa(String namaDesa,String lokasi, String kades, String wakades, String sekdes, String berdes) {
        this.namaDesa = namaDesa;
        this.lokasi = lokasi;
        this.kades = kades;
        this.wakades = wakades;
        this.sekdes = sekdes;
        this.berdes = berdes;
        
    }
    public void setDesa(String namaDesa,String lokasi, String kades, String wakades, String sekdes, String berdes) {
        this.namaDesa = namaDesa;
        this.lokasi = lokasi;
        this.kades = kades;
        this.wakades = wakades;
        this.sekdes = sekdes;
        this.berdes = berdes;
        
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getKades() {
        return kades;
    }

    public void setKades(String kades) {
        this.kades = kades;
    }

    public String getWakades() {
        return wakades;
    }

    public void setWakades(String wakades) {
        this.wakades = wakades;
    }

    public String getSekdes() {
        return sekdes;
    }

    public void setSekdes(String sekdes) {
        this.sekdes = sekdes;
    }

    public String getBerdes() {
        return berdes;
    }

    public void setBerdes(String berdes) {
        this.berdes = berdes;
    }

    public String getNamaDesa() {
        return namaDesa;
    }

    public void setNamaDesa(String namaDesa) {
        this.namaDesa = namaDesa;
    }

    @Override
    public void display() {
        System.out.println("Nama Desa : "+getNamaDesa()+"\nLokasi : "+getLokasi()+"\nKepala Desa : "+getKades()+"\nWakil Kepala Desa : "+getWakades()+"\nSekertaris Desa : "+getSekdes()+"\nBendara Desa : "+getBerdes());
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
