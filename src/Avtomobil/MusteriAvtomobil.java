package Avtomobil;

public class MusteriAvtomobil {
    public static void main(String[] args) {
         Musteri mus1=new Musteri();
         mus1.name="Xalid Memmedov";
mus1.eHesab=new Elektrikhesabi();
mus1.eHesab.tuketimEkle(50);
mus1.eHesab.tuketimEkle(60);
mus1.eHesab.tuketimEkle(100);
mus1.eHesab.tuketimyaz();
mus1.eHesab.faturayaz();
    }
}
