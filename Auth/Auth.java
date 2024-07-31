package Auth;

import java.util.Scanner;

public class Auth {
    public static void main(String[] args) {

        String name = "parth";
        String pass = "123";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username: ");
        String userName = sc.next();
        System.out.println("Enter password: ");
        String userPass = sc.next();

        if (userName.equals(name) && pass.equals(userPass)) {
            System.out.println("You can login");
        }
        else{
            System.out.println("cant login");
        }
    }
}
