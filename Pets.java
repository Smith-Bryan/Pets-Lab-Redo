package polymorphism;

public class Pets {
    private String petType;
    private String petName;

    public Pets(String petType, String petName) {
        this.petType = petType;
        this.petName = petName;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void speak(String speak){
        System.out.println("The " + getPetName() + " Says " + speak);
    }
}
