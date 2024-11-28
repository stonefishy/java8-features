import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Schedules.class)
@interface Schedule {
    String month() default "January";
    String day() default "First";
    int hour();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Schedules {
    Schedule[] value();
}

@Schedule(day = "Monday", hour=12)
@Schedule(month = "March", day = "Friday", hour=1)
class MySchedule{

}

public class RepeatingAnnotationExample {
    public static void main(String[] args) {
        Schedule[] annos = MySchedule.class.getAnnotationsByType(Schedule.class);
        for (Schedule s: annos) {
            System.out.printf("Month: %s, Day: %s, Hour: %d\n", s.month(), s.day(), s.hour());
        }
    }
}
