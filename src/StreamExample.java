import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "C#", "Python", "Go", "JavaScript");

        // 将List转为stream，使用stream api操作
        String result = list.stream()
                .filter(s -> s.length() > 2)
                .map(s -> s.toUpperCase())
                .collect(Collectors.joining(", "));

        System.out.println(result); // 输出： JAVA, PYTHON, JAVASCRIPT
    }
}
