package student.q2;

import java.time.LocalDate;
import java.util.*;

public class q2 {
    public static void main(String[] args) {
        String userStrs = "10001:张三:男:1990-01-01#10002:李四:女:1989-01-09#10003:王五:男:1999-09-09#10004:刘备:男:1899-01-01" +
                "#10005:孙悟空:男:1900-01-01#10006:张三:女:1999-01-01#10007:刘备:女:1999-01-01#10008:张三:女:2003-07-01#10009:猪八戒:男:1900-01-01";

        String[] users = userStrs.split("#");
        List<User> userList = new ArrayList<>();
        for (String str : users) {
            String[] userinfo  = str.split(":");
            Long id = Long.valueOf(userinfo[0]);
            String name = userinfo[1];
            String gender = userinfo[2];
            LocalDate birthday = LocalDate.parse(userinfo[3]);
            userList.add(new User(id,name,gender,birthday));
        }

        Map<String,Integer> map = new HashMap<>();
        for (User user : userList) {
            if(map.containsKey(user.getUsername())){
                map.put(user.getUsername(),map.get(user.getUsername())+1);
            }else{
                map.put(user.getUsername(),1);
            }
        }

        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        for(Map.Entry<String,Integer> entry : entrySet){
            System.out.println(entry.getKey()+":"+entry.getValue()+"次");
        }
    }
}
