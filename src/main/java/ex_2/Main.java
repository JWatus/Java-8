package ex_2;

public class Main {

    public static void main(String[] args) {

        runTask(new ex_2.MyTask());

        runTask(() -> System.out.println("Hello from ex_2.MyTask"));

    }

    public static void runTask(Runnable runnable) {
        runnable.run();
    }

}
