package Lesson_15;

import java.util.*;

public class Lesson15Collection {
    public static void main(String[] args) {
        // может хранить дубликаты
        // время доступа к элементу через get очень быстро от единицы (1)
        // коллекция - динамиечский массив
        // все листы хранят эл-ты в порядке добавления.
      /*  ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Group");
        list.add("67");
        list.add("67");*/

        // System.out.println(list.get(3));
        // System.out.println(list.size());
        // addAll (одну колеекцию в другую можно добавить)
        // System.out.println(list.contains("Hello"));
        // System.out.println(list.isEmpty());
        // System.out.println(list.remove("67"));
        // System.out.println(list.set(1, "NEW_VALUE"));
        // String[] result = list.toArray(new String[list.size()]);
        //ArrayList<String> nums = new ArrayList<>{"1","2"}; исправить!!!
        ArrayList<String> listik = new ArrayList<>() {{
            add("5");
        }};

        ArrayList<String> countries = new ArrayList<>();

        System.out.println(countries.add("Belarus"));
        System.out.println(countries.add("Russia"));
        System.out.println(countries.add("Poland"));
        System.out.println(countries.set(1, "France"));
        System.out.println(countries.remove(2));
        System.out.println(countries.indexOf("Belarus"));
        System.out.println(countries.contains("France"));

// List можно писать что угодно. гибкость
        //линкед лист - двусвязный список
        // когда добавляем эл-т, то создается Нода, там внтури инфа и некст и привиус. ссылки на пред и след
        // лучше использовать большое количество данных. но аррай чаще.

        LinkedList<String> list = new LinkedList<>();

        // методы такие же. но есть необычные
        // удаление просиходит переопределением ссылок
        // время посикать О(n) то есть чем больше эл-ов, тем длительнее поиск.

        list.add("one");
        list.add("two");
        list.remove("two");
        // если линкед лист стоит в начале а не лист, то есть уникальные методы.
        list.addFirst("Hello");
        list.addLast("Bye");

        // есть альтернативные методы. но их никто не использует.
        list.peek(); // = getFirst
        list.poll(); // = remove
        list.pop(); // =

        LinkedList<String> countr = new LinkedList<>();
        countr.addFirst("Spain");
        countr.addFirst("Germany");
        countr.addLast("France");
        countr.addLast("UK");
        countr.removeFirst();
        countr.removeLast();
        countr.getFirst();
        countr.getLast();

        //Set не хранит дубликаты. только уник объекты храним <>
        // 3 основнеы реализации

        // HashSet <Integer> ... - работает на хэш таблицах, адптирован для быстрого поиска элемента. хаотичнго добавляет
        // для поиска элемента через метод и цикл фор своими силами и контейнс. но доставать не надо. бессмысленно.

        // LinkedHashSet<String> ... - последовательность сохранится, но медленнее работает

        // TreeSet <Integer> ... - все сортирует сразу.
    /*    TreeSet<Integer> list2 = new TreeSet<>(); // если задавать свой компаратор, то пишем new Comparator
        list2.add(3);
        list2.add(1);
        list2.add(7);
        System.out.println(list2.floor(5));
        System.out.println(list2.ceiling(5));*/

        // как несколько эл-ов удалить

    }
}
