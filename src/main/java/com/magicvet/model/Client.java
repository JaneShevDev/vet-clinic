package main.java.com.magicvet.model;

import com.sun.source.tree.UsesTree;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {
    private static final DateTimeFormatter CLIENT_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    private String firstName;
    private String lastName;
    private String email;
    private List<Pet> pets = new ArrayList<>();
    private final LocalDateTime registrationClientDate = LocalDateTime.now();
    @Override
    public String toString(){
        return "Client {"
                + "\n\tFirstName: " + firstName
                + ", LastName: " + lastName
                + ", Email: " + email
                + " }"
                + ", Registration Date: " + registrationClientDate.format(CLIENT_FORMATTER)
                + "\nPets {"
                + pets
                + " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(firstName, client.firstName)
                && Objects.equals(lastName, client.lastName)
                && Objects.equals(email, client.email)
                && Objects.equals(pets, client.pets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, pets);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPet(List<Pet> pets) {
        this.pets = pets;
    }

    public List<Pet> getPet() {
        return pets;
    }

    public void addPet(Pet pet){
        pets.add(pet);
    }
}