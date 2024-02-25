package MektebTelebe;

public class telebe {
    int id;
    int sinif;
    String name;
    String fullName;

    public telebe(int id, int sinif, String name, String fullName) {
        this.id = id;
        this.sinif = sinif;
        this.name = name;
        this.fullName = fullName;
    }

    public telebe() {
        System.out.println("Telebe Qeyd edildi");
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", sinif=" + sinif +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\''
                ;
    }
}
