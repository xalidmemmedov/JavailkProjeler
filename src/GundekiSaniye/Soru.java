package GundekiSaniye;

import java.util.Scanner;

import static GundekiSaniye.Sabitler.*;

public class Soru {
    public static void main(String[] args) {
        Scanner zamaniyaz=new Scanner(System.in);
        System.out.println("Zamani yaz=");
        System.out.print("Gun=");   int gun= zamaniyaz.nextInt();
        System.out.print("SaaT="); int saat= zamaniyaz.nextInt();
        System.out.print("DeqiqE="); int deqiqe= zamaniyaz.nextInt();

        System.out.print("SaniyE="); int saniye= zamaniyaz.nextInt();
        System.out.println("saniye = " + saniye);

        int toplamsaniye =
                gun *
                        birgundekiSaatSayi*birDeqiqedeSaniyeSayi*birSaatdaDeqiqeSayi
                        + saat * birSaatdaDeqiqeSayi*birDeqiqedeSaniyeSayi +
                        deqiqe * birDeqiqedeSaniyeSayi+
                        saniye;
        System.out.println("toplamsaniye = " + toplamsaniye);}
}
