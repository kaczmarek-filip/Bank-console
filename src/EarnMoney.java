import java.util.Random;
import java.util.Scanner;

public class EarnMoney {

    static int randomFirst;
    static int randomSecound;
    static int result;
    static int resultFromUser;

    static Scanner input = new Scanner(System.in);

    public static void earn(int loggedUserIndex){

        randomFirst = getRandom();
        randomSecound = getRandom();

        result = randomFirst * randomSecound;

        System.out.println("Oblicz: " + result);
        System.out.println(randomFirst + " * " + randomSecound);
        System.out.print("> ");
        resultFromUser = input.nextInt();

        if(result == resultFromUser){
            System.out.println("Zyskujesz " + result * 5 + " zł");
            MainSite.main(User.users.get(loggedUserIndex).getLogin(), loggedUserIndex);
            User.users.get(loggedUserIndex).setBalance(result * 5); //TODO: Obmyślić jak dodawac do konkretnego konta
        } else {
            System.out.println("Błędny wynik");
            earn(loggedUserIndex);
        }
    }
    static int getRandom(){

        Random random = new Random();
        int randomInt = random.nextInt(100);

        return randomInt;
    }
}
