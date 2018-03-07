package ex_2;

public class Main {

    public static void main(String[] args) {

        Runnable runny = new MyTask();
        runTask(runny);

        runTask(new MyTask());

        runTask(() -> System.out.println("Hello from MyTask"));

    }

    public static void runTask(Runnable runnable) {
        runnable.run();
    }

}
