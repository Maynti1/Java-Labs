package task1;

public class Undergraduate extends Student {
    private int year;

    public Undergraduate(String name, int id, double grade, int year) {
        super(name, id, grade);
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString() + ", Бакалавриат (" + year + " курс)";
    }
}
