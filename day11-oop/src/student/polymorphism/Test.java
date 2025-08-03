package student.polymorphism;

public class Test {
    public static void main(String[] args) {
        People p1  = new Student(60);
        People p2  = new Teacher("java");
        if(p2 instanceof Student){
            Student s1 = (Student) p2;

        }
        p1.run();
        p2.run();
        System.out.println(p1);
        System.out.println(p2);
    }
}
