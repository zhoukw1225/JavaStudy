package student.q4;

import java.util.Random;

public class bigPocket extends pocket {
    private int money;
    private String name;

    Random rand = new Random();

    public bigPocket(int number){
        this.money = rand.nextInt(31,101);
        this.name = "大红包"+number+"号";
    }

    @Override
    public String toString() {
        return "bigPocket{" +
                "money=" + money +
                ", name=" + name +
                '}';
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setNumber(String name) {
        this.name = name;
    }
}
