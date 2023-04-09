import java.util.Scanner;

public class problem4 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));}

    // Function to calculate the factorial of a number 'n'
    public static int factorial(int n) {
        if (n == 0 || n == 1) {  // Base case: factorial of 0 or 1 is 1
            return 1;
        } else {  // Recursive case: multiply 'n' with the factorial of 'n-1'
            return n * factorial(n - 1);
        }
    }
}