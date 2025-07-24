package student.yanzhengma;

import java.util.Random;

public class YanZhengMa {
    public static void main(String[] args) {
        System.out.println(codeproduce(5));
    }
    public static String codeproduce(int a){
        Random random = new Random();
        String code = "";
        for (int i = 0; i < a; i++) {
            int num = random.nextInt(3);
            if (num == 0) {
                code = code + random.nextInt(10);
            }else if (num == 1) {
                char ch = (char) (random.nextInt(26)+65);
                code = code + ch;
            }else{
                char ch = (char) (random.nextInt(26)+97);
                code = code + ch;
            }


        }
        return code;
    }
}
