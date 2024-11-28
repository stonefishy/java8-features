public class LambdaExample {
    public static void main(String[] args) {
        // 未使用 Lambda 表达式创建一个线程
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("This thread r1 is not created by Lambda expression");
            }
        };
        new Thread(r1).start();

        // 使用 Lambda 表达式创建一个线程
        Runnable r2 = () -> System.out.println("This thread r2 is created by Lambda expression");
        new Thread(r2).start();
    }
}
