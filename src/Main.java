import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n){
            case 1:
                problem1.main();
            case 2:
                problem2.main();
            case 3:
                problem3.main();
            case 4:
                problem4.main();
            case 5:
                problem5.main();
            case 6:
                problem6.main();
            case 7:
                problem7.main();
            case 8:
                problem8.main();
            case 9:
                problem9.main();
            case 10:
                problem10.main();
        }
    }
}
