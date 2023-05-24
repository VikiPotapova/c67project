package lesson_9;

public interface FirstInterface {
    // интерфейс - это список методов, которые должны быть реализованы в классе, который имплементирует этот интерф.
    // все методы паблик
    // ниже представлены абстрактные методы (без кода)
    // любой класс может имплементить, но должен будет описать методы.
    // Методов может быть 0 !!!
    // могут встречаться и поля  и все они паблик файнал статик, можно не писать!!!
    // нельзя создавать объекты
    // функциональный интерфейс это интер с одним методом

    public final static int WHEELS_COUNT = 4; //cntrl  + shift + U

    void start();

    void stop();

    //default позволяет сделать тело, описать метод. поэтому можно не определять
    default void signal() {
        System.out.println("Some sound"); // можно не обязательно его писать в классе, который имплементит
        privateMethod();
    }

    static void changeSpeed(int newSpeed) {
        System.out.println("This is static method");
    }
    // закидываем в дефолтный и все ок
    private void privateMethod(){
        System.out.println("This is private method");
    }
}
