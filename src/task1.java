import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Введите дату: день/месяц/год: ");
        String dannye = scanner.nextLine();
        System.out.println(dannye);
        Pattern pattern = Pattern.compile("([0-9][0-9]\\/[0-9][0-9]\\/[0-9][0-9][0-9][0-9])");
        Matcher matcher = pattern.matcher(dannye);
        if (matcher.find()) {
            Pattern pattern1 = Pattern.compile("(0[1-9]|1\\d|2\\d|3[0-1])\\/(01|0[3-9]|1[0-2])\\/(19\\d{2}|[2-9]\\d{3})|(0[1-9]|1\\d|2\\d)\\/(02)\\/(19\\d{2}|[2-9]\\d{3})");
            Matcher matcher1 = pattern1.matcher(dannye);
            if (matcher1.find()) {
                System.out.println("Введенное выражение является датой");
            }
            else {
                System.out.println("Введенное выражение не является датой");
            }
        }
        else {
            System.out.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy");
        }
    }
}