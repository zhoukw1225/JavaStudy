package student.q3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate firstDay = LocalDate.of(2022,2,3);
        System.out.println("请输入查询的月份");
        String time = sc.nextLine();
        time = time +"-1";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-M-d");
        LocalDate findDay = LocalDate.parse(time,dtf);
        int month = findDay.getMonthValue();

        List<LocalDate> RestList = new ArrayList<>();
        while (findDay.getMonthValue() == month) {
            int flag = 0;
            long daysBetween = java.time.temporal.ChronoUnit.DAYS.between(firstDay, findDay);
            System.out.print(findDay);
            if (daysBetween %3 == 0) {
                System.out.print("[休息]");
                flag +=1;
            }
            if(findDay.getDayOfWeek().getValue()  ==  6 ){
                System.out.print("[周六]");
                flag +=1;
            }else if(findDay.getDayOfWeek().getValue()  ==  7 ){
                System.out.print("[周日]");
                flag +=1;
            }
            System.out.println("");
            if(flag==2){
                RestList.add(findDay);
            }
            findDay = findDay.plusDays(1);
        }

        System.out.println("本月在周末的休息日有如下日期");
        for (LocalDate date : RestList) {
            if (date.getDayOfWeek().getValue() == 6){
                System.out.println(date+"[周六]");
            }else if(date.getDayOfWeek().getValue() == 7){
                System.out.println(date+"[周日]");
            }
        }
    }
}
