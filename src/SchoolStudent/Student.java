package SchoolStudent;

public class Student {
    String name;
   
     int id;
static int sayac=1;

    public Student(String name) {
        this.name = name;
        this.id = sayac++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
