package Task_16;

import java.util.Arrays;
import java.util.HashMap;


public class Task1 {
    public static void main(String[] args) {
        String[] array = new String[]{"v", "i", "k", "k", "i"};
        Arrays.sort(array);
        HashMap<String, Boolean> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    map.put(array[j], true);
                } else {
                    map.put(array[j],false);
                }
            }
        }
            System.out.println(map);
        }
    }


