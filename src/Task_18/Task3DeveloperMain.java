package Task_18;

import java.util.Arrays;
import java.util.List;

public class Task3DeveloperMain {
    public static void main(String[] args) {
        Developer developer1 = new Developer(9, "Angela");
        Developer developer2 = new Developer(15, "Ann");
        Developer developer3 = new Developer(6, "Steve");
        Developer developer4 = new Developer(20, "Lewis");
        Developer developer5 = new Developer(30, "Anastasia");
        Developer developer6 = new Developer(11, "Andrew");
        List<Developer> list = Arrays.asList(developer1, developer2, developer3, developer4, developer5, developer6);
        list.stream().filter(a -> a.getId() > 10).filter(b -> b.getName().matches("An.*")).forEach(System.out::println);
    }
}
