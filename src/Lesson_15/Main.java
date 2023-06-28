package Lesson_15;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Person> list = new HashSet<>();
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        for (Person p : list){
            System.out.println(p);
        }
        list.remove(p1);
        list.remove(p2);
        System.out.println(list.contains(p3));
    }
}
