package constructorlar.odevler.atmprojesi.atm;

import java.util.Scanner;

public class login {
    public boolean giris(hesap hesap){

        Scanner sc=new Scanner(System.in);

        String kullanici_adi;
        String sifre;

        System.out.println("Kullanıcı adınızı giriniz:");
        kullanici_adi=sc.nextLine();
        System.out.println("Şifre giriniz:");
        sifre=sc.nextLine();

        if(hesap.getKullaniciAdi().equals(kullanici_adi)){
            if(hesap.getParola().equals(sifre)){
                return true;
            }
            else{
                return false;
            }
        }

        else return false;

    }
}
