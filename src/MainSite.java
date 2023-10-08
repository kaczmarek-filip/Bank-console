import java.util.Scanner;

public class MainSite {

    static Scanner input = new Scanner(System.in);
    public static void main(String loggedUser, int loggedUserIndex) {
        System.out.println("Witaj " + loggedUser + " !");

        System.out.println();
        System.out.println("Twój stan konta: " + User.getBalance());
        System.out.println("Wybierz operację jaką chcesz wykonać");
        System.out.println("1 - Zarabiaj");
        System.out.println("2 - Kupuj"); // TODO: Dodać jakieś nagrody do kupienia
        System.out.println("3 - Przelej środki");
        System.out.println("4 - Zmień hasło");
        System.out.println("5 - Wyloguj");

        System.out.print("> ");
        int fromUser = input.nextInt();

        switch (fromUser){
            case 1:
                break;
            case 2:
                break;
            case 5:
                LandingPage.welcomeInfo();
                break;
        }

    }
}
