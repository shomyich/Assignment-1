import java.util.Scanner;

public class problem6 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int result = power(a, n);
        System.out.println(result);
    }
    // Function to calculate 'a' raised to the power 'n'
    public static int power(int a, int n) {
        if (n == 0) {  // Base case: if n is 0, return 1
            return 1;
        }
        // Recursive case: multiply 'a' with 'power(a, n-1)' to get 'a' raised to the power 'n'
        return a * power(a, n-1);
    }

}