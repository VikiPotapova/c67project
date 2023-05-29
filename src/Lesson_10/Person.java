package Lesson_10;

import java.util.Date;
import java.util.Objects;

public class Person implements Cloneable {
    private String name;
    private int age;
    private int salary;
    private Cat cat;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && salary == person.salary && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return (int)(31 * name.hashCode() * cat.hashCode() * (new Date().getTime()));
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age= " + age +
                ", salary= " + salary +
                ", cat= " + cat +
                '}';
    }
}

