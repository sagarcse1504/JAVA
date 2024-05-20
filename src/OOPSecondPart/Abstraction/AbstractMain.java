package OOPSecondPart.Abstraction;

public class AbstractMain {
    public static void main(String[] args) {
        // Animal animal = new Animal();
        Cat cat = new Cat();
        cat.animalSound();
        cat.eat();
        cat.sleep();
        cat.color ="Green";


        Animal cat2 = new Cat();
        cat2.animalSound();
        cat2.sleep();
        cat2.legnumber = 4;


    }
}
