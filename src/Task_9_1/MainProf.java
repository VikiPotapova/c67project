package Task_9_1;

public class MainProf {
    public static void main(String[] args) {
        Director ceo = new Director();
        Accountant acc = new Accountant();
        Worker worker = new Worker();
        ceo.printProfession();
        acc.printProfession();
        worker.printProfession();
    }
}
