package Task_13;

public class WrongPasswordException extends Exception {
    String info2;

    public WrongPasswordException() {
    }

    public WrongPasswordException(String info2) {
        this.info2 = info2;
    }

    @Override
    public String toString() {
        return "This is WrongPassword exception " + info2;
    }
}
