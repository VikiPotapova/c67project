package Lesson_13;

public class Persone {
    private int age;
    public Persone(int age) {
        if (age < 18) {
            try {
                throw new UnderAgeException(age);
            } catch (UnderAgeException e) {
                e.printStackTrace();
            }
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
