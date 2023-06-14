package Task_15;

import java.util.LinkedList;

public class AnimalMainTask2 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.setAnimal(new LinkedList<>());
        a.getAnimal().add("Zebra");
        a.getAnimal().add("Monkey");
        a.getAnimal().add("Tiger");
        a.getAnimal().add("Lion");
        System.out.println(a.getAnimal());
        System.out.println(a.getAnimal().remove());
    }
}
