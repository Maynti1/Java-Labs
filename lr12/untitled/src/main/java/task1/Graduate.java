package task1;


public class Graduate extends Student {
    private String thesis;

    public Graduate(String name, int id, double grade, String thesis) {
        super(name, id, grade);
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return super.toString() + ", Магистратура (Тема: " + thesis + ")";
    }
}
