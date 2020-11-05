package day1;

public class PasswordTask7 {
    public static void main(String[] args) {


    String password = "a";
    boolean length = password.length() >= 8;
    boolean lower = password.matches(".*[a-z].*");
    boolean upper = password.matches(".*[A-Z].*");
    boolean number = password.matches(".*[0-9].*");
    boolean special = password.matches(".*[!@#].*");
    boolean valid = length && lower && upper && number && special;


    if (lower) {
        System.out.println("Password is valid");

    }
         else {
        System.out.println("Password is not valid");

    }
}

}
