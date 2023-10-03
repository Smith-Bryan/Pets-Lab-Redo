package polymorphism;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets? ");
        int petNumbers = scanner.nextInt();

        List<Pets> pets = new ArrayList<>();

        for (int i = 0; i < petNumbers; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Your pet type? ");
            String petType = scanner1.next();
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("...And it's name? ");
            String petName = scanner2.next();
            switch (petType.toLowerCase()) {
                case "dog":
                    Dog dog = new Dog(petName, petType);
                    pets.add(dog);
                    break;
                case "cat":
                    Cat cat = new Cat(petName, petType);
                    pets.add(cat);
                    break;
                case "ostrich":
                    Ostrich ostritch = new Ostrich(petName,petType );
                    pets.add(ostritch);
                    break;
                default:
                    System.out.println("Pet Unsupported ");
            }

        }
        for (Pets pet:pets) {
            System.out.println(pet.getPetName());
            System.out.println(pet.getPetType());
            pet.speak(" talk");
        }
    }
}
