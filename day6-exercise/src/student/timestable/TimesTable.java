package student.timestable;

public class TimesTable {
    public static void main(String[] args) {
        gettable();
    }

    public static void gettable() {
        for  (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
