package Lesson_10;

import java.util.Objects;

public class House implements Cloneable {
    private String color;
    private int price;
    private Dog dog;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "House" + " color= " + color + ", price = " + price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        House house =(House) super.clone();
        house.dog = (Dog) dog.clone();
        return house;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return price == house.price && Objects.equals(color, house.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, price);
    }
}
