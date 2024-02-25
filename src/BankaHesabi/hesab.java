package BankaHesabi;

public class hesab {
    int kocenPul=0;
    int ceklenPul=0;
    int hesabdakiPul=0;
    void pulkocur (int kocurulenPul){
        kocenPul+=kocurulenPul;
        hesabdakiPul+=kocurulenPul;
    }
    void pulcek(int cekilenpul){
        ceklenPul+=cekilenpul;
        hesabdakiPul-=cekilenpul;
    }
    @Override
    public String toString() {
        return "hesab{" +
                "kocenPul=" + kocenPul +
                ", ceklenPul=" + ceklenPul +
                ", hesabdakiPul=" + hesabdakiPul +
                '}';
    }



}
