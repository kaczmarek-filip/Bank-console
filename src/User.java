import java.util.ArrayList;

public class User {
    private final String login;
    private String password;
//    private static int userID = 0;
    private double balance;

    public static ArrayList<User> users = new ArrayList<>();

    User(String login, String password){
        this.login = login;
        this.password = password;
//        this.userID = userID;
        this.balance = 0;
    }
    public static void createUser(String login, String password){
        users.add(new User(login, password));
//        userID += 1;
    }

    public double getBalance() {
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

    public void setBalance(double balance) {
        this.balance += balance;
    }
}
