package lesson_9;

public class BMW implements FirstInterface, SoundInterface { //cntl o
    private int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void start() {
        System.out.println("BMW starts moving");
    }

    @Override
    public void stop() {
        System.out.println("BMW stops");
    }


    @Override
    public void makeSound(String nameSong) {
        System.out.println(nameSong + " is playing");
    }
}
