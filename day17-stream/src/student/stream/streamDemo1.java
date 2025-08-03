package student.stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamDemo1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三丰","张四分","李五");

//        names.forEach( System.out::println);
        List<String> list = new ArrayList<>();

//        for(String name : names){
//            if(name.startsWith("张")&&name.length()==3){
//                list.add(name);
//            }
//        }

        list = names.stream().filter(s -> s.startsWith("张") && s.length()==3).toList();

        list.forEach(System.out::println);

        Map<String, Integer> map = new HashMap<>();
        map.put("aaa",111);
        map.put("bbb",222);
        map.put("ccc",333);
        map.put("ddd",444);
        map.put("eee",555);

//        Set<Map.Entry<String,Integer>> set = map.entrySet();
//        Stream<Map.Entry<String,Integer>> stream = set.stream();
//        stream.filter(s ->s.getKey().equals("aaa"))
//                .forEach(e -> System.out.println(e.getKey() + "----->" + e.getValue()));

        map.entrySet().stream().filter(s ->s.getKey().contains("aaa"))
                .forEach(e -> System.out.println(e.getKey() + "----->" + e.getValue()));

        Map<String, Integer> map2 = map.entrySet().stream().filter(s -> s.getKey().contains("aaa"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(map2);


    }
}
