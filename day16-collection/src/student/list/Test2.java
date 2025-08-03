package student.list;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));


        }
    }
}
