package student.q2;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();

        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"农家乐","野外拓展");
        map.put("张全蛋",list1);
        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2,"轰趴","野外拓展","健身房");
        map.put("李二狗",list2);

        List<String> list3 = new ArrayList<>();
        Collections.addAll(list3,"野外拓展");
        map.put("翠花",list3);

        List<String> list4 = new ArrayList<>();
        Collections.addAll(list4,"轰趴","健身房");
        map.put("小帅",list4);

        List<String> list5 = new ArrayList<>();
        Collections.addAll(list5,"农家乐");
        map.put("有容",list5);


        Map<String,Integer> select = new HashMap<>();
        map.forEach((key, activity) -> {
            for (String s : activity) {
                if (select.containsKey(s)) {
                    select.put(s, select.get(s) + 1);
                } else {
                    select.put(s, 1);
                }

            }
        });
//        select.entrySet().stream().forEach(entry -> System.out.println(entry.getKey()+"->"+entry.getValue()));
        Map.Entry<String,Integer> entry =
                select.entrySet().stream().max( (o1,  o2) ->o1.getValue().compareTo(o2.getValue())).get();

        select.entrySet().stream().filter( entry1 -> entry1.getValue() == entry.getValue()).forEach( entry1 ->
                System.out.println(entry1.getKey()));

        List<String> place = select.entrySet().stream().filter(entry1 -> entry1.getValue() == entry.getValue()).
                map(Map.Entry::getKey).toList();


        map.forEach((key, value) -> {
            boolean flag  = false;
            for (String s : value) {
                if (place.contains(s)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println(key);

            }
        });


    }


}
