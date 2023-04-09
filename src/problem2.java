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

    // Function to calculate the average of an array of integers
    public static double arrayAverage(int[] arr, int n) {
        if (n == 0) {
            return 0;  // Base case: if the array is empty, the average is 0
        } else {
            // Recursive case: calculate the average of the first n-1 elements in the array and use that to calculate the average of the entire array
            double avgOfRest = arrayAverage(arr, n-1);
            return ((arr[n-1] + (n-1)*avgOfRest) / n);
        }
    }

}