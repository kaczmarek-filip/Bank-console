import java.util.Scanner;

public class LandingPage {

    static Scanner input = new Scanner(System.in);

    public static void welcomeInfo(){
        System.out.println("Witaj w banku");
        System.out.println();
        System.out.println("Wybierz co chces zrobić:");
        System.out.println();
        System.out.println("1 - Zaloguj się");
        System.out.println("2 - Załóż konto");

        welcomeFromUser();
    }
    public static void welcomeFromUser(){
        System.out.print("> ");
        int fromUser = input.nextInt();

        switch (fromUser){
            case 1:
                SignIn.collectData();
                break;
            case 2:
                Register.collectData();
                break;
        }
    }
}
