package task1;


public class PhD extends Student {
    private int publications;

    public PhD(String name, int id, double grade, int publications) {
        super(name, id, grade);
        this.publications = publications;
    }

    @Override
    public String toString() {
        return super.toString() + ", Аспирантура (Публикаций: " + publications + ")";
    }
}
