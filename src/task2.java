import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2 {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        String password = task.nextLine();
        int n = password.length();
        if (n > 8) {
            Pattern pattern = Pattern.compile("([[0-9]|[a-zA-Z]|\\_]+)");
            Matcher matcher = pattern.matcher(password);
            if (matcher.find()) {
                Pattern pattern1 = Pattern.compile("([A-Z]+)");
                Matcher matcher1 = pattern1.matcher(password);
                if (matcher1.find()) {
                    Pattern pattern2 = Pattern.compile("([a-z]+)");
                    Matcher matcher2 = pattern2.matcher(password);
                    if (matcher2.find()) {
                        Pattern pattern3 = Pattern.compile("(\\d+)");
                        Matcher matcher3 = pattern3.matcher(password);
                        if (matcher3.find()) {
                            System.out.println("Пароль надежен");
                        }
                        else
                            System.out.println("Пароль ненадежен. Повторите ввод");
                    }
                    else
                        System.out.println("Пароль ненадежен. Повторите ввод");
                }
                else
                    System.out.println("Пароль ненадежен. Повторите ввод");
            }
            else
                System.out.println("Пароль ненадежен. Повторите ввод");
        } else
            System.out.println("Введите 8 и больше символов");
    }
}