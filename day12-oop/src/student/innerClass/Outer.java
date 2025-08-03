package student.innerClass;

public class Outer {
    static int age;

    public Outer() {
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Outer.age = age;
    }

    public static class Inner {
        private String name;

        public Inner(){}
        public Inner(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
