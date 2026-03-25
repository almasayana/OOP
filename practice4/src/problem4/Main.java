package problem4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Aya", 4.0));
        list.add(new Student("Sabi", 3.9));
        list.add(new Student("Nina", 3.2));

        Collections.sort(list);
        System.out.println("Sorted by GPA:");
        for (Student s : list) {
            System.out.println(s);
        }

        System.out.println("-----");

        Collections.sort(list, new NameComparator());
        System.out.println("Sorted by Name:");
        for (Student s : list) {
            System.out.println(s);
        }
    }
}