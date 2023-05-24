package lesson_9;

public class Main {
    public static void main(String[] args) {
        System.out.println(FirstInterface.WHEELS_COUNT);
        BMW car = new BMW();
        car.signal();
    }
}
