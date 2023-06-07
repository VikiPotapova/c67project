package Task_13;

public class WrongLoginException extends Exception {
    private String info;

    public WrongLoginException() {
    }

    public WrongLoginException(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "This is WrongLogin exception " + info;
    }
}