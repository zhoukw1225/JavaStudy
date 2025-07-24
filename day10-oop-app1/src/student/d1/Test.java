package student.d1;

public class Test {
    public static void main(String[] args) {
        Student.name = "hajiq";
        Student s1 = new Student();
        s1.name = "牛牛";
        s1.age = 23;
        Student s2 = new Student();
        s2.age = 60;
        System.out.println(s1.name);
        System.out.println(s2.name);

        System.out.println(s1.age);
        System.out.println(s2.age);
    }
}
