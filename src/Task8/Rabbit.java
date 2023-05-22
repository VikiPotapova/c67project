package Task8;

public class Rabbit extends Animal {
    @Override
    void voice() {
        System.out.println("Squeak-squeak");
    }

    @Override
    void eat(String food) {
        if (food == "Grass") {
            System.out.println("I like eating grass");
        } else {
            System.out.println("I am disappointed...");
        }
    }
}
