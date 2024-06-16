package main.java.com.magicvet;

import main.java.com.magicvet.comparator.CatAgeComparator;
import main.java.com.magicvet.comparator.DogSizeComparator;
import main.java.com.magicvet.model.Cat;
import main.java.com.magicvet.model.Dog;

import java.util.Arrays;

public class SandBox {
    public static void main(String[] args) {
        Dog[] dogs = {
                new Dog(Dog.M),
                new Dog(Dog.S),
                new Dog(Dog.XL),
                new Dog(Dog.XL),
                new Dog(Dog.XS),
                new Dog(Dog.S)
        };
        System.out.println("Dogs sorts by size:");
        Arrays.sort(dogs, new DogSizeComparator());
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
