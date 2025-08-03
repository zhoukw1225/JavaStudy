package student.annotation;

public @interface Mytest {
    String aaa();
    boolean bbb()default true;
    String[] ccc();
}
