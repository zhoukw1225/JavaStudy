package student.javabean;

public class StudentOperater {
    private Student student;
    public StudentOperater(Student student) {
        this.student = student;
    }

    public void printPass(){
        if(student.getScore()>=60){
            System.out.println(student.getName()+"你得了"+student.getScore()+"过啦");
        }else{
            System.out.println(student.getName()+"你得了"+student.getScore()+"补考吧");
        }
    }
}
