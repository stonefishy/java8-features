import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Java 8");
        // 如果值存在，则打印，如果值不存在，则打印默认值
        System.out.println(optional.orElse("Java")); // 输出 Java 8

        Optional<String> nullOptional = Optional.ofNullable(null);
        System.out.println(nullOptional.orElse("Java")); // 输出 Java

        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional.orElse("Java")); // 输出 Java
    }
}
