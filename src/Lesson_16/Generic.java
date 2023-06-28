package Lesson_16;

public class Generic<T>{ // можно <T1, T2>
   private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
