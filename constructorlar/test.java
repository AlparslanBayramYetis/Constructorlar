package constructorlar;

public class test {
    public static void main(String[] args) {
        /*

        Account account1 = new Account();

        account1.setHesapNo("1021151");
        account1.setBakiye(250);
        account1.setEmail("alpbay09@gmail.com");
        account1.setIsim("alparslan");
        account1.setTelefonNo("5524312522");

        System.out.println("bakiye: " + account1.getBakiye());

        account1.paraYatir(10);
        account1.paraCek(25);
        */

        Account account2 = new Account("1023",540,"rynerdesanta@gmail.com","Alp","55424568");

        account2.paraYatir(45);
        account2.paraCek(85);

        Account account3 =new Account();
        Account account4 =new Account("542","messi","as@.com");

        account4.yazdir();
    }
}
