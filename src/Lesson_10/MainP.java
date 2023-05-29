package Lesson_10;

public class MainP {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person();
        person.setName("Coco");
        person.setCat(new Cat());
        System.out.println(person.getName());
        System.out.println(person);
        Person personClone = (Person) person.clone();
        personClone.setName("Lili");
        System.out.println(personClone.getName());
        System.out.println(personClone);
        System.out.println(person.equals(personClone));
        System.out.println(person.hashCode());


    }
}
