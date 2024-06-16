package main.java.com.magicvet.comparator;

import main.java.com.magicvet.model.Cat;

import java.util.Comparator;

public class CatAgeComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat cat1, Cat cat2) {
        return cat1.getAge().compareTo(cat2.getAge());
    }
}
