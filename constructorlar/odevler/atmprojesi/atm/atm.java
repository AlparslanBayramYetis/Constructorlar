package constructorlar.odevler.atmprojesi.atm;

import java.util.Scanner;

public class atm {
    public void calis(hesap hesap) {
        login login = new login();

        Scanner sc = new Scanner(System.in);

        System.out.println("Bankamıza hoşgeldiniz....");
        System.out.println("*************************");
        System.out.println("Kullanıcı Girişi...");
        System.out.println("*************************");

        int giris_hakki =3;

        while(true){
            if(login.giris(hesap)){
                System.out.println("giriş başarılı");
                break;
            }
            else{
                System.out.println("giriş başarısız");
                giris_hakki--;
            }
            if (giris_hakki == 0) {
                System.out.println("Sonra tekrar deneyin");
                return;//direkt metodu sonlandırmak için break döngüyü sonlandırır
            }
        }

        System.out.println("*************************");

             while(true){
                System.out.println("İşleminizi seçiniz...(1: Bakiye görüntüleme , 2: Para ekleme , 3: Para çekme , 0: Çıkış yap)");

                String islem =sc.nextLine();


                    if(islem.equals("0")){
                         System.out.println("Çıkış Yapılıyor");
                        return;
                    }
                    else if(islem.equals("1")){
                        hesap.bakiye();
                    }else if(islem.equals("2")){
                        System.out.println("Ne kadar para eklemek istiyosunuz");
                        int miktar =sc.nextInt();
                        hesap.paraYatir(miktar);

                    }else if(islem.equals("3")){
                        System.out.println("Ne kadar para çekmek istiyosunuz");
                        int miktar =sc.nextInt();
                        hesap.paracek(miktar);
                    }

            }
    }

}
