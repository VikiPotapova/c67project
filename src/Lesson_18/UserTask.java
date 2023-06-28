package Lesson_18;

import java.util.Objects;
import java.util.Optional;

public class UserTask {
    public static void main(String[] args) {
       // User user = null;
        User user = new User();
        user.setName("Tony");
        Optional<User> userOptional = Optional.ofNullable(user);
        String result = userOptional.map(a -> a.getName()).orElse("DEFAULT");
        System.out.println(result);
    }


}
