package Lesson_10;

public class Main {
    public static void main(String[] args) {
        //toString - преобразовывает объект в строкуж
        House house = new House();
        house.setColor("White");
        house.setPrice(1000);
        System.out.println(house);

        House house2 = new House();
        house2.setColor("Black");
        house2.setPrice(2000);

        System.out.println(house.hashCode());
        System.out.println(house2.hashCode());

        //коллизия - это когда хэшкод совпадает ( например, если нет не бесконечен, если больше объектов, то ...)
    }
}
