package Task8;

public class MainAnimal {
    public static void main(String[] args) {
        Dog.voiceOfDog();
        Dog.eatDog("Milk");
        Tiger tiger = new Tiger();
        Rabbit rabbit = new Rabbit();
        tiger.voice();
        rabbit.voice();
        tiger.eat("Meat");
        rabbit.eat("Crisps");
    }
}
