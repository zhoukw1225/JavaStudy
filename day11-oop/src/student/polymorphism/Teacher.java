package student.polymorphism;

public class Teacher extends People{
    private String skill;

    public Teacher() {
    }

    public Teacher(String skill) {
        this.skill = skill;
    }

    public void run(){
        System.out.println("老师跑得气喘吁吁"+skill);
    }
}
