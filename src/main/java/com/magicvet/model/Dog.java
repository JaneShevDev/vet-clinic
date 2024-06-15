package main.java.com.magicvet.model;


import java.util.Objects;

public class Dog extends Pet{
    private String size;

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
