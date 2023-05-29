package Lesson_10;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        //toString - преобразовывает объект в строкуж
        House house = new House();
        house.setColor("White");
        house.setPrice(1000);
        house.setDog(new Dog());
        house.getDog().setName("Lola");



        House house2 = new House();
        house2.setColor("Black");
        house2.setPrice(2000);

        System.out.println(house.hashCode());
        System.out.println(house2.hashCode());


        System.out.println(house.equals(house2));
        System.out.println(house == house2);

        // коллизия - это когда хэшкод совпадает ( например, если нет не бесконечен, если больше объектов, то ...)
        // если хэшкод не переопределен, то он завязывается на области памяти, в кот-й лежит данный объект.
        // если переопределен, завязывается на полях.
        // toString-преобразуется объект в строку
        // equals сравнивает объекты между собой. берем один и в сосываем в другой. сравнивает ссылку по умолчанию, если
        // не переопределить, куда ведут эти ссылки.
        // можем приравнять их (но они тогда на один объект будут ссылать)
        // переопределенный equals будет сравнивать значения.
        // equals & hashCode контракт- если ты что-то из них пеереопределяешь, то надо оба. (в коллекциях важно)

        House newHouse = (House) house.clone(); // резалт будет обджект, поэтому надо преобразовать
        System.out.println(newHouse.getColor());
        newHouse.setColor("Red");
        System.out.println(newHouse.getColor());
        // когда кланирнование примимитивов, то в копии только меняется. если объект, то и в главном тоже.

        // getClass - позволяет получить метаданные вашего класса. для Рефлексии только нужно
        Class metaInfo = house.getClass();

        Class[] interfaces =  metaInfo.getInterfaces();
        for (Class classInterface : interfaces){
            System.out.println(classInterface.getName());
        }
    }
}
