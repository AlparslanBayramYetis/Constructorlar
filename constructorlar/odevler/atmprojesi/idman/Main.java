package constructorlar.odevler.atmprojesi.idman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //idman programı
        Scanner input = new Scanner(System.in);

        System.out.println("İdman programına hoşgeldiniz: ");

        String idmanlar= "Geçerli idmanlar \n" +
                "Burpee\n" +
                "Pushup\n" +
                "Situp\n" +
                "Squat";
        System.out.println(idmanlar);

        System.out.println("Bir idman oluşturun");

        System.out.println("-----------------------");

        System.out.println("Burpee sayısı : ");
        int burpee= input.nextInt();
        System.out.println("Pushupp sayısı : ");
        int pushupp= input.nextInt();
        System.out.println("Situp sayısı : ");
        int situp= input.nextInt();
        System.out.println("Squat sayısı : ");
        int squat= input.nextInt();

        input.nextLine();//Önemli kısmında açıklanmıştır.

        idman idman =  new idman(burpee,pushupp,situp,squat);

        System.out.println("--------------------------");

        System.out.println("İdmanınız başlıyor");
        System.out.println();

         while (idman.bittiMi() ==false){

             System.out.println("Hareket türü(burpee,pushup,situp,squat) : ");
             String tur = input.nextLine();
             System.out.print("Bu hareketten kaç tane yapıcaksınız : ");
             int sayi = input.nextInt();
             input.nextLine(); //bu dumptır stringten sonra int aldığımızda hata oluşmasını engellemek için bunlara başvuruyoruz.
             idman.hareketYap(tur,sayi);


         }
        System.out.println();
        System.out.println("İdmanı başarılı bir şekilde tamamladınız");

    }
}
