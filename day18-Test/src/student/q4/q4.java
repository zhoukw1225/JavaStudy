package student.q4;
/* WRONG
* */
public class q4 {
    public static void main(String[] args) {
        MyArrayList<String> a = new MyArrayList<>();
        System.out.println(a.size());
        a.add("aa");
        a.add("bb");
        a.forEach(System.out::println);
    }
}
