package student.error;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        try {
            saveAge(160);
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("出现了bug");
//        }
    }
    public static void saveAge(int age){
        if(age > 0 && age < 150){
            System.out.println("年龄已被保存" + age);
        }else{
            throw new AgeIllegalRuntimeException("年龄未在合理范围");
        }
    }

}
