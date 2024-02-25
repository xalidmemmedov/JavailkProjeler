package BankaHesabi;

public class Bank {
    public static void main(String[] args) {
        musteri mus1 =new musteri();
        mus1.ad="Xalid";
        mus1.soyad="MEmmedov";
mus1.musteriHesabi.pulkocur(100);
mus1.musteriHesabi.pulkocur(300);
    mus1.musteriHesabi.pulcek(28);
        System.out.println("mus1 = " + mus1.musteriHesabi);
    }
}
