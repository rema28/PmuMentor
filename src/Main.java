import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

  AuthService auth = new AuthService();
  Scanner scanner = new Scanner(System.in);

  while (true) {
    System.out.println("\n--- PMU Mentor System ---");
    System.out.println("1. Register");
    System.out.println("2. Login");
    System.out.println("3. Exit");

    int choice = scanner.nextInt();
    scanner.nextLine();

    if (choice == 1) {
      System.out.println("Enter username: ");
      String username = scanner.nextLine();
      System.out.println("Enter password: ");
      String password = scanner.nextLine();
      System.out.println("Enter email: ");
      String email = scanner.nextLine();

      if (auth.register(username, password, email)) {
        System.out.println("Registration successful");
      } else {
        System.out.println("Username already exists");
      }
    }
    else if (choice == 2) {
      System.out.print("Enter username: ");
      String username = scanner.nextLine();
      System.out.println("Enter password; ");
      String password = scanner.nextLine();

      if (auth.login(username, password)) {
        System.out.println("Login successful");
      } else {
        System.out.println("Invalid username or password");
      }
    else if (choice == 3) {
      System.out.println("Goodbye");
      break;
    }
  }
  scanner.close();
  }
}
