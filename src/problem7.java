import java.util.Scanner;

public class problem7 {
    // Function to reverse an array in place recursively
    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {  // Base case: if start index is greater than or equal to end index, return
            return;
        }
        // Swap elements at start and end indices
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        // Recursive case: call reverseArray with incremented start index and decremented end index
        reverseArray(arr, start + 1, end - 1);
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArray(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
