public class Mainn {
    public static void main(String[] args) {
        //1. создать шаблон, чертеж (создали китти класс)

        //2.Создание объекта кота
        int i = 5;
        Kitty firstKitty = new Kitty(); //ctrl + D дублированние последней строки
        Kitty secondKitty = new Kitty();
        Kitty thirdKitty = new Kitty("Begemot", 20);

        firstKitty.name = "Bobby";
        firstKitty.age = 60;
        firstKitty.weight = 70;
        firstKitty.breed = "Siamski";

        secondKitty.name = "Sam";
        secondKitty.age = 3;

        System.out.println(firstKitty.age);
        System.out.println(secondKitty.age);

        firstKitty.makeVoice();
        System.out.println(secondKitty.giveMeAgePlusOneYear());
    }
}
