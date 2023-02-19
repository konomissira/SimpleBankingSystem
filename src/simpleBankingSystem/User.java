package simpleBankingSystem;

public class User {
    String login;
    String firstName;
    String lastName;

    public User(String login, String firstName, String lastName) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return login + " " + firstName + " " + lastName;
    }

    public static void main(String[] args) {

    }
}
