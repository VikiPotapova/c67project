package lesson_9;

@FunctionalInterface //гарантирует, что не будет два метода. помечается только над функциональными интерф.
// не обязательно ставить аннотацию. но она дополнительно проверит.
// с реализацией методы можно, но абстрактный один!!! для функицонального
public interface FirstFunctionalInterface {
    int shouldBeOneMethod();

    default void hello() {
        System.out.println("Hello");
    }
}
