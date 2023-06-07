package Task_13;

public class Homework13 {
    static boolean signIn(String login, String password, String confirmPassword) {
        if ((login.matches(".{20,}") || login.matches(".*\\s+.*"))) {
            try {
                throw new WrongLoginException(login);
            } catch (WrongLoginException exceptionLogin) {
                exceptionLogin.printStackTrace();
            }
        } else if (password.matches(".{20,}") || password.matches(".*\\s+.*") || password.matches("[^\\d]*")) {
            try {
                throw new WrongPasswordException(password);
            } catch (WrongPasswordException exceptionPassword) {
                exceptionPassword.printStackTrace();
            }
        } else if (!password.equals(confirmPassword)) {
            try {
                throw new WrongPasswordException();
            } catch (WrongPasswordException exceptionPassword) {
                exceptionPassword.printStackTrace();
            }
        } else {
            return true;
        }
        return false;
    }
}

