import java.util.ArrayList;
import java.util.Scanner;

public class Register {

    static Scanner input = new Scanner(System.in);

//    public static ArrayList<User> users = new ArrayList<>();

    public static void collectData() {
        System.out.print("Podaj login: ");
        String login = input.next();
        System.out.print("Podaj hasło: ");
        String password = input.next();
        System.out.print("Powtórz hasło: ");
        String repeatPassword = input.next();

        checkData(login, password, repeatPassword);
    }

    static void checkData(String login, String password, String repeatPassword) {

        if (password.equals(repeatPassword)) {
//            users.add(new User(login, password));
            User.createUser(login, password);
        } else {
            System.out.println("Hasła nie są takie same");
        }
        LandingPage.welcomeInfo();
        //TODO: Dodać wiecej warunków sprawdzania haseł
    }
}
