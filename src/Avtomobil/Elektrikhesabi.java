package Avtomobil;

public class Elektrikhesabi {
    int toplamTuketim=0;
    double birimFiyat=0.7;
    double fatura=0;
    public  void  tuketimEkle(int aylikTuketim){
toplamTuketim+=aylikTuketim;
    }
    public void tuketimyaz(){
        System.out.println("toplamTuketim = " + toplamTuketim);
    }
public void  faturayaz(){
        double fatura=toplamTuketim*birimFiyat;
    System.out.println("fatura = " + fatura);
}
}
