package main.java.com.magicvet.model;

public class Cat extends Pet{
    private String age;
    public Cat(){}
    public Cat(String age){
        this.age = age;
    }

    @Override
    public String getAge() {
        return age;
    }
}
