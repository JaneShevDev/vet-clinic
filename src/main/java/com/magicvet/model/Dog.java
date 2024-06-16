package main.java.com.magicvet.model;


import java.util.Objects;

public class Dog extends Pet{
    public final static String XS = "XS";
    public final static String S = "S";
    public final static String M = "M";
    public final static String L = "L";
    public final static String XL = "XL";
    private String size;

    public Dog(){}
    public Dog(String size){
        this.size = size;
    }

    @Override
    public String toString() {
        return "\n\tType: " + getType()
                + ", Sex: " + getSex()
                + ", Age: " + getAge()
                + ", Name: " + getName()
                + ", Size: " + getSize();
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
