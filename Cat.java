package polymorphism;

public class Cat extends Pets{


    public Cat(String petType, String petName) {
        super(petType, petName);
    }

    @Override
    public void speak(String speak) {
        super.speak(" meow");
    }
}
