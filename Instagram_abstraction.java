import java.util.Scanner;

abstract class Softwares { // Abstract class
    String user_name;
    String password;

    void user_input() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter username:");
        user_name = s.nextLine();
        System.out.println("Enter password:");
        password = s.nextLine();
        // s.close(); // Removed to prevent resource leak
    }

    void user_login() {
        System.out.println("WELCOME TO INSTAGRAM:");
        System.out.println("................");
        System.out.println("Please login here:");
    }

    abstract void app_open();  // Abstract method
}

class Instagram extends Softwares { // Child class
    void app_open() {
        while (true) {
            if (user_name.equals("Neha") && password.equals("123@")) {
                System.out.println("Successfully Login, App is open");
                break;
            } else {
                System.out.println("Invalid username and password. Please retry.");
                user_input();
            }
        }
    }
}

public class Instagram_abstraction {
    public static void main(String[] args) {
        Instagram i = new Instagram();
        i.user_login();
        i.user_input();
        i.app_open();
    }
}