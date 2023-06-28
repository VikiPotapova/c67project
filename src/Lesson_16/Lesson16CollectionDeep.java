package Lesson_16;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class Lesson16CollectionDeep {
    public static void main(String[] args) {
        /*PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("C");
        queue.add("A");
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);*/
        // сортирует под копотом но сорнтирует под копотом и удаляет первый. цирфы по возраст и по алфавиту

        //априори FIFO принцип реализует
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("A");
        deque.add("B");
        System.out.println(deque);
        deque.remove();
        System.out.println(deque);

        /* deque.remove();
        System.out.println(deque);*//*
        deque.removeLast();*/

        //Map <K,V> -K-key, V-value. ключи все уникальны!!! по ключу находим значение.

        /*HashMap<String, Integer> map = new HashMap<>();
        map.put("First", 100);
        map.put("Sec", 200);
        System.out.println(map);

        System.out.println(map.get("Sec"));
        System.out.println(map.containsKey("Sec"));
        System.out.println(map.containsValue(100));*/

       /* map.remove("Fisrt");
        map.remove("Sec",200);*/

       /* Set<String> resultKeys = map.keySet();// достать все ключи
        Collection<Integer> resultValues = map.values(); // или ArrayList <Integer> = new ArrayList<>(map.values);
        System.out.println(map.containsKey("Sec"));
        System.out.println(map.containsValue(100));*/
        // replace, size etc.

        // циклом в мапе можно отдельно перебрать ключи, отдельно вэльюс.
        // если коллизия возникает сразвивает по ключам,полям если совпадает, то перезаписывает. если нет то создает
        //новую Ноду и получается связный список, так от того занятого бакета в нект передается ссылку на новую ноду


    }
}
