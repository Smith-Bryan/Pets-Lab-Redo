package polymorphism;

public class Dog extends Pets{


    public Dog(String petType, String petName) {
        super(petType, petName);
    }

    @Override
    public void speak(String speak) {
        super.speak(" Bark Bark");
    }
}
