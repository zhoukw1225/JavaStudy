package student.apiDemo;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("aa",23);
        Student student2 = new Student("aa",23);
        System.out.println(student2.equals(student1));
        System.out.println(student1 == student2);
        System.out.println(student2);
        System.out.println(student1);
        System.out.println(System.identityHashCode(student2));
        System.out.println(System.identityHashCode(student1));
        student2.toString();
    }

}
