package student.object;

public class Test {
    public static void main(String[] args) {
        score s1 = new score();
        s1.name = "jack";
        s1.chinese = 90.5;
        s1.math = 82.5;
        s1.printAverageScore();
        s1.printTotalScore();
        int[] arr = new int[] {1,2,3};
    }
}
