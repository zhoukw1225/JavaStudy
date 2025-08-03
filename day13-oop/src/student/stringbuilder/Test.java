package student.stringbuilder;

import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("abc");
        s.append("def");
        s.append(123);
        s.append(true).reverse();
        System.out.println(s);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(getArrayData(arr));
        System.out.println(getArrayData2(arr));
    }


    public static String getArrayData(int[] arr){
        if (arr == null){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i != arr.length - 1){
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static String getArrayData2(int[] arr){
        if (arr == null){
            return null;
        }
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(arr[i]+"");
        }
        return sj.toString();
    }
}
