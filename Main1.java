import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if(username.equals("admin") && password.equals("1234"))
            System.out.println("Login Successful");
        else
            System.out.println("Invalid");
    }
}
Simport java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if(username.equals("admin") && password.equals("1234"))
            System.out.println("Login Successful");
        else
            System.out.println("Invalid");
    }
}
