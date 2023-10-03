package polymorphism;

public class Ostrich extends Pets{


    public Ostrich(String petType, String petName) {
        super(petType, petName);
    }

    @Override
    public void speak(String speak) {
        super.speak(" I cannot speak");
    }
}
