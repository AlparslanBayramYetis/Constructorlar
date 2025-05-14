package constructorlar.odevler.atmprojesi.atm;

public class hesap {
    private String kullaniciAdi;
    private String parola;
    private int bakiye;

    public hesap(String kullaniciAdi, String parola, int bakiye) {
        this.setKullaniciAdi(kullaniciAdi);
        this.setParola(parola);
        this.setBakiye(bakiye);
    }


    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public void paraYatir(int miktar){
         bakiye = miktar + bakiye;
        System.out.println("Yeni bakiyeniz "+ bakiye);
    }

    public void paracek(int miktar){
        if  (miktar<0){
            System.out.println("Yanlış işlem");
        }
        if(bakiye<miktar){
            System.out.println("Bakiye yetersiz");
        }
        else {
            bakiye = bakiye - miktar;
            System.out.println("Yeni bakiyeniz "+ bakiye);
        }

    }
    public void bakiye(){
        System.out.println("Bakiyeniz " + bakiye);
    }


}
