import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateTimeExample {
    public static void main(String[] args) {
        // 获取当前的日期和时间
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current date and time: " + now);

        // 格式化日期
        LocalDate date = LocalDate.of(2018, 03, 13);
        System.out.println("Formatted date: " + date);

        // 时间加法
        LocalDateTime nextWeek = now.plusWeeks(1);
        System.out.println("One week later: " + nextWeek);
    }
}
