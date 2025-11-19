import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = sc.next();

        System.out.print("Enter second word: ");
        String word2 = sc.next();

        // Print in reverse order
        System.out.println("Reversed order: " + word2 + " " + word1);

        sc.close();
    }
}