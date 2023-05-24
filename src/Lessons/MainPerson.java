package Lessons;

public class MainPerson {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.fullName = "Harry";
        person1.age = 15;
        Person person2 = new Person("Peter", 20);
        person1.move();
        person2.move();
        person1.talk("hello");
        person2.talk("bye");
    }
}
