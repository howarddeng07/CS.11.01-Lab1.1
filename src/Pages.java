import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        System.out.println("How old are you?");
        Scanner scanner = new Scanner(System.in);
        int userAge = scanner.nextInt();
        int dateAge = (userAge / 2) + 7;
        System.out.println(userAge + "-year olds should date someone who is at least " + dateAge + " years old");
    }
}
