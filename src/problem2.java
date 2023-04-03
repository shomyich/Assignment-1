import java.util.Scanner;
public class problem2 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(arrayAverage(arr, n));
    }

    public static double arrayAverage(int[] arr, int n) {
        if (n == 0) {
            return 0;
        } else {
            return ((arr[n-1] + (n-1)*arrayAverage(arr, n-1)) / n);
        }
    }

}