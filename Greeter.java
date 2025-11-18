import java.util.Scanner;

public class Greeter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hello there! What is your name? ");
        String userName = scanner.nextLine();

        System.out.println("\n-------------------------------------");
        System.out.println("Welcome, " + userName + "! It's great to see you.");
        System.out.println("-------------------------------------");

        scanner.close();
    }
}
