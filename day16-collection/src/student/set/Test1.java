package student.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(2);
        set.add(5);
        set.add(4);

        System.out.println(set);
    }
}
