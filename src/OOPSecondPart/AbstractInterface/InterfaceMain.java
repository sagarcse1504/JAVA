package OOPSecondPart.AbstractInterface;

public class InterfaceMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.animalSound();
        dog.sleep();

        Animal animal = new Dog();
        animal.sleep();
        animal.animalSound();

    }
}
