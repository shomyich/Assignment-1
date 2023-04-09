## Task 1
Description: *Find the minimum value of an array*

Explanation: This is a recursive function that finds the minimum value in an array of integers. It does this by comparing the last element of the array with the minimum value of the rest of the array, which is found recursively until there is only one element left.

Solution:
```java
     public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        } else {
            int minOfRest = findMin(arr, n - 1);
            return Math.min(arr[n - 1], minOfRest);
        }
    }
```

## Task 2
Description: *Find the average value of an array*

Explanation: This is a recursive function that calculates the average value of an array of integers. It does this by first checking if the array is empty (base case), in which case the average is 0. Otherwise, it calculates the average of the first n-1 elements in the array (recursive case) and uses that to calculate the average of the entire array.

Solution:
```java
    public static double arrayAverage(int[] arr, int n) {
        if (n == 0) {
            return 0;  
        } else {
            double avgOfRest = arrayAverage(arr, n-1);
            return ((arr[n-1] + (n-1)*avgOfRest) / n);
        }
    }
```

## Task 3
Description: *Check if a given integer is a prime number.*

Explanation: This is a recursive function that checks if a given integer is a prime number. It starts by checking if n is divisible by n-1 (base case) and returns true if it is. If n is not divisible by n-1, it checks if it is divisible by the current divisor i (recursive case). If it is, the function returns false (n is composite). If it is not divisible by i, it recursively calls itself with i-1 until i reaches 1 (the last possible divisor).

Solution:
``` java
    public static boolean isPrime(int n, int i) {
        if (i == 1) {  
            return true;
        } else if (n % i == 0) {  
            return false;
        } else { 
            return isPrime(n, i - 1);
        }
    }
```

## Task 4
Description: *Calculate the factorial of a given integer*

Explanation: This is a recursive function that calculates the factorial of a given integer. It does this by multiplying the integer with the factorial of the previous integer (n-1), until it reaches the base case of 0 or 1, where the factorial is 1. The function first checks if n is 0 or 1 (base case) and returns 1 if it is. If n is not 0 or 1, it calculates the factorial of n-1 (recursive case) and multiplies it with n to get the factorial of n.

Solution:
``` java
       public static int factorial(int n) {
        if (n == 0 || n == 1) { 
            return 1;
        } else { 
            return n * factorial(n - 1);
        }
    }
```
## Task 5
Description: *Calculate the nth Fibonacci number*

Explanation: This is a recursive function that calculates the nth Fibonacci number. It does this by adding the previous two Fibonacci numbers until it reaches the nth number. 

Solution:
``` java
    public static int fib(int n) {
        if (n <= 1) {  
            return n;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }
```
## Task 6
Description: *Find the power of a number*

Explanation: This is a recursive function that calculates the power of a number by multiplying the base with itself 'n' times. It does this recursively by reducing the power by 1 and multiplying the result with the base until the power becomes 0.

Solution:
``` java
    public static int power(int a, int n) {
        if (n == 0) { 
            return 1;
        }
        return a * power(a, n-1);
    }
```
## Task 7
Description: *Reverse an array*

Explanation:  This is a recursive function that reverses an array of integers by swapping the first and last elements, and then recursively calling the function on the remaining subarray until the entire array is reversed.

Solution:
``` java
     public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) { 
            return;
        }
        
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }
```
## Task 8
Description: *Check if a given string contains only digits*

Explanation: This is a recursive function that checks if a given string contains only digits (0-9). It does this by checking the first character of the string and recursively checking the rest of the string until the end of the string is reached. If any character is not a digit, the function returns false.

Solution:
``` java
    public static boolean isAllDigits(String s) {
        if (s.length() == 0) {  
            return true;
        }
        char firstChar = s.charAt(0);
        if (!Character.isDigit(firstChar)) { 
            return false;
        }
        return isAllDigits(s.substring(1));
    }
```
## Task 9
Description: *Find the binomial coefficient of two numbers*

Explanation: The binomial coefficient, denoted by C(n,k), is the number of ways to choose k items from a set of n distinct items. This function recursively calculates the binomial coefficient using the formula C(n,k) = C(n-1,k-1) + C(n-1,k), which states that the coefficient can be obtained by adding the coefficient of the previous row in Pascal's triangle to the coefficient of the previous row and same column.

Solution:
``` java
 public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {  
            return 1;
        } else {
            return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
        }
    }
```
    
    
    
## Task 10
Description: *Find the average value of an a*

Explanation: 

Solution:
``` java
 public static int findGCD(int a, int b) {
        if (b == 0) {  
            return a;
        } else { 
            return findGCD(b, a % b);
        }
    }
```