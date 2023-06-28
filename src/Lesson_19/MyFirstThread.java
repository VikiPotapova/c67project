package Lesson_19;

public class MyFirstThread extends Thread {
    @Override
    public void run() {
        // все, что тут, будет выполняться потоком (! не путать со start!!!)))
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
