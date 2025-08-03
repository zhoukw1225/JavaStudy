package student.date;

import java.time.LocalDate;

public class LocalDateDemo {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();
        int dayOfYear = localDate.getDayOfYear();
        int dayOfMonth = localDate.getDayOfMonth();
        int dayOfWeek = localDate.getDayOfWeek().getValue();

        LocalDate ld2=localDate.withYear(2030);
        System.out.println(ld2);

        LocalDate ld3=ld2.plusMonths(1);
        System.out.println(ld3);

        LocalDate ld4=ld3.minusDays(1);
        System.out.println(ld4);

        LocalDate ld5 = LocalDate.of(2000,12,25);
        System.out.println(ld5);

        LocalDate ld6 = LocalDate.of(2000,12,25);
        System.out.println(ld6);

        System.out.println(ld6.equals(ld5));
        System.out.println(ld6.isAfter(ld4));
        System.out.println(ld6.isBefore(ld3));

    }
}
