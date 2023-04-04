import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("""
                 Select a problem (1-10):
                1 - minimum
                2 - average
                3 - is prime
                4 - finding “n!”
                5 - Fibonacci
                6 - power
                7 - reverse arr
                8 - is digits
                9 - binomial coefficient
                10 -  Euclidean Algorithm""");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        switch (n){
            case 1:
               System.out.println("""
                       Problem 1.
                       You are given a number “n” and an array of “n” elements,
                       write the function that returns minimum of them.\s""");
                problem1.main();
                break;
            case 2:
                System.out.println("""
                        Problem 2.
                        You are given a number “n” and an array of “n” elements,
                        write the function that returns average of them.\s""");
                problem2.main();
                break;
            case 3:
                System.out.println("""
                        Problem 3.
                        You are given a number “n”, write the function for checking
                        whether“n” is prime.
                        """);
                problem3.main();
                break;
            case 4:
                System.out.println("""
                        Problem 4.
                        You are given a number “n”, write the program using recursion for
                        finding “n!”""");
                problem4.main();
                break;
            case 5:
                System.out.println("""
                        Problem 5.
                        You are given a number “n”, write the function for finding n-th
                        elements in Fibonacci sequence using recursion.
                        """);
                problem5.main();
                break;
            case 6:
                System.out.println("""
                        Problem 6.
                        You are given numbers “a” and “n”, write the function that
                        returns “a^n”.
                        """);
                problem6.main();
                break;
            case 7:
                System.out.println("""
                        Problem 7.
                        You are given a number “n” and an array of “n” elements,
                        write the program that returns given array in reverse order
                        without using array data structure.
                        """);
                problem7.main();
                break;
            case 8:
                System.out.println("""
                        Problem 8.
                        You are given a string “s”, write the function for checking
                        whether “s” is all consists of digits.
                        """);
                problem8.main();
                break;
            case 9:
                System.out.println("""
                        Problem 9.
                        You are given numbers“n” and “k”,write the program that
                        finds Cnk (binomial coefficient)
                        """);
                problem9.main();
                break;
            case 10:
                System.out.println("""
                        Problem 10.
                        You are given “a” and “b”, write the function for finding
                        GCD(a, b) using recursion. (Hint: Euclidean Algorithm)
                        """);
                problem10.main();
                break;
            default: break;
        }
    }
}
