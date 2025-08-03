package student.regex;

import java.util.Scanner;

public class RegexTest2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("输入时间");
            String str=sc.next();
//            5:12,17:12,05:12,5:06
            if (str.matches("([0-1]?[0-9]|2[0-3])(:[0-5][0-9]){1,2}")){
                System.out.println("输入时间正确");
                break;
            }else{
                System.out.println("您输入的时间有误");
            }
        }
    }
}
