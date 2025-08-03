package student.interfaceDemo;

public class Test {
    public static void main(String[] args) {
        D d = new D();
        System.out.println(D.SCHOOL_NAME);
        System.out.println(d.SCHOOL_NAME);
        d.say();
    }
}
