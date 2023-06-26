package Task_18;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(44);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(8);
        list.add(13);
        System.out.println(list.stream().distinct().filter(num -> num % 2 == 0).mapToInt(i -> i).sum());
    }
}
