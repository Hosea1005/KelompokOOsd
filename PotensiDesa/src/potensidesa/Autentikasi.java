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
public class Autentikasi implements Acces{
    private String username;
    private String password;

    public String getUsername() {
        return this.username;
    }

    
    public String getPassword() {
        return this.password;
    }
    
    @Override
    public void loginPetugas() {
        Scanner scan = new Scanner(System.in);
        Autentikasi autentikasi = new Autentikasi();
        System.out.println("================================");
        System.out.print("Username: ");
        username = scan.nextLine();
        System.out.println("================================");
        System.out.print("Password: ");
        password = scan.nextLine();
        System.out.println("================================");

        if("admin".equals(username) && "admin".equals(password)){
            System.out.println("Berhasil");
        }else{
            System.out.println("Gagal Login, coba lagi");
            autentikasi.loginPetugas();
        }
    }

    @Override
    public void loginMasyarakat() {
        Scanner scan = new Scanner(System.in);
        Autentikasi autentikasi = new Autentikasi();
        System.out.println("================================");
        System.out.print("Username: ");
        username = scan.nextLine();
        System.out.println("================================");
        System.out.print("Password: ");
        password = scan.nextLine();
        System.out.println("================================");

        if("hosea".equals(username) && "hosea".equals(password)){
            System.out.println("Berhasil");
        }else{
            System.out.println("Gagal Login, coba lagi");
            autentikasi.loginMasyarakat();
        }
    }
    
}
