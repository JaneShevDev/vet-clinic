package main.java.com.magicvet.service;

import main.java.com.magicvet.Main;
import main.java.com.magicvet.model.Client;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ClientService {
    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z.-]+\\.[a-zA-Z]{2,}$";
    private static final String FIRSTNAME_PATTERN = "^[a-zA-Z-]{3,}$";
    private static final String LASTNAME_PATTERN = "^[a-zA-Z-]{3,}$";
    public Client registerNewClient(){
        Client client = null;

        System.out.println("Please provide client details.");
        System.out.print("First Name: ");
        String firstName = Main.SCANNER.nextLine();
        if (isFirstNameValid(firstName)) {
            System.out.print("Last Name: ");
            String lastName = Main.SCANNER.nextLine();
            if (isLastNameValid(lastName)) {
                System.out.print("Email: ");
                String email = Main.SCANNER.nextLine();
                if (isEmailValid(email)) {
                    client = buildClient(email, firstName, lastName);
                    System.out.println("New client: "
                            + client.getFirstName() + " "
                            + client.getLastName() + " ("
                            + client.getEmail() + ")");
                } else {
                    System.out.println("Provided email is invalid.");
                }
            } else {
                System.out.println("Provided last name is invalid.");
            }
        } else {
            System.out.println("Provided first name is invalid.");
        }
        return client;
    }
    private static Client buildClient(String email, String firstName, String lastName) {
        Client client = new Client();
        client.setEmail(email);
        client.setFirstName(firstName);
        client.setLastName(lastName);
        return client;
    }
    private static boolean isEmailValid(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    private static boolean isFirstNameValid(String firstName) {
        Pattern patternFirstName = Pattern.compile(FIRSTNAME_PATTERN);
        Matcher matcher = patternFirstName.matcher(firstName);
        return matcher.matches();
    }
    private static boolean isLastNameValid(String lastName) {
        Pattern patternFirstName = Pattern.compile(LASTNAME_PATTERN);
        Matcher matcher = patternFirstName.matcher(lastName);
        return matcher.matches();
    }
}
