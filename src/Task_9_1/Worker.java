package Task_9_1;

public class Worker implements Profession{
    String job = "Worker";

    @Override
    public void printProfession() {
        System.out.println(job);
    }
}
