import java.util.Scanner;

public class problem3 {

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (isPrime(number, (int) Math.pow(number, 0.5))) { // We pass to the function the number that needs to be checked and the root of this number.(there is no need to pass a value more than the root, because this way our code will be most efficient.)
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }

    // Function to check if a number is prime or composite
    public static boolean isPrime(int n, int i) {
        if (i == 1) {  // Base case: if the divisor reaches 1, the number is prime
            return true;
        } else if (n % i == 0) {  // If the number is divisible by the divisor, the number is composite
            return false;
        } else {  // Recursively check for divisibility by decrementing the divisor
            return isPrime(n, i - 1);
        }
    }
}