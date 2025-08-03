package student.polymorphism;

public class Student extends People{
    private double score;

    public Student() {
    }

    public Student(double score) {
        this.score = score;
    }

    public void run(){
         System.out.println("学生跑的贼快"+score);
     }
}
