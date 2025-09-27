
import java.util.ArrayList;
import java.util.List;

abstract class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void sound();

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " says: Woof Woof!");
    }
}

class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " says: Meow Meow!");
    }
}

class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " says: Tweet Tweet!");
    }
}

public class OOPDemo {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Buddy", 3));
        animals.add(new Cat("Whiskers", 2));
        animals.add(new Bird("Tweety", 1));

        for (Animal animal : animals) {
            animal.sound();
            animal.eat();
            System.out.println(animal.getName() + " is " + animal.getAge() + " years old.\n");
        }
    }
}
