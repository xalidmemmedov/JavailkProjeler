package StudentLesson;

public class MainDerslerOgrenci {
    public static void main(String[] args) {
Lesson ders1=new Lesson();
ders1.name="Alqoritma";
ders1.saat=4;

Lesson ders2=new Lesson();
ders2.name="Java";
ders2.saat=5;
Lesson ders3=new Lesson();
ders3.name="Test Tools";
ders3.saat=3;


Student ogr1=new Student();
ogr1.name="Xalid";
ogr1.maxsaat=10;


ogr1.dersekle(ders1);
ogr1.dersekle(ders2);
ogr1.dersekle(ders3);
ogr1.dersleriyazdir();
    }
}
