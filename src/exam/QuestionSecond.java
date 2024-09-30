package exam;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class QuestionSecond {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1990, 1, 1);
        LocalDate localDate1 = LocalDate.of(2023, 12, 31);
        int workDays = 0;
        int leapYears = 0;
        while (localDate1.isAfter(localDate)) {
            DayOfWeek dayOfWeek = localDate.getDayOfWeek();
            if (dayOfWeek.getValue() != 6 && dayOfWeek.getValue() != 7) {
                ++workDays;
            }
            localDate = localDate.plusDays(1);
        }
        localDate = LocalDate.of(1990, 1, 1);
        while (localDate1.isAfter(localDate)) {
            if (localDate.isLeapYear()) {
                leapYears++;
            }
            localDate = localDate.plusYears(1);
        }
        System.out.println("workDays = " + workDays);
        System.out.println("leapYears = " + leapYears);
    }

}
