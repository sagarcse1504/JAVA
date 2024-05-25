package OOPSecondPart.Abstraction;

public class Cat extends Animal {
    public String color;

    @Override
    public void animalSound(){
        System.out.println("Cat says: Mew Mew");
    }
    public  void  eat(){
        System.out.println("Cat Eat milk and fish");
    }
}
