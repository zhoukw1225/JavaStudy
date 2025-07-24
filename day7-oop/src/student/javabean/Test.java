package student.javabean;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("fq",60);
//        System.out.println(s1.getName());
//        System.out.println(s1.getScore());
        StudentOperater operater = new StudentOperater(s1);
        operater.printPass();
    }
}
