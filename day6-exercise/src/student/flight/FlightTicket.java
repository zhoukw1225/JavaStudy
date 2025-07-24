package student.flight;

public class FlightTicket {
    public static void main(String[] args) {
        System.out.println(flightprice(1200, 8, "头等舱"));
    }

    public static double flightprice(double p, int m, String c) {
        if (m >= 5 && m <= 10) {
            switch (c) {
                case "头等舱":
                    return p * 0.9;

                case "经济舱":
                    return p * 0.85;

                default:
                    System.out.println("输入正确的舱位");
                    return p;

            }
        } else if ((m >= 1 && m <= 4) || m == 11 || m == 12) {
            switch (c) {
                case "头等舱":
                    return p * 0.7;

                case "经济舱":
                    return p * 0.65;
                default:
                    System.out.println("输入正确的舱位");
                    return p;
            }
        } else {
            System.out.println("请输入正确的月份");
            return p;
        }
    }
}
