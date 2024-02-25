package BankaHesabi;

public class musteri {
    int hesabId;
    String ad;
    String soyad;
    hesab musteriHesabi=new hesab();

    @Override
    public String toString() {
        return "musteri{" +
                "hesabId=" + hesabId +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", musteriHesabi=" + musteriHesabi +
                '}';
    }
}
