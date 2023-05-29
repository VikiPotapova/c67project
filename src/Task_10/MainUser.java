package Task_10;

import java.util.Scanner;

public class MainUser {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user_1 = new User();
        user_1.setName("Bob");
        user_1.setAge(30);
        User user_2 = new User();
        user_2.setName("Bob");
        user_2.setAge(30);
        User user_3 = new User();
        user_3.setName("Olivia");
        user_3.setAge(25);
        user_3.setLaptop(new Laptop("asus", "vivobook", 8));
        System.out.println(user_1.toString());
        System.out.println(user_2.toString());
        System.out.println(user_3.toString());
        System.out.println(user_1.hashCode());
        System.out.println(user_2.hashCode());
        System.out.println(user_3.hashCode());
        System.out.println(user_1.equals(user_2));

        Scanner scanner = new Scanner(System.in);
        String cloneMethod = scanner.nextLine();
        int id = scanner.nextInt();

        if (cloneMethod.equals("shallow") && (id == user_1.hashCode() || id == user_2.hashCode())) {
            User userClone = (User) user_1.clone();
            System.out.println("Information of clone user: " + userClone.toString());
        } else if (cloneMethod.equals("deep") && id == user_3.hashCode()) {
            User clone;
            try {
                clone = user_3.clone();
                clone.setName("Yana");
                clone.setAge(20);
                clone.setLaptop(new Laptop("acer", "v5", 16));
                System.out.println("Information of clone user (changed): " + clone.getName() + " - " + clone.getAge() + "years old, laptop: " + clone.getLaptop());
            } catch (CloneNotSupportedException e) {
                System.out.println("The object cannot be cloned");
            }
        } else {
            System.out.println("Error. Wrong information. The user cannot be found");
        }
    }
}