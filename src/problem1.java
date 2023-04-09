import java.util.Scanner;

public class problem1 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMin(arr, n));
    }

    // Function to find the minimum value in an array of integers
    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];  // If there is only one element in the array, return that element
        } else {
            int minOfRest = findMin(arr, n - 1);  // Recursively find the minimum value of the rest of the array
            return Math.min(arr[n - 1], minOfRest);  // Compare the last element of the array with the minimum value of the rest of the array and return the smaller value
        }
    }
}
