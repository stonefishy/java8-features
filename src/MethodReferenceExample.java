import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "C#", "Python", "JavaScript");

        // 使用Lambda表达式
        list.forEach(s -> System.out.println(s));

        // 使用方法引用来替代 Lambda 表达式
        list.forEach(System.out::println);
    }
}
