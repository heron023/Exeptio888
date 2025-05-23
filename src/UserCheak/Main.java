package UserCheak;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter personal number: ");
        String personalNumber = scanner.nextLine();

        System.out.print("Enter birth year: ");
        int birthYear = scanner.nextInt();

        System.out.print("Enter birth month: ");
        int birthMonth = scanner.nextInt();

        System.out.print("Enter birth day: ");
        int birthDay = scanner.nextInt();
        
        scanner.nextLine();

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = new User(firstName, lastName, personalNumber, birthYear, birthMonth, birthDay, username, password);

        if (user.isValidUser()) {
            System.out.println("User created successfully!");
            System.out.println(user);
        } else {
            System.err.println("Invalid input. Please check the constraints and try again.");
        }
    }
}
