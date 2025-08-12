import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        System.out.println("Login System");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter Id: ");
        int id = scanner.nextInt();

        System.out.println("Your name: " + name + "Your ID: " + id);

        scanner.close();
    }
}
