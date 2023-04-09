import java.util.Scanner;
public class problem5 {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println(fib(sc.nextInt()));
    }
    // Function to calculate the n-th Fibonacci number
    public static int fib(int n) {
        if (n <= 1) {  // Base case: if n is 0 or 1, return n
            return n;
        } else {  // Recursive case: add the previous two Fibonacci numbers to get the current one
            return fib(n-1) + fib(n-2);
        }
    }
}