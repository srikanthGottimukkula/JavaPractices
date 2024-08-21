package collection_framework;

public class StudentDemo implements Comparable<StudentDemo> {

    private int id;
    private String name;
    private int age;


    public StudentDemo(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "StudentDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(StudentDemo o) {
//        return this.id-o.id;
//        return this.age-o.age;
        return this.name.compareTo(o.name);
    }


}
