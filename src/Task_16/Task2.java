package Task_16;

import java.util.HashMap;

public class Task2 {
    public static void main(String[] args) {
        String[] array = new String[]{"hello", "world", "main", "men"};
        HashMap<String, String> map1 = new HashMap<>();
        for (String s : array) {
            char[] arr = s.toCharArray();
            String letter1 = String.valueOf(arr[0]);
            String letterN = String.valueOf(arr[arr.length - 1]);
            map1.put(letter1, letterN);
        }
        System.out.println(map1);
    }
}
