package question2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class QuestionSecond {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2019, 3, 1, 0, 0);
        LocalDateTime localDateTime1 = LocalDateTime.of(2024, 9, 30, 0, 0);
        int workHours = 0;
        while (localDateTime1.isAfter(localDateTime)) {
            DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();
            if (dayOfWeek.getValue() == 2) {
                workHours += 15;
            }
            localDateTime = localDateTime.plusDays(1);
        }

        System.out.println("workHours = " + workHours);
    }

}
