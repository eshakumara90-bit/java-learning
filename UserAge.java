import java.util.Scanner;

public class UserAge {
    public static void main(String[] args) {
        // Define a constant for the maximum plausible age
        final int MAX_AGE = 125;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");

        // --- 1. Input Validation Loop (Check for integer type) ---
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a whole number: ");
            // Consume the invalid token to prevent an infinite loop
            scanner.next(); 
        }

        int age = scanner.nextInt();

        // --- 2. Range Validation (Check for logical limits) ---
        if (age < 0) {
            System.out.println("Age cannot be negative! Please enter a valid age.");
        } else if (age > MAX_AGE) {
            System.out.println("The entered age (" + age + ") seems unrealistically high. Please enter a valid age (max " + MAX_AGE + ").");
        } else {
            System.out.println("You are " + age + " years old! Thank you.");
        }

        scanner.close();
    }
}