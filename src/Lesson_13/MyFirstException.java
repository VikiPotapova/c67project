package Lesson_13;

public class MyFirstException extends RuntimeException {
    private String info;

    public MyFirstException(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Hello, this is my first exception: " + info;
    }
}
// чтобы его выбросить в классе пишем trow и создаем исключение
//  если не хотим вечно в трай кетч его проверять то наследуемся от рантайм