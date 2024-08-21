package collection_framework;

public class StudentMap {
    private int id;
    private String name;

    public StudentMap(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentMap{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
