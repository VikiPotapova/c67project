package Task8;

public class Tiger extends Animal {
    @Override
    void voice() {
        System.out.println("Roar");
    }

    @Override
    void eat(String food) {
        if (food == "Meat") {
            System.out.println("I like eating meat");
        } else {
            System.out.println("I am angry!");
        }
    }
}
