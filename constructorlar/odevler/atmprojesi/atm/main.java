package constructorlar.odevler.atmprojesi.atm;


import org.w3c.dom.ls.LSOutput;

public class main {
    //Login classı kullanıcı girişini kontrol edecek

    //hesap class'ı hesap işlemlerini yapacak

    //atm ise atmmizi çalıştıracak
public static void main(String[] args) {
    atm atm1 =new atm() ;

    hesap hesap = new hesap("ALP","123" , 580);

    atm1.calis(hesap);

    System.out.println("Progmadan çıkılıyor....");

}


}
