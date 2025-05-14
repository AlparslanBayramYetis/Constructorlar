package constructorlar;

public class Account {

    private String hesapNo;
    private double bakiye;
    private String isim;

    private String email;

    private String telefonNo;

    public Account(String hesapNo, double bakiye, String isim, String email, String telefonNo) {
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.isim = isim;
        this.email = email;
        this.telefonNo = telefonNo;
    }
    public Account() {
        this("Bilgi yok",0,"bilgi yok","bilgi yok","bilgi yok");
    }
    public Account(String hesapNo, String isim, String email) {
       /* this.hesapNo = hesapNo;
        this.isim = isim;
        this.email = email;

        this.telefonNo = "Bilgi yok";
        this.bakiye = 0;
        */
        this(hesapNo,0,isim,email,"Bilgi yok");
    }
    public void yazdir(){
        System.out.println("Hesap No : "+hesapNo);
        System.out.println("Bakiye : "+bakiye);
        System.out.println("Isim : "+isim);
        System.out.println("Email : "+email);
        System.out.println("TelefonNo : "+telefonNo);
    }

    public void paraYatir(double miktar){
        bakiye = bakiye+miktar;

        System.out.println("Yeni bakiye = "+bakiye);
    }

    public void paraCek(double miktar){
        if(miktar>bakiye){
            System.out.println("Yetersiz bakiye");
        }
        if(miktar<0){
            System.out.println("Çekmek istediğiniz bakiye 0'dan küçük olamaz");
        }
        else {
            bakiye = bakiye-miktar;

            System.out.println("Yeni bakiye = "+bakiye);

        }
    }


    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public void setTelefonNo(String telefonNo) {
        this.telefonNo = telefonNo;
    }

}
