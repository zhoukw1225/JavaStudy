package student.enumDemo;

public enum A {
    X(){
        @Override
        public void go() {

        }
    }, Y {
        @Override
        public void go() {

        }
    }, Z {
        @Override
        public void go() {

        }
    };

    private int age;

    A(){}

    A(int age) {
        this.age = age;
    }

    public abstract void go();

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
