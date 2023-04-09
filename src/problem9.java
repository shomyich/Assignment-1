import java.util.Scanner;

public class problem9 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = binomialCoefficient(n, k);
        System.out.println(result);
    }

    // Function to calculate the binomial coefficient recursively
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {  // Base case: k is 0 or n, return 1
            return 1;
        } else {  // Recursive case: return the sum of two binomial coefficients
            return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
        }
    }
}