import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    static ArrayList<String> contactFirstNames = new ArrayList<>();
    static ArrayList<String> contactLastNames = new ArrayList<>();
    static ArrayList<String> contactPhoneNumbers = new ArrayList<>();
    static ArrayList<String> contactEmails = new ArrayList<>();
    static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        showPhoneBookMenu();
    }

    public static void showPhoneBookMenu() {
        System.out.println("""
                PhoneBook Menu:
                1. Add contact.
                2. Remove contact.
                3. Find contact by phone number.
                4. Find contact by first name.
                5. Find contact by last name.
                6. Edit contact.
                """);

        System.out.print("> ");
        int menuOption = inputScanner.nextInt();
        inputScanner.nextLine(); // Consume newline

        switch (menuOption) {
            case 1 -> addContact();
            case 2 -> removeContact();
            case 3 -> findContactByPhoneNumber();
            case 4 -> findContactByFirstName();
            case 5 -> findContactByLastName();
            case 6 -> editContact();
            default -> {
                System.out.println("Invalid option, try again.");
                showPhoneBookMenu();
            }
        }
    }

    public static void addContact() {
        System.out.print("Enter first name: ");
        String firstName = inputScanner.nextLine();
        contactFirstNames.add(firstName);

        System.out.print("Enter last name: ");
        String lastName = inputScanner.nextLine();
        contactLastNames.add(lastName);

        System.out.print("Enter phone number: ");
        String phoneNumber = inputScanner.nextLine();
        contactPhoneNumbers.add(phoneNumber);

        System.out.print("Enter email address: ");
        String email = inputScanner.nextLine();
        contactEmails.add(email);

        System.out.println("Contact saved!");
        showPhoneBookMenu();
    }

    public static void removeContact() {
        System.out.print("Enter the first name of the contact to remove: ");
        String name = inputScanner.nextLine();

        if (contactFirstNames.contains(name)) {
            int index = contactFirstNames.indexOf(name);

            contactFirstNames.remove(index);
            contactLastNames.remove(index);
            contactPhoneNumbers.remove(index);
            contactEmails.remove(index);

            System.out.println("Contact deleted.");
        } else {
            System.out.println("Contact does not exist.");
        }
        showPhoneBookMenu();
    }

    public static void findContactByPhoneNumber() {
        System.out.print("Enter the phone number you want to find: ");
        String number = inputScanner.nextLine();

        if (contactPhoneNumbers.contains(number)) {
            int index = contactPhoneNumbers.indexOf(number);
            System.out.println("First Name: " + contactFirstNames.get(index));
            System.out.println("Last Name: " + contactLastNames.get(index));
            System.out.println("Phone Number: " + contactPhoneNumbers.get(index));
            System.out.println("Email: " + contactEmails.get(index));
        } else {
            System.out.println("Contact does not exist.");
        }
        showPhoneBookMenu();
    }

    public static void findContactByFirstName() {
        System.out.print("Enter the first name of the person you want to find: ");
        String firstName = inputScanner.nextLine();

        if (contactFirstNames.contains(firstName)) {
            int index = contactFirstNames.indexOf(firstName);
            System.out.println("First Name: " + contactFirstNames.get(index));
            System.out.println("Last Name: " + contactLastNames.get(index));
            System.out.println("Phone Number: " + contactPhoneNumbers.get(index));
            System.out.println("Email: " + contactEmails.get(index));
        } else {
            System.out.println("Contact does not exist.");
        }
        showPhoneBookMenu();
    }

    public static void findContactByLastName() {
        System.out.print("Enter the last name of the person you want to find: ");
        String lastName = inputScanner.nextLine();

        if (contactLastNames.contains(lastName)) {
            int index = contactLastNames.indexOf(lastName);
            System.out.println("First Name: " + contactFirstNames.get(index));
            System.out.println("Last Name: " + contactLastNames.get(index));
            System.out.println("Phone Number: " + contactPhoneNumbers.get(index));
            System.out.println("Email: " + contactEmails.get(index));
        } else {
            System.out.println("Contact does not exist.");
        }
        showPhoneBookMenu();
    }

    public static void editContact() {
        System.out.print("Enter the first name of the contact you want to edit: ");
        String editName = inputScanner.nextLine();

        if (contactFirstNames.contains(editName)) {
            int index = contactFirstNames.indexOf(editName);

            System.out.print("Enter new first name: ");
            String newFirstName = inputScanner.nextLine();
            contactFirstNames.set(index, newFirstName);

            System.out.print("Enter new last name: ");
            String newLastName = inputScanner.nextLine();
            contactLastNames.set(index, newLastName);

            System.out.print("Enter new phone number: ");
            String newPhoneNumber = inputScanner.nextLine();
            contactPhoneNumbers.set(index, newPhoneNumber);

            System.out.print("Enter new email address: ");
            String newEmail = inputScanner.nextLine();
            contactEmails.set(index, newEmail);

            System.out.println("Contact updated!");
        } else {
            System.out.println("Contact does not exist.");
        }
        showPhoneBookMenu();
    }
}
