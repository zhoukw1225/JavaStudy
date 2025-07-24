package student.method.define;

public class MethodDemo1 {
    public static void main(String[] args) {
    judge(7);
    int[] arr= new int[] {1,2,3,4,5};
    }


    public static int sum(int n){
        if (n == 1){
            return 1;
        }else {
            return sum(n - 1) + n;
        }
    }



    public static void judge(int n){
        if (n % 2 == 0){
            System.out.println("偶数");
        }else {
            System.out.println("奇数");
        }
    }
}
