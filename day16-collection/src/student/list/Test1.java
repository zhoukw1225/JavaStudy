package student.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {
        Collection<String> c =  new ArrayList<String>();
        c.add("aa");
        c.add("bb");
        c.add("cc");
        c.add("dd");
        System.out.println(c);


        Iterator<String> iterator = c.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-------------------------");
        for(String s: c){
            System.out.println(s);
        }
        System.out.println("-------------------------");

        c.forEach(System.out::println);


    }
}
