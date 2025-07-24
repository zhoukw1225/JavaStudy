package student.type;
import java.util.Scanner;
public class scannerdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入年龄：");
        int age = sc.nextInt();

        System.out.println("请输入名称：");
        String name = sc.next();

        System.out.println("welcome" + name + age);
    }
}
