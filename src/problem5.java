import java.util.Scanner;
public class problem5 {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println(fib(sc.nextInt()));
    }
    public static int fib(int n) {
        if (n <= 1) { return n;}
        else { return fib(n-1) + fib(n-2);}
    }
}