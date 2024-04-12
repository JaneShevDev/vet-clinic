package main.java.com.magicvet;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static String PASSWORD = "default";
    static Scanner SCANNER = new Scanner(System.in);
    static String FIRSTNAME_PATTERN = "^[a-zA-Z-]{3,}$";
    static String LASTNAME_PATTERN = "^[a-zA-Z-]{3,}$";
    static String EMAIL_PATTERN = "^[a-zA-Z0-9._%+-]+@[a-zA-Z.-]+\\.[a-zA-Z]{2,}$";

    public static void main(String[] args) {
run();
    }

    static void run() {
        if(auth()){
            registerNewClient();
        }
    }

    static boolean auth(){

        boolean accepted = false;
        for (int i = 0; i < 3; i++){
            System.out.println("Password: ");
            String input = SCANNER.nextLine();
            if(PASSWORD.equals(input)){
                accepted = true;
                break;
            }
            System.out.println("Access denied. Please check your password.");
        }
        System.out.println(accepted ? "Welcome to the Magic Vet!" : "Application has been blocked");
        return accepted;
    }
    static void registerNewClient(){
        System.out.println("Please provide client details.");
        System.out.print("First Name: ");
        String firstName = SCANNER.nextLine();
        if (isFirstNameValid(firstName)) {
            System.out.print("Last Name: ");
            String lastName = SCANNER.nextLine();
            if (isLastNameValid(lastName)) {
                System.out.print("Email: ");
                String email = SCANNER.nextLine();
                if (isEmailValid(email)) {
                    Client client = buildClient(email, firstName, lastName);
                    System.out.println("New client: " + client.firstName + " " + client.lastName + " (" + client.email + ")");
                } else {
                    System.out.println("Provided email is invalid.");
                }
            } else {
                System.out.println("Provided last name is invalid.");
            }
        } else {
            System.out.println("Provided first name is invalid.");
        }
    }

    static Client buildClient(String email, String firstName, String lastName) {
        Client client = new Client();
        client.email = email;
        client.firstName = firstName;
        client.lastName = lastName;
        return client;
    }

    static boolean isFirstNameValid(String firstName) {
        Pattern patternFirstName = Pattern.compile(FIRSTNAME_PATTERN);
        Matcher matcher = patternFirstName.matcher(firstName);
        return matcher.matches();
    }
    static boolean isLastNameValid(String lastName) {
        Pattern patternFirstName = Pattern.compile(LASTNAME_PATTERN);
        Matcher matcher = patternFirstName.matcher(lastName);
        return matcher.matches();
    }
    static boolean isEmailValid(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}