import java.util.Scanner;

public class problem10 {

    public static void main() {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(findGCD(a, b));
    }

    // Function to find the GCD of two numbers using Euclid's algorithm recursively
    public static int findGCD(int a, int b) {
        if (b == 0) {  // Base case: b is 0, return a as the GCD
            return a;
        } else {  // Recursive case: find the GCD of b and the remainder of a/b
            return findGCD(b, a % b);
        }
    }
}
