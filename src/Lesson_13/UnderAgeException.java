package Lesson_13;

public class UnderAgeException extends Exception {
    private int age;

    public UnderAgeException(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "You entered: " + age + " . It is < 18 :(";
    }
}
