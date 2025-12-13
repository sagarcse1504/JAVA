package OOPSecondPart.AbstractInterface;

public class Dog  implements Animal {

    @Override
    public void animalSound(){
        System.out.println("Barking Dog Seldom Bite");
    }

    @Override
    public void sleep(){
        System.out.println("Dog is Sleeping");
    }

}
