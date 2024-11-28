interface Flyable {
    // 定义默认方法
    default void fly() {
        System.out.println("something flying");
    }
}

class Bird implements Flyable {
    // Bird可以不需要提供fly()的实现
}

public class DefaultMethodExample {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly(); // 输出： something flying
    }
}
