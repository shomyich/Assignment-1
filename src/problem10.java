import java.util.Scanner;

public class problem10 {

    public static void main() {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(findGCD(a, b));
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
}