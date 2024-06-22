package main.java.com.magicvet;

import main.java.com.magicvet.comparator.CatAgeComparator;
//import main.java.com.magicvet.comparator.DogSizeComparator;
import main.java.com.magicvet.model.Cat;
import main.java.com.magicvet.model.Client;
import main.java.com.magicvet.model.Dog;
import main.java.com.magicvet.model.Pet;

import java.util.Arrays;
import java.util.Comparator;

public class SandBox {
    public static void main(String[] args) {
//        Dog[] dogs = {
//                new Dog(Dog.Size.M),
//                new Dog(Dog.Size.S),
//                new Dog(Dog.Size.XL),
//                new Dog(Dog.Size.XL),
//                new Dog(Dog.Size.XS),
//                new Dog(Dog.Size.S),
//                new Dog(Dog.Size.L)
//        };
//        System.out.println("Dogs sorts by size:");
//        Arrays.sort(dogs, new Comparator<Dog>() {
//            @Override
//            public int compare(Dog dog1, Dog dog2) {
//                return dog1.getSize().getValue() - dog2.getSize().getValue();
//            }
//        });
//        for(Dog dog: dogs){
//            System.out.println(dog.getSize());
//        }
//
//        Cat[] cats = {
//                new Cat("5"),
//                new Cat("2"),
//                new Cat("1"),
//                new Cat("6"),
//                new Cat("2"),
//                new Cat("3")
//        };
//        System.out.println("Cats sorts by age:");
//        Arrays.sort(cats, new CatAgeComparator());
//        for(Cat cat: cats){
//            System.out.println(cat.getAge());
//        }
//
//        Pet[] pets = {
//                new Pet(Pet.HealthState.HEALTHY),
//                new Pet(Pet.HealthState.CRITICAL),
//                new Pet(Pet.HealthState.UNHEALTHY),
//                new Pet(Pet.HealthState.WELL_FEELING),
//                new Pet(Pet.HealthState.WELL_FEELING),
//                new Pet(Pet.HealthState.HEALTHY)
//        };
//        System.out.println("Pets sorts by health:");
//        Arrays.sort(pets, new Comparator<Pet>() {
//            @Override
//            public int compare(Pet pet1, Pet pet2) {
//                return pet1.getHealthState().getValueHealth() - pet2.getHealthState().getValueHealth();
//            }
//        });
//        for(Pet pet: pets){
//            System.out.println(pet.getHealthState());
//        }

        System.out.println(new Client());
        System.out.println(new Cat());
        }
    }