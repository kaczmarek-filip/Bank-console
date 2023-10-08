import java.util.ArrayList;

public class User {
    private final String login;
    private String password;
    private static double balance;

    public static ArrayList<User> users = new ArrayList<>();

    User(String login, String password){
        this.login = login;
        this.password = password;
        balance = 0;
    }
    public static void createUser(String login, String password){
        users.add(new User(login, password));
    }

    public static double getBalance() {
        return balance;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
