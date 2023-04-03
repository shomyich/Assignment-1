import java.util.Scanner;

public class problem3 {

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (isPrime(number, number/2)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }

    public static boolean isPrime(int n, int i) {
        if (i == 1) {
            return true;
        } else if (n % i == 0) {
            return false;
        } else {
            return isPrime(n, i - 1);
        }
    }
}