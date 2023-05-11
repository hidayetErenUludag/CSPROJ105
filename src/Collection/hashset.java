package Collection;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class hashset {
    public static void main(String[] args) {
        SortedSet<String> person = new TreeSet<>();
        person.add("hello");
        person.add("my ");
        person.add("name is");
        System.out.println(person);
    };
}
