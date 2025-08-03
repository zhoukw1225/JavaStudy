package student.regex;

public class RegexTest {
    public static void main(String[] args) {

    }


    public static boolean checkQQ1(String qq){
        return qq != null && qq.matches("[1-9]\\d{5,19}");
    }

    public static boolean checkQQ(String qq) {
        if (qq == null||qq.startsWith("0")||qq.length()<7 ||qq.length()>20){
            return false;
        }
        for(int i=0;i<qq.length();i++){
            if(qq.charAt(i) < '0' || qq.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }
}
