import java.util.ArrayList;
import java.util.List;
//Using Function Interface to Iterate Collection with Lambda Expression
public class FunctionDemo {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(01, "srikanth"));
        list.add(new Student(04, "ram"));
        list.add(new Student(02, "raju"));
        list.add(new Student(03, "hari"));
        list.add(new Student(05, "shilpa"));

        for (Student s : list) {
            System.out.println(s.getsName() + ":" + s.getSno());
        }


    }
}
