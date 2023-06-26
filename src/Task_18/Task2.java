package Task_18;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(5, "Peter");
        hashMap.put(2, "Ann");
        hashMap.put(13, "Cliff");
        hashMap.put(9, "Jason");
        hashMap.put(0, "Andrea");
        hashMap.put(1, "Kate");
        hashMap.put(8, "Nancy");
        hashMap.put(10, "Sara");

        List<String> list = hashMap.entrySet().stream()
                .filter(a -> a.getKey().toString().matches("([12589])|13"))
                .filter(x -> x.getValue().length() % 2 != 0)
                .map(Map.Entry::getValue)
                .peek(e -> System.out.print(new StringBuilder(String.valueOf(e)).reverse() + " "))
                .toList();
    }
}
