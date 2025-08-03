package student.q1;

import java.util.Random;

public class prisoner {
    private int num;
    private int place;

    public prisoner() {}
    public prisoner(int num, int place) {
        this.num = num;
        this.place = place;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }
}
