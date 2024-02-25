package StudentLesson;

import java.util.ArrayList;

public class Student {
    String name;
    int maxsaat;
ArrayList<Lesson>dersleri=new ArrayList<>();

public void dersekle(Lesson ders){
    int indikisaat=0;
    for (Lesson d:dersleri)
        indikisaat+=d.saat;
    if (indikisaat+ders.saat<maxsaat)
dersleri.add(ders);
else
    System.out.println(ders.name+" ="+"Kreditinizi Kecdiniz");
}
public void dersleriyazdir(){
        System.out.println("Hormetli "+ name);
    System.out.println();
for (Lesson d:dersleri)
    System.out.println(d.name+" "+ d.saat);

}






}
