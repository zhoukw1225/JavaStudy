package student.d2;

public class Student {
    double score;
    public void printPass(){
        System.out.println(score >= 60 ? "Pass" : "Fail");
    }
    public static void printHello(){
        System.out.println("hello");
    }
}
