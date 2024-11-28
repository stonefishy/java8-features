import java.util.function.*;

public class FunctionExample {
    public static void main(String[] args) {
        // 使用 Function 接口进行映射操作, Function 接口是一个接受一个参数并返回一个结果的函数。
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println(stringLength.apply("Hello"));  // 输出 5

        // 使用 Predicate 接口进行过滤操作, Predicate 接口是一个接受一个参数并返回一个布尔值的函数。
        Predicate<String> isNotEmpty = s -> !s.isEmpty();
        System.out.println(isNotEmpty.test("Hello"));  // 输出 true

        // 使用 Consumer 接口进行输出操作, Consumer 接口是一个接受一个参数但不返回值的函数。
        Consumer<String> printString = s -> System.out.println(s);
        printString.accept("Hello");  // 输出 Hello

        // 使用 Supplier 接口进行生成操作, Supplier 接口是一个不接受参数并返回一个值的函数。
        Supplier<String> helloSupplier = () -> "Hello";
        System.out.println(helloSupplier.get());  // 输出 Hello
    }
}