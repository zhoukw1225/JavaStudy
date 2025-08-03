package student.IntegerDemo;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a;
        Integer c= Integer.valueOf(15);
        System.out.println(b.getClass());
        System.out.println(c.getClass());
        System.out.println(c+b);
//        a.getClass()


    }
}
