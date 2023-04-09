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

    // Function to check if a given string contains all digits recursively
    public static boolean isAllDigits(String s) {
        if (s.length() == 0) {  // Base case: if string is empty, return true
            return true;
        }
        char firstChar = s.charAt(0);
        if (!Character.isDigit(firstChar)) {  // If first character is not a digit, return false
            return false;
        }
        // Recursive case: call isAllDigits with substring starting from index 1
        return isAllDigits(s.substring(1));
    }

}