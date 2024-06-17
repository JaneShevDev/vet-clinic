package main.java.com.magicvet;

import main.java.com.magicvet.comparator.CatAgeComparator;
//import main.java.com.magicvet.comparator.DogSizeComparator;
import main.java.com.magicvet.model.Cat;
import main.java.com.magicvet.model.Dog;

import java.util.Arrays;
import java.util.Comparator;

public class SandBox {
    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog(Dog.Size.M),
                new Dog(Dog.Size.S),
                new Dog(Dog.Size.XL),
                new Dog(Dog.Size.XL),
                new Dog(Dog.Size.XS),
                new Dog(Dog.Size.S)
        };
        System.out.println("Dogs sorts by size:");
        Arrays.sort(dogs, new Comparator<Dog>() {
            @Override
            public int compare(Dog dog1, Dog dog2) {
                return dog1.getSize().getValue() - dog2.getSize().getValue();
            }
        });

        for(Dog dog: dogs){
            System.out.println(dog.getSize());
        }
        Cat[] cats = {
                new Cat("5"),
                new Cat("2"),
                new Cat("1"),
                new Cat("6"),
                new Cat("2"),
                new Cat("3")
        };
        System.out.println("Cats sorts by age:");
        Arrays.sort(cats, new CatAgeComparator());
        for(Cat cat: cats){
            System.out.println(cat.getAge());
        }
    }
}
