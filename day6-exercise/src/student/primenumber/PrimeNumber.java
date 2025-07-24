package student.primenumber;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        int n = findprime(num);
        System.out.println("总计共有"+n+"个素数");
    }
    public static int findprime(int a){
        int count = 0;
        for(int i=2;i<=a;i++){
            boolean ifprime =true;
            for (int j = 2; j <= Math.sqrt(i) ; j++) {
                if(i%j == 0){
                    ifprime =false;
                    continue;
                }

            }
            if(ifprime){
                    count++;
                    System.out.println(i);
            }
        }
        return count;
    }
}
