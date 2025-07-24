package student.d2;

public class Test {
    public static void main(String[] args) {
        Student.printHello();
        Student s1 = new Student();
        s1.printHello();
        s1.score = 60;
        s1.printPass();

    }
}
