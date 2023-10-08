import java.util.Scanner;

public class SignIn {
    static Scanner input = new Scanner(System.in);

    public static String loggedUser;
    public static int loggedUserIndex;
    public static void collectData() {
        System.out.print("Podaj login: ");
        String login = input.next();
        System.out.print("Podaj hasło: ");
        String password = input.next();

        if(checkData(login, password)){
            System.out.println("Udało się zalogować");
            MainSite.main(loggedUser, loggedUserIndex);

        } else {
            System.out.println("Błędny login lub hasło");
            collectData();
        }
    }
    public static boolean checkData(String login, String password){

        for(int i = 0; i < User.users.size(); i++){
            if(User.users.get(i).getLogin().equals(login) && User.users.get(i).getPassword().equals(password)){
                loggedUser = User.users.get(i).getLogin();
                loggedUserIndex = i;
                return true;
            }
        }
        return false;
    }
}
