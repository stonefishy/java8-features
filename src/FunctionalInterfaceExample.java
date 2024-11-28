// 定义一个函数式接口，只能包含一个抽象方法
@FunctionalInterface
interface Calculator {
    int calc(int a, int b);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // 函数式接口可以用Lambda来表示，简化代码
        Calculator addCalculator = (a, b) -> a + b;
        System.out.println(addCalculator.calc(1, 2)); // 输出 3

        Calculator minusCalculator = (a, b) -> a - b;
        System.out.println(minusCalculator.calc(1, 2)); // 输出 -1
    }
}
