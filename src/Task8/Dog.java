package Task8;

public class Dog extends Animal {
    private Dog() {
    }

    static void voiceOfDog() {
        System.out.println("Woof-woof");
    }

    static void eatDog(String food) {
        if (food == "Bone") {
            System.out.println("I like chewing bones");
        } else {
            System.out.println("Never mind, i eat everything");
        }

    }
}
