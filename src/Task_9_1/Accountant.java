package Task_9_1;

public class Accountant implements Profession {
    String job = "Accountant";

    @Override
    public void printProfession() {
        System.out.println(job);
    }
}
