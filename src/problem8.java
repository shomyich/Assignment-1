import java.util.Scanner;
public class problem8 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        if (isAllDigits(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isAllDigits(String s) {
        if (s.length() == 0) {
            return true;
        }

        char firstChar = s.charAt(0);
        if (!Character.isDigit(firstChar)) {
            return false;
        }

        return isAllDigits(s.substring(1));
    }
}