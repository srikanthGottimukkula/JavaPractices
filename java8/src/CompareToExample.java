import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//Using Comparator with Lambda Expression
class ComparatorDemo {
    public static void main(String[] args) {

        List<Student> lists = new ArrayList<Student>();
        lists.add(new Student(1, "srikanth"));
        lists.add(new Student(2, "Ram"));
        lists.add(new Student(3, "Raju"));
        lists.add(new Student(4, "suresh"));

        for (Student list : lists) {
            System.out.println("Before Sorting:  " + list.getsName()+"********");
        }

        Comparator<Student> stdCom = (Student s1, Student s2) -> s1.getsName().compareTo(s2.getsName());
        Collections.sort(lists, stdCom);
        for(Student list1: lists){
            System.out.println("After Sorting !!"+list1.getsName());
        }


    }
}
